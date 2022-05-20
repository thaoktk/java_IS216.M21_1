CREATE TABLE KHUYENMAI (
    MAKM NUMBER NOT NULL,
    TENKM NVARCHAR2(255) NOT NULL,
    PHANTRAM DECIMAL(10,2) NOT NULL,
    NGAYBD DATE,
    NGAYKT DATE,
    CONSTRAINT PK_KM PRIMARY KEY(MAKM)
)
CREATE SEQUENCE SEQ6_MAKM START WITH 1;

--INSERT DATA
SELECT * FROM KHUYENMAI;
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Sinh nhật đầu tiên',0.3,'12/05/2023 00:00:00','12/05/2023 23:59:59');
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Tưng bừng khai trương',0.3,'12/05/2022','14/05/2022');
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Sinh nhật cửa hàng',0.2,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Ngày giải phóng Miền Nam - Thống nhất đất nước',0.1,'30/04/2023 00:00:00','30/04/2023 23:59:59');
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Sinh nhật khách hàng',0.2,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Ngày lễ tình nhân',0.1,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Ngày nhà giáo Việt Nam 20-11',0.1,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Ngày phụ nữ Việt Nam 20-10',0.1,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Ngày quốc tế phụ nữ 8-3',0.05,NULL,NULL);
INSERT INTO KHUYENMAI VALUES(SEQ6_MAKM.NEXTVAL,N'Khuyến mãi 5%',0.05,NULL,NULL);
--thanh cong

COMMIT;