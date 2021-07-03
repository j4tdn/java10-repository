-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT mh.MaMH, 
	   mh.TenMH,
	   mh.GiaBan,
	   lh.MaLoai,
	   lh.TenLoai
FROM MatHang mh
JOIN LoaiHang lh 
ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai  LIKE '%Giày%'
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng 
SELECT * FROM MatHang;

SELECT mh.MaMH, 
	   lh.MaLoai,
	   lh.TenLoai,
	   max(GiaBan)
FROM MatHang mh
JOIN LoaiHang lh 
ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai ;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống 
SELECT lh.*,
	   SUM(kcmh.SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY lh.MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--    Điều kiện tổng số lượng > 20 mặt hàng
SELECT lh.*,
	   SUM(kcmh.SoLuong) TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY lh.MaLoai 
HAVING TongSoLuong > 20;

-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT lh.*,
	   mh.TenMH,
	   Max(SoLuong) tongsoluong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY mh.tenmh;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT mh.MaMH,
	   lh.MaLoai,
	   lh.TenLoai,
	   round( AVG (GiaBan), 2) GiaBanTB
FROM MatHang mh
JOIN LoaiHang lh 
ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai;

-- 24. Liệt kê những mặt hàng có MaLoai = 1 và thuộc đơn hàng 2
SELECT mh.MaMH, 
	   mh.TenMH, 
       mh.MaLoai, 
       dh.MaDH
FROM MatHang mh
JOIN ChiTietDonHang ctdh
ON mh.MaMH = ctdh.MaDH
JOIN DonHang dh
ON ctdh.MaDH = dh.MaDH 
WHERE mh.MaLoai = 1 AND ctdh.MaDH = 2;

-- 25. Tìm những mặt hàng có Mã Loại = 1 và đã được bán trong ngày 17/12
SELECT mh.MaMH,
	   mh.MaLoai,
	   mh.TenMH, 
	   dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
ON dh.MaDH = ctdh.MaDH
WHERE mh.MaLoai = 1 
	  AND DAY(ThoiGianDatHang) = 17
	  AND MONTH(ThoiGianDatHang) = 12;

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 299
SELECT * FROM MatHang;

UPDATE mathang
SET GiaBan = 299
WHERE MaLoai = (SELECT MaLoai FROM loaihang WHERE TenLoai = "Áo");

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
SELECT mh.MaMH, 
	   mh.TenMH, 
	   dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
ON dh.MaDH = ctdh.MaDH
WHERE mh.MaLoai = 2 
	  AND DAY(ThoiGianDatHang) = 23
	  AND MONTH(ThoiGianDatHang) = 11;
    
-- 31. Tính tổng tiền cho đơn hàng 02
-- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT * FROM mathang;
SELECT * FROM donhang;
SELECT * FROM chitietdonhang;

SELECT dh.MaDH,
	   sum(ctdh.SoLuong * mh.GiaBan) + dh.phivanchuyen TongTien
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
ON dh.MaDH = ctdh.MaDH
WHERE dh.MaDH = 2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
--     SoDH   ChiTietDonHang         TongTien
--     02   TenMH:GiaBan:SoLuong       100