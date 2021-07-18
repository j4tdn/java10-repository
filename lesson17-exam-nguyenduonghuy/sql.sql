-- 01
SELECT mh.MaMH,
		mh.TenMH,
        CAST(dh.ThoiGianDatHang AS TIME) ThoiGianDatHang
FROM mathang mh
JOIN chitietdonhang ctdh
	ON mh.MaMH = ctdh.MaMH
JOIN donhang dh
	ON dh.MaDH = ctdh.MaDH
WHERE CAST(dh.ThoiGianDatHang AS DATE) = '2020-12-18';

-- 02
SELECT lh.MaLoai,
		lh.TenLoai,
        SUM(kcmh.Soluong)
FROM loaihang lh
JOIN mathang mh
	ON mh.MaLoai = lh.MaLoai
JOIN kichcomathang kcmh
	ON kcmh.MaMH = mh.MaMH
GROUP BY lh.MaLoai;

-- 03
SELECT mh.MaMH,
		mh.TenMH,
        SUM(ctdh.SoLuong) SoLuong
FROM mathang mh
JOIN chitietdonhang ctdh
	ON mh.MaMH = ctdh.MaMH
JOIN donhang dh
	ON dh.MaDH = ctdh.MaDH
WHERE year(dh.ThoiGianDatHang) = '2020'
GROUP BY mh.MaMH
ORDER BY SoLuong DESC,	
		mh.MaMH
LIMIT 3;

-- 04
SELECT lh.MaLoai,
		lh.TenLoai,
        mh.MaMH,
        mh.TenMH,
        mh.GiaBan,
        mh.GiaMua,
        SUM(kcmh.Soluong) SoLuong
FROM mathang mh
JOIN loaihang lh
	ON mh.MaLoai = lh.MaLoai
JOIN kichcomathang kcmh
	ON kcmh.MaMH = mh.MaMH
GROUP BY mh.MaMH;