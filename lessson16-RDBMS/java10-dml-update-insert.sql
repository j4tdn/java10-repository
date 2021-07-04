
-- 1. Cập nhật tên cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'

-- 2. Cập nhật phí vận chuyển cho đơn hàng 01 là 70 nghìn đồng
SELECT * FROM DonHang;
UPDATE DonHang
SET PhiVanChuyen = 70
WHERE MaDH = 1;

-- 3. Đơn hàng 01 đã được giao hàng thành công. Cập nhật tình trạng đơn hàng
SELECT * FROM DonHang;
SELECT * FROM TinhTrangDonHang;
SELECT * FROM ChiTietTinhTrangDonHang;
INSERT INTO ChiTietTinhTrangDonHang(MaDH, MaTTDH, MaNV, ThoiGian)
VALUES(1, 5, 2, current_timestamp());

-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- TODO: HoaDon(SoTienCanThanhToan) = DonHang(TongTien) = DonHang(MaDH = 01) => AFTER JOIN
SELECT * FROM MatHang;
SELECT * FROM ChiTietDonHang;

-- draft
SELECT dh.MaDH,
       mh.MaMH,
	   mh.TenMH,
       mh.GiaBan,
       ctdh.SoLuong
FROM DonHang dh
JOIN ChiTietDonHang ctdh
   ON dh.MaDH = ctdh.MaDH
JOIN MatHang mh
   ON mh.MaMH = ctdh.MaMH
WHERE dh.MaDH = 1;

SELECT dh.MaDH,
       SUM(mh.GiaBan * ctdh.SoLuong) TongTien
FROM DonHang dh
JOIN ChiTietDonHang ctdh
   ON dh.MaDH = ctdh.MaDH
JOIN MatHang mh
   ON mh.MaMH = ctdh.MaMH
WHERE dh.MaDH = 1;


SELECT * FROM DonHang;
SELECT * FROM HoaDon;
-- CTE: Common Table Expression
WITH TongTien_DonHang AS (
	SELECT SUM(mh.GiaBan * ctdh.SoLuong) TongTien
	FROM DonHang dh
	JOIN ChiTietDonHang ctdh
	   ON dh.MaDH = ctdh.MaDH
	JOIN MatHang mh
	   ON mh.MaMH = ctdh.MaMH
	WHERE dh.MaDH = 1
)
UPDATE DonHang
SET TongTien = (SELECT TongTien FROM TongTien_DonHang)
WHERE MaDH = 1;

INSERT INTO HoaDon(MaHD, MaDH, SoTienCanThanhToan, NgayXuat)
SELECT 1, MaDH, TongTien, current_timestamp()
FROM DonHang
WHERE MaDH = 1;

-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
UPDATE MatHang
SET GiaBan = 199
WHERE MaLoai = (SELECT MaLoai FROM LoaiHang
				WHERE TenLoai = 'Mũ');