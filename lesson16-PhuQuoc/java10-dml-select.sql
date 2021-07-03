-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

SELECT *
FROM MatHang
WHERE MaLoai = (SELECT MaLoai
				FROM LoaiHang
                WHERE TenLoai = 'Giày dép')
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

SELECT mh.MaMH, 
		lh.MaLoai,
        lh.TenLoai,
        max(GiaBan) as Gia
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai ;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống

SELECT lh.*,
        SUM(kcmh.SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMh
GROUP BY MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng

SELECT 	lh.*,
		SUM(kcmh.SoLuong) TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
 GROUP BY lh.TenLoai 
 HAVING TongSoLuong > 20;
 
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT * FROM kichcomathang;
SELECT * FROM loaihang;
SELECT * FROM MatHang;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT lh.*,
        AVG(mh.GiaBan) AVGGia
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMh
GROUP BY MaLoai;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT lh.*,
        (SUM(kcmh.SoLuong) - SUM(ctdh.SoLuong)) LuongHangCon
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
GROUP BY MaLoai
ORDER BY LuongHangCon DESC
LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT * FROM donhang;
SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
WHERE MaLoai = (SELECT MaLoai
				FROM LoaiHang
                WHERE MaLoai = 2)
	AND ctdh.MaDH = 1; -- 100100
    
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT * FROM DonHang;
SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON ctdh.MaDH = dh.MaDH
WHERE MaLoai = (SELECT MaLoai
				FROM LoaiHang
                WHERE MaLoai = 2)
	AND DAY(ThoiGianDatHang) = 18 AND MONTH(ThoiGianDatHang)= 12 ; -- 28 / 11
    
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON ctdh.MaDH = dh.MaDH
WHERE TenMH NOT LIKE '%Mũ%'
	AND cast(ThoiGianDatHang as DATE) = '2019-02-14' ; -- 28 / 11

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

UPDATE mathang
SET GiaBan = 199
WHERE MaLoai = (SELECT MaLoai
				FROM loaihang
				WHERE TenLoai = 'Áo');
                
-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)

CREATE TABLE LoaiHang_BACKUP LIKE LoaiHang;

 --    Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
 
INSERT INTO LoaiHang_BACKUP SELECT * FROM LoaiHang;
SELECT * FROM LoaiHang_BACKUP;

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11

SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON ctdh.MaDH = dh.MaDH
WHERE MaLoai = (SELECT MaLoai
				FROM LoaiHang
                WHERE MaLoai = 2)
	AND DAY(ThoiGianDatHang) = 23 AND MONTH(ThoiGianDatHang)= 11 ;
    
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
SELECT * FROM LoaiHang;
SELECT mh.*,
        SUM(kcmh.SoLuong) LuongHangTonKho
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaMH
WHERE lh.TenLoai ='Áo'
	OR lh.TenLoai ='Quần'
GROUP BY MaLoai
ORDER BY LuongHangTonKho DESC
LIMIT 2;

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

SELECT 	dh.MaDH,
		SUM(ROUND(ctdh.SoLuong * mh.GiaBan)) TongTien
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
where dh.MaDH = 2
GROUP BY MaDH;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
--     SoDH   ChiTietDonHang         TongTien
--     02   TenMH:GiaBan:SoLuong       100

SELECT 	dh.MaDH, -- as sohd
		mh.TenMH,
        mh.GiaBan,
        ctdh.SoLuong,
		SUM(ROUND(ctdh.SoLuong * mh.GiaBan)) TongTien
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
where dh.MaDH = 2
GROUP BY MaDH;