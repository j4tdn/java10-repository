-------- THEORECTICAL -------- 
-- MatHang --
SELECT *
FROM MatHang;

-- convention
SELECT MaMH, 
	   TenMH,
       GiaBan
FROM MatHang;

-- alias
SELECT MaMH item_id, 
	   TenMH item_name,
       GiaBan
FROM MatHang;

-- object
SELECT mh.MaMH, 
	   mh.TenMH,
       mh.GiaBan sales_price
FROM MatHang mh;

-- distinct, limit offset rowcount
SELECT *
FROM MatHang
LIMIT 5;

SELECT DISTINCT MauSac, GiaBan
FROM MatHang
LIMIT 6;

-- calculatuon
SELECT MaMH,
       TenMH,
       GiaBan GiaGoc,
       current_date() HomNay,
       GiaBan * 92 / 100 GiaKM
FROM MatHang;

SELECT * FROM MatHang;

SELECT MaMH,
       TenMH,
       GiaBan,
       GiaMua,
       GiaBan - GiaMua
FROM MatHang;

-- where clause
-- exrp: %text%: contains
--     : %text : endsWith
--     : text% : startsWith
-- case sensitive | insensitive
SELECT *
FROM DonHang
WHERE DiaChiGiaoHang LIKE '%hòa khánh';

SELECT STR_TO_DATE('21-5-2013','%d-%m-%Y') STR_TO_DATE;
SELECT * 
FROM DonHang
WHERE ThoiGianDatHang BETWEEN STR_TO_DATE('10-12-2020','%d-%m-%Y') AND STR_TO_DATE('1-1-2021','%d-%m-%Y');
-- WHERE ThoiGianDatHang BETWEEN '2020-12-10' AND '2021-01-01';

SELECT DAY(ThoiGianDatHang) NgayDatHang
FROM DonHang;

SELECT MaLoai, 
       ROUND(AVG(GiaBan), 2) GiaBanTrungBinh
FROM MatHang
WHERE MaLoai IN (1,2)
GROUP BY MaLoai;

-- LH1 - 199.66
-- LH2 - 220
SELECT MaLoai, 
       AVG(GiaBan) GiaBanTrungBinh
FROM MatHang
WHERE MaLoai = 2; -- 1 | 2

SELECT MaLoai, MaMH, TenMH
FROM MatHang
GROUP BY MaLoai, MaMH, TenMH;

-- COUNT(*) = COUNT(1) = COUNT(non-null column)
SELECT COUNT(*),
       COUNT(MaMH),
       COUNT(HinhAnh)
FROM MatHang;

-- UNION
-- Tìm khách hàng ở Hải Châu hoặc khách hàng đã mua hàng
SELECT *
FROM KhachHang
WHERE DiaChi LIKE '%Hải Châu%'
UNION ALL
SELECT *
FROM KhachHang
WHERE MaKH IN (SELECT MaKH FROM DonHang);

SELECT * FROM LoaiHang;

SELECT mh.*,
       lh.TenLoai
FROM MatHang mh
LEFT JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai;
    
-- MatHang - ChiTietDonHang
-- Lồng phân cấp = Truy vấn con = SubQuery
SELECT * -- 3, 4, 5
FROM MatHang
WHERE MaLoai = 2 AND MaMH IN (SELECT MaMH -- 3, 4
                              FROM ChiTietDonHang);
                              
-- Lồng tương quan
SELECT * -- 3, 4, 5
FROM MatHang mh
WHERE MaLoai = 2 AND EXISTS (SELECT 1 -- MaMH -- 3, 4
                              FROM ChiTietDonHang ctmh
                              WHERE ctmh.MaMH = mh.MaMH);
         
-- EXECUTION PLAN - EXPLAIN PLAN         
SELECT *
FROM MatHang mh
JOIN Loaihang lh
   ON mh.MaLoai = lh.MaLoai
   AND lh.MaLoai = 2
JOIN ChiTietDonHang ctdh
   ON mh.MaMH = ctdh.MaMH;
-- WHERE lh.MaLoai = 2;

-------- PRACTICE --------
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM LoaiHang;
-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * 
FROM MatHang mh
JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai = 'Thắt lưng';

SELECT *
FROM MatHang
WHERE MaLoai = (SELECT MaLoai
                FROM LoaiHang
                WHERE TenLoai = 'Thắt lưng');
                
SELECT *
FROM MatHang mh
WHERE EXISTS (SELECT *
			  FROM LoaiHang lh
              WHERE lh.MaLoai = mh.MaLoai
              AND lh.TenLoai = 'Thắt lưng');
-- Top 5 mặt hàng có giá bán cao nhất
SELECT *
FROM MatHang
ORDER BY GiaBan DESC,
         GiaMua DESC,
		 MaMH ASC
LIMIT 5;

-- 2. Đơn hàng
SELECT * FROM DonHang;
-- Được bán trong ngày 18/12/2020
SELECT *
FROM DonHang
WHERE cast(ThoiGianDatHang as DATE) = '2020-12-18';

-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
FROM DonHang
WHERE CAST(ThoiGianDatHang AS DATE) BETWEEN '2020-10-18' AND '2021-01-02';

-- Được bán trong tháng 11/2019
SELECT *
FROM DonHang
WHERE MONTH(ThoiGianDatHang) = 1
  AND YEAR(ThoiGianDatHang) = 2021;

-- Được giao hàng tại Hòa Khánh
SELECT *
FROM DonHang
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, 
       ROUND((GiaBan * 0.8), 2) GiaKhuyenMai
FROM MatHang;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT *, 
       ROUND((mh.GiaBan * 0.8), 2) GiaKhuyenMai
FROM MatHang mh
JOIN ChiTietDonHang ctdh
  ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
  ON dh.MaDH = ctdh.MaDH
WHERE cast(dh.ThoiGianDatHang as DATE) = '2020-12-17';

SELECT * FROM DonHang;
SELECT * FROM ChiTietDonHang;

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- group_concat: concat all values of col's rows into one result
SELECT group_concat(DISTINCT MauSac SEPARATOR ', ') Mausac
FROM MatHang;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT mh.MaMH,
       mh.TenMH,
       dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh
  ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
  ON dh.MaDH = ctdh.MaDH
WHERE cast(dh.ThoiGianDatHang as DATE) = '2020-12-17';

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * 
FROM MatHang
WHERE GiaBan BETWEEN 100 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * 
FROM MatHang mh
JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai IN ('Mũ', 'Thắt lưng');
-- lh.TenLoai IN ('Mũ', 'Thắt lưng') <==> lh.TenLoai = 'Mũ' || lh.TenLoai = 'Thắt lưng'
-- # lh.TenLoai LIKE '%Mũ%' || lh.TenLoai LIKE '%Thắt lưng%'

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
FROM DonHang
WHERE cast(ThoiGianDatHang as DATE) IN ('2021-01-05', '2020-12-17');

-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT *
FROM MatHang
ORDER BY GiaBan ASC; -- ascending

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT *
FROM MatHang
ORDER BY GiaMua DESC; -- descending

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT *
FROM MatHang
ORDER BY GiaBan ASC,
		 GiaMua DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT * FROM MatHang;

-- 14.1 => Số lượng 3
-- Áo sơ mi nam
-- Áo sơ mi nữ
-- Quần tây nam
SELECT COUNT(*)
FROM MatHang;

-- 14.2 => Số lượng 536
-- Áo sơ mi nam 120
-- Áo sơ mi nữ 180
-- Quần tây nam 236
SELECT SUM(SoLuong) TongSoLuongMatHang
FROM KichCoMatHang;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
-- MaLoai  TenLoai SoLuong
--	1       Giày    20
--	2       Áo      28
SELECT lh.*,
       SUM(kcmh.SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh
 ON  mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
 ON  mh.MaMH = kcmh.MaMH
GROUP BY MaLoai;

-- 17. Đếm số lượng sản phẩm của từng mặt hàng
-- MaMH       TenMH      SoLuong
--	1       Giày da Nam    20
--	2       Áo sơ mi Nữ    28
SELECT lh.*,
	   mh.TenMH,
       SUM(kcmh.SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh
 ON  mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
 ON  mh.MaMH = kcmh.MaMH
GROUP BY mh.MaMH;







