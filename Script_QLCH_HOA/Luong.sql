CREATE TABLE LUONG(
    THANG NUMBER NOT NULL,
    NAM NUMBER NOT NULL,
    MANV NUMBER NOT NULL,
    SOGIOLAMTC NUMBER DEFAULT 0,
    SOGIOLAMTT NUMBER DEFAULT 0,
    LUONG DECIMAL(15,3) DEFAULT 0,
    CONSTRAINT PK_LUONG PRIMARY KEY(THANG, NAM, MANV)
)
--INSERT DATA
SELECT * FROM LUONG;
--1,2,4,9,10 --3,6
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 1);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 2);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 4);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 9);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 10);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 3);
INSERT INTO LUONG(THANG, NAM, MANV) VALUES(4, 2022, 6);

COMMIT;
--thành công
