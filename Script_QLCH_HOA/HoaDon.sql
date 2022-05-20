CREATE TABLE HOADON (
    SOHD NUMBER NOT NULL,
    NGAYHD DATE NOT NULL,
    TONGTIEN NUMBER DEFAULT 0,
    MANV NUMBER NOT NULL,
    MAKH NUMBER, --MaKH có thể có giá trị NULL cho khách hàng không đky làm khách hàng thành viên.
    CHIETKHAU DECIMAL(10,2) DEFAULT 0,
    TRIGIAHD NUMBER DEFAULT 0,
    CONSTRAINT PK_HD PRIMARY KEY(SOHD)
)
CREATE SEQUENCE SEQ7_SOHD START WITH 1;
--INSERT DATA
SELECT * FROM HOADON;
SELECT SUM(TRIGIAHD) FROM HOADON;
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 5, 1);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 5, 2);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 5, 3);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 7, 4);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 7, 5);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 8, 6);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 8, 7);
INSERT INTO HOADON(SOHD, MANV, MAKH) VALUES(SEQ7_SOHD.NEXTVAL, 8, 8);

COMMIT;
--thành công
