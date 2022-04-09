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
INSERT INTO KHACHHANG VALUES('NO000001', N'Tr?n Th? B�ch Di?p', '0363721908', N'2 H?i Tri?u, B?n Ngh�, H? Ch� Minh', '20/07/1999', 'Norm', 500000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('CA000002', N'L� Qu?c C�ng Th�nh', '0982311942', N'02-04, ???ng s? 9, KDC Himlam, Ph??ng T�n H?ng, Qu?n 7, TP HCM', '13/11/1995', 'Care', 70000, N'Kh�ng th�ch hoa m�u tr?ng');
INSERT INTO KHACHHANG VALUES('CA000003', N'Nguy?n Qu?c Ti?n', '0968026077', N'76/36/2F ???ng 19 Ph??ng Linh Chi?u TP Th? ??c', '22/03/2000', 'Care', 100000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('VIP00004', N'L� Th? Kim Anh', '0327899327', N'378 ???ng D??ng Qu?ng H�m, ph??ng 5, G� V?p, Th�nh ph? H? Ch� Minh', '07/04/1990', 'VIP', 2000000, N'Hoa ph?i t??i');
INSERT INTO KHACHHANG VALUES('CA000005', N'Tr?n Di?m My', '0911092336', N'3 H�a B�nh, Ph??ng 3, Qu?n 11, H? Ch� Minh', '29/11/1989', 'Care', 120000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('NO000006', N'L� C�ng Tr??ng', '0363487902', N'85 C�ch M?ng Th�ng 8, Ph??ng 15, Qu?n 10, H? Ch� Minh', '15/02/1999', 'Norm', 650000, N'Kh�ng x?t m�i h??ng l�n hoa');
INSERT INTO KHACHHANG VALUES('CA000007', N'Nguy?n Tu?n Minh', '0384789857', N'206/19, 30 Long Thu?n, Long Ph??c, Qu?n 9, H? Ch� Minh', '30/09/2001', 'Care', 80000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('NO000008', N'V� Qu?c Anh', '0368850883', N'26 Thanh ?a, ph??ng 27, B�nh Th?nh, Th�nh ph? H? Ch� Minh', '17/12/1994', 'Norm', 520000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('CA000009', N'Mai Ng?c B�ch', '0971235847', N'71 Ho�ng Hoa Th�m, ph??ng 13, T�n B�nh, Th�nh ph? H? Ch� Minh', '20/05/1998', 'Care', 55000, N'Vi?t thi?p c� th�m ch? k�');
INSERT INTO KHACHHANG VALUES('CA000010', N'Tr?n Quang Kh�nh', '0962335479', N'123 Ph� ??c Ch�nh, Qu?n 1, Th�nh ph? H? Ch� Minh', '09/01/1995', 'Care', 150000, N'B� hoa kh�ng ch?n hoa h?ng');
INSERT INTO KHACHHANG VALUES('VIP00011', N'Nguy?n Ng?c C?m Th?', '0913777803', N'1111 ???ng Phan V?n Tr?, P7, Q. G� V?p', '20/04/1997', 'VIP', 3750000, N'?u ti�n hoa m?i nh?p v?');
INSERT INTO KHACHHANG VALUES('LUX00012', N'H� Th? Di?u Linh', '0345680016', N'99 ???ng T�y H�a, P. Ph??c Long A, TP Th? ??c', '13/05/1992', 'Luxury', 12000000, N'Hoa v� ?? trang tr� lu�n ph?i t?t nh?t');
INSERT INTO KHACHHANG VALUES('CA000013', N'L� V� H� My', '0965784914', N'273 ???ng K�nh T�n H�a, ph??ng 3, Qu?n 11, Th�nh ph? H? Ch� Minh', '22/08/1987', 'Care', 250000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('CA000014', N'Phan Th? B�ch H?u', '0783902134', N'42 Nguy?n Minh Ho�ng, Ph??ng 12, T�n B�nh, Th�nh ph? H? Ch� Minh', '11/11/2001', 'Care', 175000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('CA000015', N'Tr?n Th? L? Thanh', '0947537680', N'1106 V� V?n Ki?t, Ph??ng 6, Qu?n 5, H? Ch� Minh', '12/10/1995', 'Care', 350000, N'Kh�ng ch?n hoa ly');
INSERT INTO KHACHHANG VALUES('NO000016', N'H? Th�y Trang', '0853351790', N'41 Ho�ng D? Kh??ng, Ph??ng 12, Qu?n 10, H? Ch� Minh', '19/11/1996', 'Norm', 850000, N'Kh�ng d�ng gi?y g�i hoa m�u ?en');
INSERT INTO KHACHHANG VALUES('CA000017', N'Nguy?n Th? L?a', '0382279474', N'47 L� T? Tr?ng, qu?n 1, Th�nh ph? H? Ch� Minh', '27/07/1999', 'Care', 125000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('CA000018', N'Tr?n Th? Thu Nh?t', '0369948576', N'128 ???ng Kha V?n C�n, Ph??ng Linh T�y, TP. Th? ??c', '10/06/1991', 'Care', 85000, N'Hoa ph?i t??i');
INSERT INTO KHACHHANG VALUES('VIP00019', N'V� Th? Oanh', '0357119198', N'5 Nguy?n B?nh Khi�m, Ph??ng B?n Ngh�, Qu?n 1, Tp. H? Ch� Minh, Vi?t Nam', '20/06/2000', 'VIP', 2500000, N'Kh�ng c�');
INSERT INTO KHACHHANG VALUES('LUX00020', N'Nguy?n Th? H�n', '0967270091', N'26 ???ng V� V?n T?n, qu?n 3, T.p H? Ch� Minh', '02/02/2002', 'Luxury', 10050000, N'Kh�ng x?t m�i h??ng l�n hoa, d�ng v?t trang tr� cao c?p');
