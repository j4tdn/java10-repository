-- MatHang --
SELECT * 
FROM mathang;

-- convention
SELECT MaMH,
		TenMH,
        GiaBan
FROM mathang;

-- alias
SELECT MaMH as item_id,
		TenMH as item_name,
        GiaBan
FROM mathang;        

-- object --
SELECT mh.MaMH,
		mh.TenMH,
        mh.GiaBan AS sales_price
FROM MatHang as mh;        

-- Distinct, limit offset, rowcount
SELECT * FROM mathang
LIMIT 5;

SELECT DISTINCT MauSac, GiaBan
FROM mathang 
LIMIT 5;

-- calculation --
SELECT MaMH,
		TenMh,
		GiaBan AS GiaGoc,
		current_date() AS HomNay,
		GiaBan * 92 / 100 AS GiaKM
FROM MatHang;

SELECT MaMH, TenMH, GiaBan, GiaMua, SUM(GiaBan - GiaMua) AS ThangDu
FROM mathang;

-- where clause
-- exrp: '%text%': contains
--     : '%text' : endsWith
-- 	   : 'text%' : startsWith
SELECT *
FROM donhang
WHERE DiaChiGiaoHang LIKE '%hòa khánh%';

-- SELECT STR_TO_DATE('21-5-2013', '%d-%m-%Y')
SELECT *
FROM donhang
WHERE ThoiGianDatHang BETWEEN STR_TO_DATE('10-12-2020', '%d-%m-%Y') AND STR_TO_DATE('1-1-2021', '%d-%m-%Y');
-- WHERE ThoiGianDatHang BETWEEN '2020-12-10' AND '2021-01-01'

SELECT DAY(ThoiGianDatHang) AS NgayDatHang
FROM donhang;

SELECT MaLoai, MaMH, TenMH
FROM mathang
GROUP BY MaLoai, MaMH, TenMH;

SELECT MaLoai,
	ROUND(AVG(GiaBan), 2) AS GiaBanTrungBinh
FROM mathang
WHERE MaLoai IN(1, 2)
GROUP BY MaLoai;    

-- COUNT(*) = COUNt(1) = COUNT(non-null colum)
SELECT COUNT(*),
	   COUNT(MaMH),
       COUNT(HinhAnh)
       FROM mathang;
-- UNION 
-- Tìm khách hàng ở Hải Châu hoặc khách hàng đã mua hàng
SELECT * FROM KhachHang WHERE DiaChi LIKE '%Hải Châu%'
UNION ALL
SELECT * FROM KhachHang WHERE MaKh IN (SELECT MaKH FROM DonHang);

-------------- Practice ---------------
SELECT * FROM MatHang 
ORDER BY GiaBan,
		GiaMua,
		MaMH ASC
LIMIT 5; 

SELECT * FROM DonHang;
-------- Được bán trong ngày 28/11/2019  ------
SELECT * FROM DonHang  WHERE CAST(ThoiGianDatHang as DATE) = '2021-01-05'; 
----------- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019-----------
SELECT * FROM DonHang WHERE CAST(ThoiGianDatHang AS DATE) BETWEEN '2020-12-18' AND '2021-01-05';
-----------------  Được bán trong tháng 11/2019 ----------------------------------
SELECT * FROM DonHang 
WHERE MONTH(ThoiGianDatHang) = 01
AND YEAR(ThoiGianDatHang) = 2021;

SELECT * FROM DonHang 
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh';
-------- Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân ---------------
SELECT *,
		ROUND((GiaBan * 0.8), 2) AS GiaKhuyenMai
        FROM MatHang;
-------- Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019 ---------------
SELECT *,
		ROUND((GiaBan * 0.8), 2) AS GiaKhuyenMai
        FROM MatHang mh
        JOIN ChiTietDonHang ctdh
        ON mh.MaMH = ctdh.MaMH
        JOIN DonHang dh
        ON dh.MaDH = ctdh.MaDH
 WHERE CAST(dh.ThoiGianDatHang AS DATE) = '2020-12-17';        
 SELECT * FROM mathang;
 
 -------- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng. ---
SELECT group_concat(MauSac) FROM mathang;
----------- 9
SELECT * FROM MatHang AS mh
JOIN LoaiHang AS lh
ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai IN ('MŨ', 'THẮT LƯNG');
-- lh.TenLoai IN ('Mũ', 'Thắt Lưng') <===> lh.TenLoai = 'Mũ' || lh.TenLoai = 'Thắt Lưng'
-- # lh.TenLoai Like '%Mũ%' || lh.TenLoai LIKE '%Thắt Lưng%'
-- 10
SELECT * FROM DonHang
WHERE CAST(ThoiGianDatHang AS DATE) IN ('2021-01-05', '2020-12-17');
-- 11
SELECT * FROM MatHang ORDER BY GiaBan ASC;
-- 12
SELECT * FROM MatHang ORDER BY GiaMua DESC;
-- 13
SELECT * FROM MatHang ORDER BY GiaBan ASC, GiaMua DESC;

-- 14
SELECT SUM(SoLuong) AS TongSoLuongMatHang
FROM KichCoMatHang;

-- 15
SELECT * FROM MatHang mh
JOIN ChiTietDonHang ctdh
ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
ON dh.MaDH = ctdh.MaDH
WHERE CAST(dh.ThoiGianDatHang AS DATE) = '2020-12-18';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--    MaLoai  TenLoai SoLuong
-- 		1       Giày    20
-- 		2       Áo      28

SELECT lh.*,
		sum(kcmh.SoLuong) 
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY MaLoai;

-- 17. Đếm số lượng sản phẩm của từng mặt hàng
--    MaLoai  TenLoai 		  SoLuong
-- 		1       Giày da Nam    20
-- 		2       Áo sơ mi Nữ    28

SELECT lh.*,
		mh.TenMH,
        SUM(kcmh.SoLuong) AS SoLuong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY mh.MaMH;
----------------------------- Part 2 ----------------------------------------
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày' --
SELECT * FROM mathang
WHERE TenMH LIKE 'Giày%' 
ORDER BY GiaBan DESC
LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT lh.*,
        SUM(kcmh.SoLuong) AS SoLuong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY lh.MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
   -- Điều kiện tổng số lượng > 20 mặt hàng
SELECT lh.*,
        SUM(kcmh.SoLuong) AS SoLuong 
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY lh.MaLoai
HAVING SoLuong > 20;
   
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT lh.*,
		mh.TenMH,
        SUM(kcmh.SoLuong) AS SoLuong
FROM MatHang mh
JOIN LoaiHang lh
ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
ON mh.MaMH = kcmh.MaMH
GROUP BY mh.MaMh;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT * FROM donhang;
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT mh.MaLoai, mh.TenMH, dh.ThoiGianDatHang FROM loaihang lh
JOIN mathang mh
ON lh.MaLoai = mh.MaLoai
JOIN chitietdonhang ctdh
ON mh.MaMH = ctdh.MaMH
JOIN donhang dh
ON ctdh.MaDH = dh.MaDH
WHERE mh.MaLoai = 2
AND CAST(dh.ThoiGianDatHang AS DATE) = '2020-12-18';

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)
-- Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- 31. Tính tổng tiền cho đơn hàng 02
SELECT dh.MaDH, mh.MaMH, mh.TenMH, mh.GiaBan, SUM(GiaBan) AS Total, dh.ThoiGianDatHang FROM mathang mh
JOIN chitietdonhang ctdh
ON mh.MaMH = ctdh.MaMH
JOIN donhang dh
ON ctdh.MaDH = dh.MaDH
WHERE dh.MaDH = 2;
--  Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
    -- SoDH   ChiTietDonHang         TongTien
    -- 02   TenMH:GiaBan:SoLuong       100
