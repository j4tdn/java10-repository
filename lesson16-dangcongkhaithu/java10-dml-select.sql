-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
select mh.MaMH, mh.TenMH, mh.GiaBan, lh.MaLoai, lh.TenLoai
FROM MatHang mh
JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai
WHERE lh.TenLoai  = 'Giày dép'
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT * FROM MatHang;
SELECT mh.MaMH, lh.MaLoai, lh.TenLoai, MAX(GiaBan)
FROM MatHang mh
JOIN LoaiHang lh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai 
ORDER BY GiaBan desc;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT 	* , SUM(SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH
GROUP BY lh.TenLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống. Điều kiện tổng số lượng > 20 mặt hàng
SELECT 	* , SUM(SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH
GROUP BY lh.TenLoai
HAVING SoLuong > 20;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT mh.MaMH,
		lh.MaLoai,
        lh.TenLoai,
        AVG(GiaBan) GiaBanTB
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
select * 
from loaihang lh
join mathang mh
	on mh.MaLoai=lh.MaLoai
join chitietdonhang ctdh
	on mh.MaMH=ctdh.MaMH
order by SoLuong desc
limit 3;




-- 24. Liệt kê những mặt hàng có MaLoai = 1 và thuộc đơn hàng 2
SELECT mh.MaMH, mh.TenMH, mh.MaLoai, dh.MaDH
FROM MatHang mh
JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaDH
JOIN DonHang dh ON ctdh.MaDH = dh.MaDH 
WHERE mh.MaLoai = 1 AND ctdh.MaDH = 2;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh ON dh.MaDH = ctdh.MaDH
WHERE cast(dh.ThoiGianDatHang as DATE) = '2020-12-17' and Maloai='1';
