SELECT * FROM MatHang;
-- 1. Liệt kê các mặt hàng theo mã loại
SELECT *
FROM MatHang
WHERE MaMH = 3;

-- 2. Liệt kê các mặt hàng theo tên mặt hàng
EXPLAIN SELECT *
FROM MatHang
WHERE TenMH = 'Quần tây Nam';

ALTER TABLE mathang
ADD INDEX IDX_TenMH(TenMH);

ALTER TABLE mathang
DROP INDEX IDX_TenMH;