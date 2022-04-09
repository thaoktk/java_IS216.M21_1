CREATE TABLE KHACHHANG (
    MAKH VARCHAR2(8) PRIMARY KEY,
    HOTEN NVARCHAR2(50) NOT NULL,
    SDT VARCHAR2(20) NOT NULL,
    DIACHI NVARCHAR2(255) NOT NULL,
    NGAYSINH DATE NOT NULL,
    LOAIKH VARCHAR2(20) NOT NULL,
    TICHLUY NUMBER NOT NULL,
    GHICHU NVARCHAR2(255)
)

--INSERT DATA
SELECT * FROM KHACHHANG;
ALTER SESSION SET NLS_DATE_FORMAT='DD/MM/YYYY HH24:MI:SS';
INSERT INTO KHACHHANG VALUES('NO000001', N'Tr?n Th? Bích Di?p', '0363721908', N'2 H?i Tri?u, B?n Nghé, H? Chí Minh', '20/07/1999', 'Norm', 500000, N'Không có');
INSERT INTO KHACHHANG VALUES('CA000002', N'Lê Qu?c Công Thành', '0982311942', N'02-04, ???ng s? 9, KDC Himlam, Ph??ng Tân H?ng, Qu?n 7, TP HCM', '13/11/1995', 'Care', 70000, N'Không thích hoa màu tr?ng');
INSERT INTO KHACHHANG VALUES('CA000003', N'Nguy?n Qu?c Ti?n', '0968026077', N'76/36/2F ???ng 19 Ph??ng Linh Chi?u TP Th? ??c', '22/03/2000', 'Care', 100000, N'Không có');
INSERT INTO KHACHHANG VALUES('VIP00004', N'Lê Th? Kim Anh', '0327899327', N'378 ???ng D??ng Qu?ng Hàm, ph??ng 5, Gò V?p, Thành ph? H? Chí Minh', '07/04/1990', 'VIP', 2000000, N'Hoa ph?i t??i');
INSERT INTO KHACHHANG VALUES('CA000005', N'Tr?n Di?m My', '0911092336', N'3 Hòa Bình, Ph??ng 3, Qu?n 11, H? Chí Minh', '29/11/1989', 'Care', 120000, N'Không có');
INSERT INTO KHACHHANG VALUES('NO000006', N'Lê Công Tr??ng', '0363487902', N'85 Cách M?ng Tháng 8, Ph??ng 15, Qu?n 10, H? Chí Minh', '15/02/1999', 'Norm', 650000, N'Không x?t mùi h??ng lên hoa');
INSERT INTO KHACHHANG VALUES('CA000007', N'Nguy?n Tu?n Minh', '0384789857', N'206/19, 30 Long Thu?n, Long Ph??c, Qu?n 9, H? Chí Minh', '30/09/2001', 'Care', 80000, N'Không có');
INSERT INTO KHACHHANG VALUES('NO000008', N'Võ Qu?c Anh', '0368850883', N'26 Thanh ?a, ph??ng 27, Bình Th?nh, Thành ph? H? Chí Minh', '17/12/1994', 'Norm', 520000, N'Không có');
INSERT INTO KHACHHANG VALUES('CA000009', N'Mai Ng?c Bích', '0971235847', N'71 Hoàng Hoa Thám, ph??ng 13, Tân Bình, Thành ph? H? Chí Minh', '20/05/1998', 'Care', 55000, N'Vi?t thi?p có thêm ch? ký');
INSERT INTO KHACHHANG VALUES('CA000010', N'Tr?n Quang Khánh', '0962335479', N'123 Phó ??c Chính, Qu?n 1, Thành ph? H? Chí Minh', '09/01/1995', 'Care', 150000, N'Bó hoa không ch?n hoa h?ng');
INSERT INTO KHACHHANG VALUES('VIP00011', N'Nguy?n Ng?c C?m Th?', '0913777803', N'1111 ???ng Phan V?n Tr?, P7, Q. Gò V?p', '20/04/1997', 'VIP', 3750000, N'?u tiên hoa m?i nh?p v?');
INSERT INTO KHACHHANG VALUES('LUX00012', N'Hà Th? Di?u Linh', '0345680016', N'99 ???ng Tây Hòa, P. Ph??c Long A, TP Th? ??c', '13/05/1992', 'Luxury', 12000000, N'Hoa và ?? trang trí luôn ph?i t?t nh?t');
INSERT INTO KHACHHANG VALUES('CA000013', N'Lê Võ Hà My', '0965784914', N'273 ???ng Kênh Tân Hóa, ph??ng 3, Qu?n 11, Thành ph? H? Chí Minh', '22/08/1987', 'Care', 250000, N'Không có');
INSERT INTO KHACHHANG VALUES('CA000014', N'Phan Th? Bích H?u', '0783902134', N'42 Nguy?n Minh Hoàng, Ph??ng 12, Tân Bình, Thành ph? H? Chí Minh', '11/11/2001', 'Care', 175000, N'Không có');
INSERT INTO KHACHHANG VALUES('CA000015', N'Tr?n Th? L? Thanh', '0947537680', N'1106 Võ V?n Ki?t, Ph??ng 6, Qu?n 5, H? Chí Minh', '12/10/1995', 'Care', 350000, N'Không ch?n hoa ly');
INSERT INTO KHACHHANG VALUES('NO000016', N'H? Thùy Trang', '0853351790', N'41 Hoàng D? Kh??ng, Ph??ng 12, Qu?n 10, H? Chí Minh', '19/11/1996', 'Norm', 850000, N'Không dùng gi?y gói hoa màu ?en');
INSERT INTO KHACHHANG VALUES('CA000017', N'Nguy?n Th? L?a', '0382279474', N'47 Lý T? Tr?ng, qu?n 1, Thành ph? H? Chí Minh', '27/07/1999', 'Care', 125000, N'Không có');
INSERT INTO KHACHHANG VALUES('CA000018', N'Tr?n Th? Thu Nh?t', '0369948576', N'128 ???ng Kha V?n Cân, Ph??ng Linh Tây, TP. Th? ??c', '10/06/1991', 'Care', 85000, N'Hoa ph?i t??i');
INSERT INTO KHACHHANG VALUES('VIP00019', N'Võ Th? Oanh', '0357119198', N'5 Nguy?n B?nh Khiêm, Ph??ng B?n Nghé, Qu?n 1, Tp. H? Chí Minh, Vi?t Nam', '20/06/2000', 'VIP', 2500000, N'Không có');
INSERT INTO KHACHHANG VALUES('LUX00020', N'Nguy?n Th? Hân', '0967270091', N'26 ???ng Võ V?n T?n, qu?n 3, T.p H? Chí Minh', '02/02/2002', 'Luxury', 10050000, N'Không x?t mùi h??ng lên hoa, dùng v?t trang trí cao c?p');
