-- FUNCTION
-- 1. Tính tổng các phần tử chẵn nhỏ hơn 10
SET GLOBAL log_bin_trust_function_creators = 1;
DELIMITER $$
CREATE FUNCTION calculate(n int)
RETURNS INT
BEGIN
    DECLARE digit INT DEFAULT 1;
    DECLARE result INT DEFAULT 0;
    DECLARE i INT DEFAULT 0;    
    WHILE i <= n DO 
		SET result = result + i;
        SET i = i + 1;
    END WHILE;
    
    RETURN result;
END
$$ DELIMITER ;
SELECT calculate(3);
