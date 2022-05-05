--------------- DELETE BANG ---------------
DROP TABLE KHACHHANG;
DROP TABLE HOADON;
DROP TABLE KHUYENMAI;
DROP TABLE NHACUNGCAP;
DROP TABLE NHANVIEN;
DROP TABLE SANPHAM;
DROP TABLE PHIEUNHAP;
DROP TABLE CTHD;
DROP TABLE CTKM;
DROP TABLE CTPN;
DROP TABLE CUNGCAP;
DROP TABLE LOAISANPHAM;

--------------- XÓA CÁC SEQUENCE ---------------
DROP SEQUENCE SEQ1_MAKH;
DROP SEQUENCE SEQ2_MASP;
DROP SEQUENCE SEQ3_MAPHIEUNHAP;
DROP SEQUENCE SEQ4_MANV;
DROP SEQUENCE SEQ5_MANCC;
DROP SEQUENCE SEQ6_MAKM;
DROP SEQUENCE SEQ7_SOHD;
DROP SEQUENCE SEQ8_MALOAISP;

--ADD KHOA NGOAI
ALTER TABLE HOADON ADD CONSTRAINT FK_HOADON_NHAVIEN_01 FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV);
ALTER TABLE HOADON ADD CONSTRAINT FK_HOADON_KHACHHANG_02 FOREIGN KEY(MAKH) REFERENCES KHACHHANG(MAKH);
ALTER TABLE CTHD ADD CONSTRAINT FK_CTHD_SANPHAM_03 FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP);
ALTER TABLE CTHD ADD CONSTRAINT FK_CTHD_HOADON_04 FOREIGN KEY(SOHD) REFERENCES HOADON(SOHD);
ALTER TABLE CTKM ADD CONSTRAINT FK_CTKM_HOADON_05 FOREIGN KEY(SOHD) REFERENCES HOADON(SOHD);
ALTER TABLE CTKM ADD CONSTRAINT FK_CTKM_KHUYENMAI_06 FOREIGN KEY(MAKM) REFERENCES KHUYENMAI(MAKM);
ALTER TABLE PHIEUNHAP ADD CONSTRAINT FK_PHIEUNHAP_NHANVIEN_07 FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV);
ALTER TABLE CTPN ADD CONSTRAINT FK_CTPN_SANPHAM_08 FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP);
ALTER TABLE CTPN ADD CONSTRAINT FK_CTPN_PHIEUNHAP_09 FOREIGN KEY(MAPHIEUNHAP) REFERENCES PHIEUNHAP(MAPHIEUNHAP);
ALTER TABLE CUNGCAP ADD CONSTRAINT FK_CUNGCAP_PHIEUNHAP_11 FOREIGN KEY(MAPHIEUNHAP) REFERENCES PHIEUNHAP(MAPHIEUNHAP);
ALTER TABLE CUNGCAP ADD CONSTRAINT FK_CUNGCAP_NCC_12 FOREIGN KEY(MANCC) REFERENCES NHACUNGCAP(MANCC);
ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_LOAISP_13 FOREIGN KEY(MALOAISP) REFERENCES LOAISANPHAM(MALOAISP);

--DROP KHOA NGOAI
ALTER TABLE HOADON DROP CONSTRAINT FK_HOADON_NHAVIEN_01;
ALTER TABLE HOADON DROP CONSTRAINT FK_HOADON_KHACHHANG_02;
ALTER TABLE CTHD DROP CONSTRAINT FK_CTHD_SANPHAM_03;
ALTER TABLE CTHD DROP CONSTRAINT FK_CTHD_HOADON_04;
ALTER TABLE CTKM DROP CONSTRAINT FK_CTKM_HOADON_05;
ALTER TABLE CTKM DROP CONSTRAINT FK_CTKM_KHUYENMAI_06;
ALTER TABLE PHIEUNHAP DROP CONSTRAINT FK_PHIEUNHAP_NHANVIEN_07;
ALTER TABLE CTPN DROP CONSTRAINT FK_CTPN_SANPHAM_08;
ALTER TABLE CTPN DROP CONSTRAINT FK_CTPN_PHIEUNHAP_09;
ALTER TABLE CHAMCONG DROP CONSTRAINT FK_CHAMCONG_NHANVIEN_10;
ALTER TABLE CUNGCAP DROP CONSTRAINT FK_CUNGCAP_PHIEUNHAP_11;
ALTER TABLE CUNGCAP DROP CONSTRAINT FK_CUNGCAP_NCC_12;
ALTER TABLE SANPHAM DROP CONSTRAINT FK_SANPHAM_LOAISP_13;

----------------------- CAC RANG BUOC TOAN VEN ------------------------------
--Co 3 loai khach hang: Binh thuong, Than thiet, VIP.
ALTER TABLE KHACHHANG 
ADD CONSTRAINT CHECK_LOAIKH CHECK(LOAIKH IN(N'Bình thường', N'Thân thiết', N'VIP'));

-- Gioi tinh cua khach hang la 'Nam', 'Nu' hoac 'Khac'
ALTER TABLE KHACHHANG
ADD CONSTRAINT CHECK_KHGIOITINH CHECK(GIOITINH IN(N'Nam', N'Nữ', N'Khác'));

--Ngay Khach hang dang ky(NGAYDK) la khach hang thanh vien phai lon hon ngay sinh cua nguoi do.
ALTER TABLE KHACHHANG 
ADD CONSTRAINT CHECK_NGAYDKTV CHECK(NGAYDK >= NGAYSINH);

--Nhan vien co 4 loai chuc vu: Quan ly, Thu ngan, Ban hang, Nhan vien kho
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHECK_CHUCVU CHECK(CHUCVU IN(N'Quản lý', N'Thu ngân', N'Bán hàng', N'Nhân viên kho'));

-- Gioi tinh cua nhan vien la 'Nam', 'Nu' hoac 'Khac'.
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHECK_NVGIOITINH CHECK(GIOITINH IN(N'Nam', N'Nữ', N'Khác'));

--Nhan vien phai du 18 tuoi moi vao lam.
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHECK_NGAYSINH_NGAYVL CHECK(18 <= (EXTRACT(YEAR FROM NGAYVL) - EXTRACT(YEAR FROM NGAYSINH)));

-- So luong co san cua mot san pham phai lon hon hoac bang 0.
ALTER TABLE SANPHAM 
ADD CONSTRAINT CHECK_SLSAN CHECK(SLSAN >=0);

--Gia tri phan tram cua mot khuyen mai khong duoc qua 50%.
ALTER TABLE KHUYENMAI
ADD CONSTRAINT CHECK_PHANTRAM CHECK(PHANTRAM <= 0.5);

--Ngay ket thuc cua mot Khuyen Mai phai lon hon hoac bang ngay bat dau cua Khuyen Mai do.
ALTER TABLE KHUYENMAI
ADD CONSTRAINT CHECK_NGAYKM CHECK(NGAYBD <= NGAYKT);

--Voi moi ngay cham cong, thoi diem Checkin và checkout cua mot nhan vien phai cung mot ngay.
ALTER TABLE CHAMCONG
ADD CONSTRAINT CHECK_CHAMCONG CHECK((EXTRACT(YEAR FROM CHECKIN) - EXTRACT(YEAR FROM CHECKOUT)) = 0
                                AND (EXTRACT(MONTH FROM CHECKIN) - EXTRACT(MONTH FROM CHECKOUT)) = 0
                                AND (EXTRACT(DAY FROM CHECKIN) - EXTRACT(DAY FROM CHECKOUT)) = 0);

--thanh cong
SET SERVEROUTPUT ON;
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';

/* DANH SÁCH TRIGGER */
--Tong tien nhap cua mot phieu nhap phai bang tong cac gia nhap*soluong nhap.
/*Khi insert, update mot CTPN thi Tong tien nhap cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TIENNHAP_INSERT_UPDATE_CTPN
AFTER INSERT OR UPDATE ON CTPN 
FOR EACH ROW
DECLARE
BEGIN
    UPDATE PHIEUNHAP
    SET TONGTIENNHAP = TONGTIENNHAP + (:NEW.SLNHAP * :NEW.GIANHAP)
    WHERE MAPHIEUNHAP = :NEW.MAPHIEUNHAP;
END;

/*Khi delete, update mot CTPN thi Tong tien nhap cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TIENNHAP_DELETE_UPDATE_CTPN
AFTER DELETE OR UPDATE ON CTPN 
FOR EACH ROW
DECLARE
BEGIN
    UPDATE PHIEUNHAP
    SET TONGTIENNHAP = TONGTIENNHAP - (:OLD.SLNHAP * :OLD.GIANHAP)
    WHERE MAPHIEUNHAP = :OLD.MAPHIEUNHAP;
END;

--Tong tien cua mot hoa don là tong thanh tien (soluong*gia) cua cac chi tiet thuoc hoa don do.
/*Khi insert, update mot CTHD thi Tong tien cua hoa don cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TONGTIEN_INSERT_UPDATE_CTHD
AFTER INSERT OR UPDATE ON CTHD 
FOR EACH ROW
DECLARE
    var_giaban SANPHAM.GIA%TYPE;
BEGIN
    SELECT GIA INTO var_giaban
    FROM SANPHAM
    WHERE MASP = :NEW.MASP;

    UPDATE HOADON
    SET TONGTIEN = TONGTIEN + (:NEW.SOLUONG * var_giaban)
    WHERE SOHD = :NEW.SOHD;
END;

/*Khi delete, update mot CTHD thi Tong tien cua hoa don cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TONGTIEN_DELETE_UPDATE_CTHD
AFTER DELETE OR UPDATE ON CTHD 
FOR EACH ROW
DECLARE
    var_giaban SANPHAM.GIA%TYPE;
BEGIN
    SELECT GIA INTO var_giaban
    FROM SANPHAM
    WHERE MASP = :OLD.MASP;

    UPDATE HOADON
    SET TONGTIEN = TONGTIEN - (:OLD.SOLUONG * var_giaban)
    WHERE SOHD = :OLD.SOHD;
END;

--Chiet khau cua hoa don la tong so tien duoc giam cua khach hang
/*Khi insert, update mot CTKM thi chiet khau cua hoa don cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_CHIETKHAU_INSERT_UPDATE_CTKM
AFTER INSERT OR UPDATE ON CTKM
FOR EACH ROW
DECLARE
    var_phantram KHUYENMAI.PHANTRAM%TYPE;
BEGIN
    SELECT PHANTRAM INTO var_phantram
    FROM KHUYENMAI
    WHERE MAKM = :NEW.MAKM;
    
    UPDATE HOADON
    SET CHIETKHAU = CHIETKHAU - var_phantram
    WHERE SOHD = :NEW.SOHD;
END;

/*Khi delete, update mot CTKM thi chiet khau cua hoa don cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_CHIETKHAU_DELETE_UPDATE_CTKM
AFTER DELETE OR UPDATE ON CTKM
FOR EACH ROW
DECLARE
    var_phantram KHUYENMAI.PHANTRAM%TYPE;
BEGIN
    SELECT PHANTRAM INTO var_phantram
    FROM KHUYENMAI
    WHERE MAKM = :OLD.MAKM;
    
    UPDATE HOADON
    SET CHIETKHAU = CHIETKHAU - var_phantram
    WHERE SOHD = :OLD.SOHD;
END;

--Ngay ban hang (NGHD) cua mot nhan vien phai lon hon hoac bang ngay nhan vien do vao lam.
/*Bang HOADON*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_NGAYHD_NGAYVL_HOADON
AFTER INSERT OR UPDATE 
ON HOADON FOR EACH ROW
DECLARE
    var_ngayvl NHANVIEN.NGAYVL%TYPE;
BEGIN
    SELECT NGAYVL INTO var_ngayvl
    FROM NHANVIEN
    WHERE MANV = :NEW.MANV;
    
    IF(:NEW.NGAYHD < var_ngayvl) THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay ban hang truoc ngay vao lam cua nhan vien.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('THANH CONG!');
    END IF;
END;

/*Bang NHANVIEN*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_NGAYHD_NGAYVL_NHANVIEN
AFTER UPDATE OF NGAYVL ON NHANVIEN 
FOR EACH ROW
DECLARE
    var_ngayhd HOADON.NGAYHD%TYPE;
    cur_hd HOADON.SOHD%TYPE;
    CURSOR cur IS SELECT SOHD
                FROM HOADON 
                WHERE MANV = :NEW.MANV;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO cur_hd;
        EXIT WHEN cur%NOTFOUND;
        
        SELECT NGAYHD INTO var_ngayhd
        FROM HOADON
        WHERE SOHD = cur_hd;
        
        IF(:NEW.NGAYVL > var_ngayhd) THEN
            RAISE_APPLICATION_ERROR(-20000,'Ngay ban hang truoc ngay vao lam cua nhan vien.');
        ELSE
            DBMS_OUTPUT.PUT_LINE('THANH CONG!');
        END IF;
    END LOOP;
END;

--Ngay mua hang (NGHD) cua mot khach hang thanh vien se lon hon hoac bang ngay khach hang do dang ky thanh vien (NGDK). 
/*Bang HOADON*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_NGAYHD_NGAYDK_HOADON
AFTER INSERT OR UPDATE 
ON HOADON FOR EACH ROW
DECLARE
    var_ngaydk KHACHHANG.NGAYDK%TYPE;
BEGIN
    SELECT NGAYDK INTO var_ngaydk
    FROM KHACHHANG
    WHERE MAKH = :NEW.MAKH;
    
    IF(:NEW.NGAYHD < var_ngaydk) THEN
        RAISE_APPLICATION_ERROR(-20000,'Ngay mua hang truoc ngay dang ky thanh vien cua khach hang.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('THANH CONG!');
    END IF;

EXCEPTION 
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Khach hang nay chua dang ky lam khach hang thanh vien!');
END;

/*Bang KHACHHANG*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_NGAYHD_NGAYDK_KHACHHANG
AFTER UPDATE OF NGAYDK ON KHACHHANG 
FOR EACH ROW
DECLARE
    var_ngayhd HOADON.NGAYHD%TYPE;
    cur_hd HOADON.SOHD%TYPE;
    CURSOR cur IS SELECT SOHD
                FROM HOADON 
                WHERE MAKH = :NEW.MAKH;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO cur_hd;
        EXIT WHEN cur%NOTFOUND;
        
        SELECT NGAYHD INTO var_ngayhd
        FROM HOADON
        WHERE SOHD = cur_hd;
        
        IF(:NEW.NGAYDK > var_ngayhd) THEN
            RAISE_APPLICATION_ERROR(-20000,'Ngay mua hang truoc ngay dang ky thanh vien cua khach hang.');
        ELSE
            DBMS_OUTPUT.PUT_LINE('THANH CONG!');
        END IF;
    END LOOP;
END;

--Tich luy cua mot khach hang la tong tri gia cac hoa don ma khach hang thanh vien do da mua. Dong thoi cap nhat loai khach hang
--Cap nhat loai KH:
--	+ Tich luy tu <10000000 la khach hang binh thuong
--	+ Tich luy tu >10000000 - 30000000 la khach hang thuong xuyen.
--	+ Tich luy >30000000 la khach hang VIP.
/*Khi insert, update mot hoa don thi tich luy cua khach hang so huu hoa don do cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TICHLUY_INSERT_UPDATE_HOADON
AFTER INSERT OR UPDATE ON HOADON 
FOR EACH ROW
DECLARE
    var_tichluy KHACHHANG.TICHLUY%TYPE;
BEGIN
    UPDATE KHACHHANG
    SET TICHLUY = TICHLUY + :NEW.TRIGIAHD
    WHERE MAKH = :NEW.MAKH;
    
    SELECT TICHLUY INTO var_tichluy
    FROM KHACHHANG
    WHERE MAKH = :NEW.MAKH;
    
    IF(var_tichluy > 10000000 AND var_tichluy <= 30000000)
    THEN
        UPDATE KHACHHANG
        SET LOAIKH = N'Thân thi?t'
        WHERE MAKH = :NEW.MAKH;
    END IF;
    IF(var_tichluy > 30000000) THEN
        UPDATE KHACHHANG
        SET LOAIKH = N'VIP'
        WHERE MAKH = :NEW.MAKH;
    END IF;
END;

/*Khi delete, update mot hoa don thi tich luy cua khach hang so huu hoa don do cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TICHLUY_DELETE_UPDATE_HOADON
AFTER DELETE OR UPDATE ON HOADON
FOR EACH ROW
DECLARE
    var_tichluy KHACHHANG.TICHLUY%TYPE;
BEGIN
    UPDATE KHACHHANG
    SET TICHLUY = TICHLUY - :OLD.TRIGIAHD
    WHERE MAKH = :OLD.MAKH;
    
    SELECT TICHLUY INTO var_tichluy
    FROM KHACHHANG
    WHERE MAKH = :NEW.MAKH;
    
    IF(var_tichluy > 10000000 AND var_tichluy <= 30000000)
    THEN
        UPDATE KHACHHANG
        SET LOAIKH = N'Thân thiết'
        WHERE MAKH = :NEW.MAKH;
    END IF;
    IF(var_tichluy < 10000000) THEN
        UPDATE KHACHHANG
        SET LOAIKH = N'Bình thường'
        WHERE MAKH = :NEW.MAKH;
    END IF;
END;

--So luong ban ra tai mot thoi diem cua san pham trong CTHD phai nho hon hoac bang so luong co san cua san pham do tai thoi diem do, 
--neu nhu ban thanh cong thi so luong san cua san pham do cung thay doi.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_SOLUONGBAN_CTHD
AFTER INSERT ON CTHD
FOR EACH ROW
DECLARE
    var_soluongsan SANPHAM.SLSAN%TYPE;
BEGIN
    SELECT SLSAN INTO var_soluongsan
    FROM SANPHAM
    WHERE MASP = :NEW.MASP;
    
    IF(:NEW.SOLUONG > var_soluongsan) THEN
        RAISE_APPLICATION_ERROR(-20000, 'San pham khong du so luong co san!');
    ELSE
        UPDATE SANPHAM
        SET SLSAN = SLSAN - :NEW.SOLUONG
        WHERE MASP = :NEW.MASP;
    END IF;
END;

--tri gia cua mot hoa don thay doi khi tong tien hoac chiet khau cua hoa don do thay doi.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_THAYDOITONGTIEN_HOADON
BEFORE UPDATE
ON HOADON FOR EACH ROW
DECLARE
BEGIN
    :NEW.TRIGIAHD := :NEW.TONGTIEN - :NEW.TONGTIEN * :NEW.CHIETKHAU;
END;


/*========================= HE THONG STORE PROCEDURE ========================*/
--Tinh phan tram duoc giam theo loai khach hang
CREATE OR REPLACE PROCEDURE PhanTramGiamLoaiKH(var_sohd HOADON.SOHD%TYPE)
AS
    var_loaikh KHACHHANG.LOAIKH%TYPE;
    var_makh KHACHHANG.MAKH%TYPE;
BEGIN
    SELECT MAKH INTO var_makh
    FROM HOADON
    WHERE SOHD = var_sohd;
    
    IF var_makh IS NOT NULL 
    THEN
        SELECT LOAIKH INTO var_loaikh
        FROM KHACHHANG
        WHERE MAKH = var_makh;
        
        IF(var_loaikh = N'Thân thiết')
        THEN
            UPDATE HOADON
            SET CHIETKHAU = CHIETKHAU + 0.05
            WHERE SOHD = var_sohd;
        ELSIF(var_loaikh = N'VIP')
        THEN
            UPDATE HOADON
            SET CHIETKHAU = CHIETKHAU + 0.1
            WHERE SOHD = var_sohd;
        END IF;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Khach hang nay chua dang ky thanh vien!');
END;

--Hien thi thong tin khach hang
SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE THONGTINKHACHHANG(var_sdt KHACHHANG.SDT%TYPE)
AS
    var_makh KHACHHANG.MAKH%TYPE;
    var_hoten KHACHHANG.HOTEN%TYPE;
    var_diachi KHACHHANG.DIACHI%TYPE;
    var_ngaysinh KHACHHANG.NGAYSINH%TYPE;
    var_ngaydk KHACHHANG.NGAYDK%TYPE;
    var_loaikh KHACHHANG.LOAIKH%TYPE;
    var_tichluy KHACHHANG.TICHLUY%TYPE;
    var_gioitinh KHACHHANG.GIOITINH%TYPE;
    var_ghichu KHACHHANG.GHICHU%TYPE;
BEGIN
    SET TRANSACTION ISOLATION LEVEL read committed;
    SELECT MAKH,HOTEN,LOAIKH,DIACHI,NGAYSINH,NGAYDK,TICHLUY,GIOITINH,GHICHU 
    INTO var_makh,var_hoten,var_loaikh,var_diachi,var_ngaysinh,var_ngaydk,var_tichluy,var_gioitinh,var_ghichu
    FROM KHACHHANG
    WHERE SDT = var_sdt;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin khách hàng có số điện thoai '|| var_sdt ||': ');
    DBMS_OUTPUT.PUT_LINE(N'Mã khách hàng: '|| var_makh);
    DBMS_OUTPUT.PUT_LINE(N'Họ và tên: '|| var_hoten);
    DBMS_OUTPUT.PUT_LINE(N'Loại khách hàng: '|| var_loaikh);
    DBMS_OUTPUT.PUT_LINE(N'Địa chỉ: '|| var_diachi);
    DBMS_OUTPUT.PUT_LINE(N'Ngày sinh: '|| var_ngaysinh);
    DBMS_OUTPUT.PUT_LINE(N'Ngày đăng ký: '|| var_ngaydk);
    DBMS_OUTPUT.PUT_LINE(N'Tích lũy: '|| var_tichluy);
    DBMS_OUTPUT.PUT_LINE(N'Giới tính: '|| var_gioitinh);
    DBMS_OUTPUT.PUT_LINE(N'Ghi chú: '|| var_ghichu);
    DBMS_OUTPUT.PUT_LINE(N'=============================================================');
END;

--Hien thi thong tin nhan vien
CREATE OR REPLACE PROCEDURE THONGTINNHANVIEN(var_manv NHANVIEN.MANV%TYPE)
AS
    var_hoten NHANVIEN.HOTEN%TYPE;
    var_chucvu NHANVIEN.CHUCVU%TYPE;
    var_luongcoban NHANVIEN.LUONGCOBAN%TYPE;
    var_sdt NHANVIEN.SDT%TYPE;
    var_cmnd NHANVIEN.CMND%TYPE;
    var_diachi NHANVIEN.DIACHI%TYPE;
    var_ngaysinh NHANVIEN.NGAYSINH%TYPE;
    var_ngayvl NHANVIEN.NGAYVL%TYPE;
    var_gioitinh NHANVIEN.GIOITINH%TYPE;
BEGIN
    SELECT HOTEN,CHUCVU,LUONGCOBAN,SDT,CMND,DIACHI,NGAYSINH,NGAYVL,GIOITINH 
    INTO var_hoten,var_chucvu,var_luongcoban,var_sdt,var_cmnd,var_diachi,var_ngaysinh,var_ngayvl,var_gioitinh
    FROM NHANVIEN
    WHERE MANV = var_manv;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin nhân viên có mã ' ||var_manv|| ': ');
    DBMS_OUTPUT.PUT_LINE(N'Họ và tên: '|| var_hoten);
    DBMS_OUTPUT.PUT_LINE(N'Chức vụ: '|| var_chucvu);
    DBMS_OUTPUT.PUT_LINE(N'Lương cơ bản: '|| var_luongcoban);
    DBMS_OUTPUT.PUT_LINE(N'Số điện thoại: '|| var_sdt);
    DBMS_OUTPUT.PUT_LINE(N'CMND: '|| var_cmnd);
    DBMS_OUTPUT.PUT_LINE(N'Địa chỉ: '|| var_diachi);
    DBMS_OUTPUT.PUT_LINE(N'Ngày sinh: '|| var_ngaysinh);
    DBMS_OUTPUT.PUT_LINE(N'Ngày vào làm: '|| var_ngayvl);
    DBMS_OUTPUT.PUT_LINE(N'Giới tính: '|| var_gioitinh);
    DBMS_OUTPUT.PUT_LINE(N'============================================================='); 
END;

--Hien thi thong tin san pham
CREATE OR REPLACE PROCEDURE THONGTINSANPHAM(var_tensp SANPHAM.TENSP%TYPE)
AS
    var_masp SANPHAM.MASP%TYPE;
    var_gia SANPHAM.GIA%TYPE;
    var_maloaisp SANPHAM.MALOAISP%TYPE;
    var_mausac SANPHAM.MAUSAC%TYPE;
    var_SLSAN SANPHAM.SLSAN%TYPE;
    var_ghichu SANPHAM.GHICHU%TYPE;
BEGIN
    SELECT MASP,GIA,MALOAISP,MAUSAC,SLSAN,GHICHU INTO var_masp,var_gia,var_maloaisp,var_mausac,var_SLSAN,var_ghichu
    FROM SANPHAM
    WHERE TENSP = var_tensp;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin san pham ' ||var_tensp|| ': ');
    DBMS_OUTPUT.PUT_LINE(N'Mã sản phẩm: '|| var_masp);
    DBMS_OUTPUT.PUT_LINE(N'Giá bán: '|| var_gia);
    DBMS_OUTPUT.PUT_LINE(N'Mã loại: '|| var_maloaisp);
    DBMS_OUTPUT.PUT_LINE(N'Màu sắc: '|| var_mausac);
    DBMS_OUTPUT.PUT_LINE(N'Số lượng sẵn: '|| var_SLSAN);
    DBMS_OUTPUT.PUT_LINE(N'Ghi chú: '|| var_ghichu);
    DBMS_OUTPUT.PUT_LINE(N'============================================================='); 
END;

--Hien thi hoa don
CREATE OR REPLACE PROCEDURE THONGTINHOADON(var_sohd HOADON.SOHD%TYPE)
AS
    var_manv HOADON.MANV%TYPE;
    var_makh HOADON.MAKH%TYPE;
    var_ngayhd HOADON.NGAYHD%TYPE;
    var_tongtien HOADON.TONGTIEN%TYPE;
    var_chietkhau HOADON.CHIETKHAU%TYPE;
    var_trigiahd HOADON.TRIGIAHD%TYPE;
    var_ghichu HOADON.GHICHU%TYPE;
BEGIN
    SELECT MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD,GHICHU INTO var_manv,var_makh,var_ngayhd,var_tongtien,var_chietkhau,var_trigiahd,var_ghichu
    FROM HOADON
    WHERE SOHD = var_sohd;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin hóa đơn có số hóa đơn ' ||var_sohd|| ': ');
    DBMS_OUTPUT.PUT_LINE(N'Mã nhân viên: '|| var_manv);
    DBMS_OUTPUT.PUT_LINE(N'Mã khách hàng: '|| var_makh);
    DBMS_OUTPUT.PUT_LINE(N'Ngày hóa đơn: '|| var_ngayhd);
    DBMS_OUTPUT.PUT_LINE(N'Tổng tiền: '|| var_tongtien);
    DBMS_OUTPUT.PUT_LINE(N'Chiết khấu (% hóa đơn): '|| var_chietkhau);
    DBMS_OUTPUT.PUT_LINE(N'Trị giá hóa đơn: '|| var_trigiahd);
    DBMS_OUTPUT.PUT_LINE(N'Ghi chú: '|| var_ghichu);
    DBMS_OUTPUT.PUT_LINE(N'============================================================='); 
END;

--DEADLOCK.....
----------------- CAC PROCEDURE INSERT -----------------
/*Procedure insert KHACHHANG*/
CREATE OR REPLACE PROCEDURE INSERT_KHACHHANG(var_hoten IN KHACHHANG.HOTEN%TYPE, var_sdt KHACHHANG.SDT%TYPE, var_cmnd KHACHHANG.CMND%TYPE, 
var_diachi KHACHHANG.DIACHI%TYPE, var_ngaysinh KHACHHANG.NGAYSINH%TYPE, var_ngaydk KHACHHANG.NGAYDK%TYPE,var_ghichu KHACHHANG.GHICHU%TYPE,
var_gioitinh KHACHHANG.GIOITINH%TYPE) AS
BEGIN
    INSERT INTO KHACHHANG(MAKH,HOTEN,SDT,CMND,DIACHI,NGAYSINH,NGAYDK,GHICHU,GIOITINH) 
    VALUES (SEQ1_MAKH.NEXTVAL,var_hoten,var_sdt,var_cmnd,var_diachi,var_ngaysinh,var_ngaydk,var_ghichu,var_gioitinh);
    COMMIT;
END;

/*Procedure insert SANPHAM*/
CREATE OR REPLACE PROCEDURE INSERT_SANPHAM(var_tensp SANPHAM.TENSP%TYPE,var_gia SANPHAM.GIA%TYPE, var_maloaisp  SANPHAM.MALOAISP%TYPE,
var_mausac SANPHAM.MAUSAC%TYPE, var_slsan SANPHAM.SLSAN%TYPE, var_ghichu SANPHAM.GHICHU%TYPE) AS
BEGIN
    INSERT INTO SANPHAM(MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU)
    VALUES(SEQ2_MASP.NEXTVAL, var_tensp, var_gia, var_maloaisp, var_mausac, var_slsan, var_ghichu);
    COMMIT;
END;

/*Procedure insert HOADON*/
CREATE OR REPLACE PROCEDURE INSERT_HOADON(var_manv HOADON.MANV%TYPE,var_makh HOADON.MAKH%TYPE,var_ghichu HOADON.GHICHU%TYPE)
AS
    var_ngayhd HOADON.NGAYHD%TYPE;
BEGIN
    SELECT SYSDATE INTO var_ngayhd FROM DUAL;
    --Tao mot hoa don trong
    INSERT INTO HOADON(SOHD, NGAYHD, MANV, MAKH, GHICHU)
    VALUES(SEQ7_SOHD.NEXTVAL, var_ngayhd, var_manv, var_makh, var_ghichu);
    COMMIT;
END;

/*Procedure insert PHIEUNHAP*/
DROP PROCEDURE INSERT_PHIEUNHAP;
CREATE OR REPLACE PROCEDURE INSERT_PHIEUNHAP(var_ngaynhap SANPHAM.TENSP%TYPE,var_manv SANPHAM.GIA%TYPE) AS
BEGIN
    INSERT INTO PHIEUNHAP(MAPHIEUNHAP, NGAYNHAP, MANV)
    VALUES(SEQ3_MAPHIEUNHAP.NEXTVAL, var_ngaynhap,var_manv);
    COMMIT;
END;

/*Procedure insert NHANVIEN*/
CREATE OR REPLACE PROCEDURE INSERT_NHANVIEN(var_hoten NHANVIEN.HOTEN%TYPE,var_diachi NHANVIEN.DIACHI%TYPE, var_sdt NHANVIEN.SDT%TYPE,
var_cmnd NHANVIEN.CMND%TYPE, var_ngaysinh NHANVIEN.NGAYSINH%TYPE, var_ngayvl NHANVIEN.NGAYVL%TYPE, var_luongcoban NHANVIEN.LUONGCOBAN%TYPE,
var_chucvu NHANVIEN.CHUCVU%TYPE, var_gioitinh NHANVIEN.GIOITINH%TYPE) AS
BEGIN
    INSERT INTO NHANVIEN(MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH)
    VALUES(SEQ4_MANV.NEXTVAL, var_hoten, var_diachi, var_sdt, var_cmnd, var_ngaysinh, var_ngayvl, var_luongcoban, var_chucvu, var_gioitinh);
    COMMIT;
END;

/*Procedure insert NHACUNGCAP*/
CREATE OR REPLACE PROCEDURE INSERT_NHACUNGCAP(var_tenncc NHACUNGCAP.TENNCC%TYPE,var_diachi NHACUNGCAP.DIACHI%TYPE, var_sdt NHACUNGCAP.SDT%TYPE)
AS
BEGIN
    INSERT INTO NHACUNGCAP(MANCC, TENNCC, DIACHI, SDT)
    VALUES(SEQ5_MANCC.NEXTVAL, var_tenncc, var_diachi, var_sdt);
    COMMIT;
END;

/*Procedure insert CUNGCAP*/
CREATE OR REPLACE PROCEDURE INSERT_CUNGCAP(var_maphieunhap CUNGCAP.MAPHIEUNHAP%TYPE,var_mancc CUNGCAP.MANCC%TYPE) AS
BEGIN
    INSERT INTO CUNGCAP(MAPHIEUNHAP, MANCC) VALUES(var_maphieunhap, var_mancc);
    COMMIT;
END;

/*Procedure insert CTHD*/
CREATE OR REPLACE PROCEDURE INSERT_CTHD(var_sohd CTHD.SOHD%TYPE,var_masp CTHD.MASP%TYPE, var_soluong CTHD.SOLUONG%TYPE) AS
BEGIN
    INSERT INTO CTHD(SOHD,MASP,SOLUONG) VALUES(var_sohd, var_masp, var_soluong);
    COMMIT;
END;

/*Procedure insert CTPN*/
CREATE OR REPLACE PROCEDURE INSERT_CTPN(var_masp CTPN.MASP%TYPE,var_maphieunhap CTPN.MAPHIEUNHAP%TYPE, var_slnhap CTPN.SLNHAP%TYPE,
var_gianhap CTPN.GIANHAP%TYPE) AS
BEGIN
    INSERT INTO CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP)
    VALUES(var_masp, var_maphieunhap, var_slnhap, var_gianhap);
    COMMIT;
END;

/*Procedure insert KHUYENMAI*/
CREATE OR REPLACE PROCEDURE INSERT_KHUYENMAI(var_tenkm KHUYENMAI.TENKM%TYPE,var_phantram KHUYENMAI.PHANTRAM%TYPE, var_ngaybd KHUYENMAI.NGAYBD%TYPE,
var_ngaykt KHUYENMAI.NGAYKT%TYPE) AS
BEGIN
    INSERT INTO KHUYENMAI(MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT)
    VALUES(SEQ6_MAKM.NEXTVAL, var_tenkm, var_phantram, var_ngaybd, var_ngaykt);
    COMMIT;
END;

/*Procedure insert CTKM*/
CREATE OR REPLACE PROCEDURE INSERT_CTKM(var_sohd CTKM.SOHD%TYPE,var_makm CTKM.MAKM%TYPE) AS
BEGIN
    INSERT INTO CTKM(SOHD, MAKM) VALUES(var_sohd, var_makm);
    COMMIT;
END;

/*Procedure insert LOAISANPHAM*/
CREATE OR REPLACE PROCEDURE INSERT_LOAISANPHAM(var_tenloaisp LOAISANPHAM.TENLOAISP%TYPE,var_ghichu LOAISANPHAM.GHICHU%TYPE) AS
BEGIN
    INSERT INTO LOAISANPHAM(MALOAISP, TENLOAISP,GHICHU)
    VALUES(SEQ8_MALOAISP.NEXTVAL, var_tenloaisp, var_ghichu);
    COMMIT;
END;






