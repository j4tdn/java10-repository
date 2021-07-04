-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT * 
FROM mathang mh 
WHERE mh.MaLoai = (SELECT lh.MaLoai 
					FROM loaihang lh
					WHERE lh.TenLoai = 'Giày dép')
ORDER BY mh.GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT lh.*, mh.TenMH, MAX(mh.GiaBan) GiaBan
FROM mathang mh
JOIN loaihang lh
	ON mh.MaLoai = lh.MaLoai
GROUP BY lh.MaLoai;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT lh.*, SUM(kcmh.Soluong) SoLuong
FROM loaihang lh
JOIN mathang mh
	ON mh.MaLoai = lh.MaLoai
JOIN kichcomathang kcmh
	ON kcmh.MaMH = mh.MaMH
GROUP BY lh.MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
-- Điều kiện tổng số lượng > 20 mặt hàng
SELECT lh.*, SUM(kcmh.Soluong) SoLuong
FROM loaihang lh
JOIN mathang mh
	ON mh.MaLoai = lh.MaLoai
JOIN kichcomathang kcmh
	ON kcmh.MaMH = mh.MaMH
GROUP BY lh.MaLoai
HAVING SUM(kcmh.Soluong) > 20;
                    
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT lh.*, mh.TenMH, MAX(kcmh.Soluong) SoLuong
FROM loaihang lh
JOIN mathang mh
	ON mh.MaLoai = lh.MaLoai
JOIN kichcomathang kcmh
	ON kcmh.MaMH = mh.MaMH
GROUP BY lh.MaLoai;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT lh.*, round(AVG(mh.GiaBan), 2) GiaBanTrungBinh
FROM mathang mh
JOIN loaihang lh
	ON mh.MaLoai = lh.MaLoai
GROUP BY lh.MaLoai;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 1
SELECT mh.*, ctdh.MaDH 
FROM mathang mh
JOIN loaihang lh
	ON lh.MaLoai = mh.MaLoai
JOIN chitietdonhang ctdh
	ON ctdh.MaMH = mh.MaMH
WHERE mh.MaLoai = 2 
		AND ctdh.MaDH = 1;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 18/12
SELECT mh.*
FROM mathang mh
JOIN chitietdonhang ctdh
	ON ctdh.MaMH = mh.MaMH
JOIN donhang dh
	on ctdh.MaDH = dh.MaDH
WHERE mh.MaLoai = 2
		AND cast(dh.ThoiGianDatHang as DATE) = '2020-12-18';
        
-- 26. Liệt kê những mặt hàng là 'Quần' không bán được trong ngày 14/02/2019
SELECT mh.* 
FROM mathang mh
JOIN loaihang lh
	ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai = 'Quần' AND mh.TenMH NOT IN (SELECT mh.TenMH
												FROM mathang mh
												JOIN loaihang lh
													ON lh.MaLoai = mh.MaLoai
												JOIN chitietdonhang ctdh
													ON ctdh.MaMH = mh.MaMH
												JOIN donhang dh
													on ctdh.MaDH = dh.MaDH
												WHERE lh.TenLoai = 'Quần'
														AND cast(dh.ThoiGianDatHang as DATE)  = '2020-12-18');

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE mathang
SET GiaBan = 199
WHERE MaLoai = (SELECT MaLoai
				FROM loaihang
				WHERE TenLoai = "Áo");
                
-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)
-- Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
CREATE TABLE LoaiHang_BACKUP(MaLoai int, TenLoai nvarchar(50));

INSERT INTO LoaiHang_BACKUP 
SELECT * FROM loaihang;

SELECT * FROM LoaiHang_BACKUP;

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
SELECT mh.*
FROM mathang mh
JOIN chitietdonhang ctdh
	ON ctdh.MaMH = mh.MaMH
JOIN donhang dh
	ON ctdh.MaDH = dh.MaDH
WHERE mh.MaLoai = 2 
		AND cast(dh.ThoiGianDatHang as DATE) = '2020-11-23';
        
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 31. Tính tổng tiền cho đơn hàng 02
-- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT dh.MaDH ,SUM(mh.GiaBan * ctdh.SoLuong) TongTien
FROM DonHang dh
JOIN ChiTietDonHang ctdh
	ON dh.MaDH = ctdh.MaDH
JOIN MatHang mh
	ON mh.MaMH = ctdh.MaMH
WHERE dh.MaDH = 2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
--    SoDH   ChiTietDonHang         TongTien
--    02   TenMH:GiaBan:SoLuong       100
SELECT dh.MaDH, 
		group_concat(concat(mh.TenMH, ':', mh.GiaBan, ':', ctdh.SoLuong) SEPARATOR ', ') ChiTietDonHang, 
        SUM(mh.GiaBan * ctdh.SoLuong) TongTienMatHang
FROM mathang mh
JOIN chitietdonhang ctdh
	ON ctdh.MaMH = mh.MaMH
JOIN donhang dh
	ON ctdh.MaDH = dh.MaDH
 WHERE dh.MaDH = 2;   