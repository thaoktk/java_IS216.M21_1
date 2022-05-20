CREATE TABLE NHACUNGCAP(
    MANCC NUMBER NOT NULL,
    TENNCC NVARCHAR2(255) NOT NULL,
    DIACHI NVARCHAR2(255) NOT NULL,
    SDT VARCHAR2(20) NOT NULL,
    CONSTRAINT PK_NCC PRIMARY KEY(MANCC)
)
CREATE SEQUENCE SEQ5_MANCC START WITH 1;

--INSERT DATA
SELECT * FROM NHACUNGCAP;
INSERT INTO NHACUNGCAP VALUES(SEQ5_MANCC.NEXTVAL, N'Dalats Hasfarm', N'2C Trương Văn Hoàn, P.9, Tp.Đà Lạt, Tỉnh Lâm Đồng', 0969316685); --Hoa dalat
INSERT INTO NHACUNGCAP VALUES(SEQ5_MANCC.NEXTVAL, N'Nam Long', N'27 Nguyễn Văn Vịnh, Hiệp Tân, Quận Tân Phú, Tp.HCM', 0843620620); --giấy
INSERT INTO NHACUNGCAP VALUES(SEQ5_MANCC.NEXTVAL, N'Brangift', N'21 Cộng Hòa, P.4, Quận Tân Bình, Tp.HCM', 0945998009); --Bình
INSERT INTO NHACUNGCAP VALUES(SEQ5_MANCC.NEXTVAL, N'TRUMXNK', N'212 Khuông Việt, P.Tân Phú Trung, Q.Tân Phú, Tp.HCM', 0363127802); --nhập khẩu
INSERT INTO NHACUNGCAP VALUES(SEQ5_MANCC.NEXTVAL, N'UMIND', N'532A Đường Láng, Quận Đống Đa, Hà Nội', 0982137209); --VÒNG

COMMIT;
--thành công