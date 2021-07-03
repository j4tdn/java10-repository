select * from mathang;
select * from donhang;
select * from chitietdonhang;
-- 17
select MaMH item_id,
	   TenMH item_name,
       GiaBan gia_ban
from mathang
where MaLoai='3'
order by GiaBan desc
limit 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng 
SELECT * FROM MatHang;
SELECT mh.MaMH, 
		lh.MaLoai,
        lh.TenLoai,
        max(GiaBan)
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai 
order by GiaBan desc;


-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống 
SELECT 	lh.*,
		SUM(kcmh.SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
 GROUP BY lh.TenLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--    Điều kiện tổng số lượng > 20 mặt hàng
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
SELECT 	lh.*,
		Max(SoLuong) 
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh
	ON mh.MaMH = kcmh.MaMH
 GROUP BY lh.TenLoai ;
 


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
JOIN ChiTietDonHang ctdh
	ON mh.MaMH = ctdh.MaDH
JOIN DonHang dh
	ON ctdh.MaDH = dh.MaDH 
WHERE mh.MaLoai = 1 AND ctdh.MaDH = 2;

-- 25
SELECT *
FROM MatHang mh
JOIN ChiTietDonHang ctdh
  ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
  ON dh.MaDH = ctdh.MaDH
WHERE cast(dh.ThoiGianDatHang as DATE) = '2020-12-17' and Maloai='1';

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019



SELECT mh.MaMH, 
		mh.TenMH,
		mh.GiaBan,
		lh.MaLoai,
        lh.TenLoai
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
JOIN ChiTietDonHang ctdh
  ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
  ON dh.MaDH = ctdh.MaDH
WHERE lh.TenLoai  = 'Mũ' and cast(dh.ThoiGianDatHang as DATE) = '2019-02-19';

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 299
UPDATE mathang
SET GiaBan = 299
WHERE MaLoai = (SELECT MaLoai
FROM loaihang
WHERE TenLoai = "Áo");

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
SELECT mh.MaMH, 
		mh.TenMH, 
		dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
WHERE	DAY(ThoiGianDatHang) = 23
	AND MONTH(ThoiGianDatHang) = 11
	AND mh.MaLoai = 2;
    
    -- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

SELECT 	dh.MaDH,
		mh.MaMH, 
		mh.TenMH, 
		ctdh.SoLuong * mh.GiaBan TongTien
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
where dh.MaDH = 2;

