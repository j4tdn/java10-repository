-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT * FROM mathang;
SELECT mh.MaMH, 
		mh.TenMH,
		mh.GiaBan
FROM MatHang mh
WHERE mh.MaLoai = ( 
SELECT loaihang.MaLoai 
FROM loaihang
WHERE TenLoai  = 'Giày dép')
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng cóSELECT * FROM MatHang;
SELECT mh.MaMH, 
		mh.TenMH,
		lh.MaLoai,
        lh.TenLoai,
        max(GiaBan) AS GiaBanCaoNhat
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai ;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT 	lh.*,
		SUM(kcmh.SoLuong) AS TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
 GROUP BY lh.MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
   -- Điều kiện tổng số lượng > 20 mặt hàng
SELECT 	lh.*,
		SUM(kcmh.SoLuong) AS TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
 GROUP BY lh.MaLoai
 HAVING TongSoLuong > 20;

-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
WITH Tong_SLMH as( SELECT 	lh.*, mh.TenMH,
		SUM(kcmh.SoLuong) as TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
GROUP BY mh.MaLoai,mh.TenMH)
SELECT MaLoai,TenMH,max(TongSoLuong) FROM Tong_SLMH
GROUP BY MaLoai;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT mh.MaMH,
		lh.MaLoai,
        lh.TenLoai,
        AVG(GiaBan) GiaBanTB
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT 	lh.*, mh.TenMH,
		SUM(kcmh.SoLuong) as TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
GROUP BY lh.tenloai
ORDER BY TongSoLuong DESC
LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

SELECT mh.MaMH, mh.TenMH, mh.MaLoai, dh.MaDH
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaDH
JOIN DonHang dh
	ON ctdh.MaDH = dh.MaDH 
WHERE mh.MaLoai = 2 AND dh.MaDH = 100100;
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT mh.MaMH, 
		mh.TenMH, 
		dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
WHERE DAY(ThoiGianDatHang) = 28
	AND MONTH(ThoiGianDatHang) = 11
	AND mh.MaLoai = 2;
    
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
SELECT * FROM mathang;
SELECT mh.MaMH, 
		mh.TenMH, 
		dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
WHERE  mh.Maloai IN (
SELECT loaihang.Maloai 
FROM loaihang 
WHERE loaihang.TenLoai="Mũ")
AND DATE(dh.ThoiGianDatHang) != "19-2-14";

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE mathang set GiaBan =199 WHERE maloai in (
select maloai from loaihang
where tenloai="Áo");

-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)
DROP TABLE  `loaihang_backup`;
CREATE TABLE `loaihang_backup` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(255) NOT NULL,
  PRIMARY KEY (`MaLoai`)
);
  --  Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
INSERT INTO loaihang_backup SELECT * FROM loaihang;
SELECT * from loaihang_backup;

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
SELECT mh.MaMH, 
		mh.TenMH, 
		dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
WHERE DAY(ThoiGianDatHang) = 11
	AND MONTH(ThoiGianDatHang) = 23
	AND mh.MaLoai = 2;
    
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
WITH Tong_SLMH as( SELECT 	lh.*, mh.TenMH,
		SUM(kcmh.SoLuong) as TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
WHERE mh.Maloai IN(
SELECT loaihang.Maloai 
FROM loaihang 
WHERE loaihang.TenLoai IN ("Áo","Quần"))
GROUP BY mh.MaLoai,mh.TenMH)
SELECT MaLoai,TenMH,max(TongSoLuong) as TongSoLuong FROM Tong_SLMH
GROUP BY MaLoai;

-- 31. Tính tổng tiền cho đơn hàng 02
   --  Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT dh.MaDH, SUM(mh.GiaBan * ctdh.SoLuong) as TongTien
FROM donhang dh, chitietdonhang ctdh, mathang mh 
WHERE  dh.MaDH=ctdh.MaDH and  mh.MaMH=ctdh.MaMH and dh.MaDH=2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
--   SoDH   ChiTietDonHang         TongTien
--    02   TenMH:GiaBan:SoLuong       100
SELECT dh.MaDH,mh.TenMH, mh.GiaBan, ctdh.SoLuong,SUM(mh.GiaBan * ctdh.SoLuong) as TongTien
FROM donhang dh, chitietdonhang ctdh, mathang mh 
WHERE  dh.MaDH=ctdh.MaDH and  mh.MaMH=ctdh.MaMH and dh.MaDH=2
GROUP BY  dh.MaDH,mh.TenMH, mh.GiaBan, ctdh.SoLuong;