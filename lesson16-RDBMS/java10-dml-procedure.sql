-- PROCEDURE

-- 1. Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE showItems()
BEGIN
	SELECT * FROM mathang;
END $$
DELIMITER ;
CALL showItems();

-- 2. Viết phương thức liệt kê tên các mặt hàng theo loại hàng
DELIMITER $$
CREATE PROCEDURE showItemsByCategoryId(p_cat_id INT)
BEGIN
	SELECT * FROM mathang
    WHERE MaLoai = p_cat_id;
END $$
DELIMITER ; 
CALL showItemsByCategoryId(2);

-- 3. Viết phương thức thêm n rows dữ liệu test cho bảng LoaiHang
--   1  R1 || 3  R3
--   2  R2 || 4  R4
--   5  R5 || n  R5
DELIMITER $$
DROP PROCEDURE IF EXISTS insert_into_category_item;
CREATE PROCEDURE insert_into_category_item(num_of_rows int)
BEGIN
   -- mySQL: LOOP, WHILE
   DECLARE i INT DEFAULT 1;
   DECLARE max_cat_items_id INT DEFAULT (SELECT MAX(MaLoai) FROM loaihang);
   DECLARE cat_item_id INT;
   
   catlb: 
   LOOP
		IF i > num_of_rows THEN
			LEAVE catlb;
		END IF;
        SET cat_item_id = max_cat_items_id + i;
        INSERT INTO loaihang(MaLoai, TenLoai)
        VALUES(cat_item_id, concat('Category item ', cat_item_id));
        
		SET i = i + 1;
   END LOOP;
END $$
DELIMITER ;
SELECT * FROM loaihang;
CALL insert_into_category_item(4);


-- Viết phương thức liệt kê các phần tử chẵn nhỏ hơn 10
--    WHILE condition DO
--    END WHILE;

DELIMITER $$
DROP PROCEDURE IF EXISTS even_number;
CREATE PROCEDURE even_number(n int)
BEGIN
	DECLARE i INT DEFAULT 1;
    DECLARE result nvarchar(50) DEFAULT ''; 
    WHILE i <= n DO
		IF i % 2 = 0 THEN
			SET result = concat(result, ' ', i);
        END IF;
        SET i = i + 1;
    END WHILE;
		SELECT result as Even_Number;
END $$
DELIMITER ;
CALL even_number(10);