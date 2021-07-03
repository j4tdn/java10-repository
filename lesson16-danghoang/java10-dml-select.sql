-- 17 --
SELECT 
    MAX(GiaBan) 
FROM
    mathang
WHERE
    TenMH LIKE 'Giày%';
    
    -- 18 --
    SELECT mh.MaMH, 
		mh.TenMH,
		lh.MaLoai,
        lh.TenLoai,
        max(GiaBan) 
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai 
ORDER BY max(GiaBan);
-- 19 --
SELECT 	* , SUM(SoLuong) SoLuong
FROM MatHang mh
JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH
GROUP BY lh.TenLoai;
-- 20 --
SELECT 	* , SUM(SoLuong) TongSoLuong
FROM MatHang mh
JOIN LoaiHang lh ON mh.MaLoai = lh.MaLoai
JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH
GROUP BY lh.TenLoai
HAVING TongSoLuong > 20;

-- 22 -

SELECT mh.MaMH,
		lh.MaLoai,
        lh.TenLoai,
        AVG(GiaBan) GiaBanTB
FROM MatHang mh
JOIN LoaiHang lh 
	ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai;

-- 23 --
SELECT * 
FROM loaihang lh
JOIN mathang mh
	ON mh.MaLoai=lh.MaLoai
JOIN chitietdonhang ctdh
	ON mh.MaMH=ctdh.MaMH
ORDER BY SoLuong desc
LIMIT 3;

-- 24 --

SELECT mh.MaMH, mh.TenMH, mh.MaLoai, dh.MaDH
FROM MatHang mh
JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaDH
JOIN DonHang dh ON ctdh.MaDH = dh.MaDH 
WHERE mh.MaLoai = 2 AND dh.MaDH = 100100;

-- 25 --

SELECT mh.MaMH, 
		mh.TenMH, 
		dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh 
	ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh
	ON dh.MaDH = ctdh.MaDH
WHERE cast(dh.ThoiGianDatHang as DATE) = '2020-12-17' AND Maloai='1';

-- 26 --
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
WHERE lh.TenLoai  = 'Mũ' and cast(dh.ThoiGianDatHang as DATE) >= '2019-02-15' AND cast(dh.ThoiGianDatHang as DATE) <= '2019-02-13';
-- 27 --
UPDATE mathang set GiaBan =199 WHERE maloai in (
select maloai from loaihang
where tenloai="Áo");

-- 28 --
DROP TABLE  `loaihang_backup`;
CREATE TABLE `loaihang_backup` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(255) NOT NULL,
  PRIMARY KEY (`MaLoai`)
);
  
INSERT INTO loaihang_backup SELECT * FROM loaihang;
SELECT * from loaihang_backup;

-- 29 --
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
