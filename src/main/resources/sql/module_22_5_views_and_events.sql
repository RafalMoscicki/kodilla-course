CREATE VIEW BOOKS_AND_READERS AS
SELECT RD.READER_ID, RD.FIRSTNAME, RD.LASTNAME, BK.TITLE,
        RT.RENT_DATE, RT.RETURN_DATE
   FROM READERS RD, BOOKS BK, RENTS RT
WHERE RT.BOOK_ID = BK.BOOK_ID
   AND RT.READER_ID = RD.READER_ID
ORDER BY RT.RENT_DATE;

SELECT * FROM BOOKS_AND_READERS
WHERE RENT_DATE > DATE_SUB(CURDATE(), INTERVAL 5 DAY);

DROP VIEW BOOKS_AND_READERS;

SHOW PROCESSLIST;

USE kodilla_course;
    CREATE EVENT UPDATE_VIPS
    ON SCHEDULE EVERY 1 MINUTE
    DO CALL UpdateVipLevels();

UPDATE READERS
    SET VIP_LEVEL = "NOT SET";

SELECT * FROM READERS;

DROP EVENT UPDATE_VIPS;