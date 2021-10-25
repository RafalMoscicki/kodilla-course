ALTER TABLE READERS ADD VIP_LEVEL VARCHAR(20);

DROP PROCEDURE IF EXISTS UpdateVipLevels;

DELIMITER $$

CREATE FUNCTION VipLevel(booksrented INT) RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
   DECLARE result VARCHAR(20) DEFAULT 'Standard customer';
   IF booksrented >= 10 THEN
      SET result = 'Gold customer';
   ELSEIF booksrented >= 5 AND booksrented < 10 THEN
      SET result = 'Silver customer';
   ELSEIF booksrented >= 2 AND booksrented < 5 THEN
      SET result = 'Bronze customer';
   ELSE
      SET result = 'Standard customer';
   END IF;
   RETURN result;
END $$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE UpdateVipLevels()
BEGIN
    DECLARE BOOKSREAD, DAYS, RDR_ID INT;
    DECLARE BOOKSPERMONTH DECIMAL(5,2);
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_READERS CURSOR FOR SELECT READER_ID FROM READERS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
    OPEN ALL_READERS;
    WHILE (FINISHED = 0) DO
        FETCH ALL_READERS INTO RDR_ID;
        IF (FINISHED = 0) THEN
            SELECT COUNT(*) FROM RENTS
                WHERE READER_ID = RDR_ID
                    INTO BOOKSREAD;

            SELECT DATEDIFF(MAX(RENT_DATE), MIN(RENT_DATE)) + 1 FROM RENTS
                WHERE READER_ID = RDR_ID
                    INTO DAYS;

            SET BOOKSPERMONTH = BOOKSREAD / DAYS * 30;

            UPDATE READERS SET VIP_LEVEL = VipLevel(BOOKSPERMONTH)
                WHERE READER_ID = RDR_ID;
            COMMIT;
        END IF;
    END WHILE;

    CLOSE ALL_READERS;
END $$

DELIMITER ;

CALL UpdateVipLevels();

SELECT * FROM READERS;