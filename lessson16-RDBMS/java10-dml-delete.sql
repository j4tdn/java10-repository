------ Enable rollback, commit function ------
-- 1. Xóa nhân viên có tên Văn Hoàng trong hệ thống
DELETE FROM nhanvien
WHERE TenNV = 'Lê Na';
rollback;
-- commit

-- 2. Xóa các mặt hàng có size 'XXL'
-- TRUY VẤN CON - TRUY VẤN LỒNG
SELECT * FROM MatHang;
SELECT * FROM KichCoMatHang;
-- DELETE FROM mathang
-- WHERE EXISTS (SELECT * FROM kichcomathang
-- 		      WHERE mathang.MaMH = kichcomathang.MaMH
--               AND kichcomathang.MaKC = 'XXL');

-- TRUY VẤN CON - SUB QUERY
DELETE FROM MatHang
WHERE MaMH IN (SELECT MaMH FROM KichCoMatHang
			   WHERE MaKC = 'XXL');

-- 3. Xóa tất cả các mặt hàng có mã loại bằng 4
DELETE FROM MatHang
WHERE MaLoai = 4;

-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM MatHang;

-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
SELECT * FROM DonHang;
DELETE FROM DonHang
WHERE cast(ThoiGianDatHang as DATE) = '2020-12-17';

SELECT MaDH, 
       ThoiGianDatHang, 
       CAST(ThoiGianDatHang AS DATE) NgayDatHang
FROM DonHang;
