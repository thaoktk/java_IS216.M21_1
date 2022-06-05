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
DROP TABLE LOAISANPHAM;
DROP TABLE LUONG;
DROP TABLE CHAMCONG;

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
ALTER TABLE CHAMCONG ADD CONSTRAINT FK_CHAMCONG_NHANVIEN_10 FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV);
ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_LOAISP_13 FOREIGN KEY(MALOAISP) REFERENCES LOAISANPHAM(MALOAISP);
ALTER TABLE LUONG ADD CONSTRAINT FK_LUONG_NHANVIEN_14 FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV);
ALTER TABLE PHIEUNHAP ADD CONSTRAINT FK_PHIEUNHAP_NCC_15 FOREIGN KEY(MANCC) REFERENCES NHACUNGCAP(MANCC);

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
ALTER TABLE SANPHAM DROP CONSTRAINT FK_SANPHAM_LOAISP_13;
ALTER TABLE LUONG DROP CONSTRAINT FK_LUONG_NHANVIEN_14;
ALTER TABLE PHIEUNHAP DROP CONSTRAINT FK_PHIEUNHAP_NCC_15;

----------------------- CAC RANG BUOC TOAN VEN ------------------------------
--Co 3 loai khach hang: Binh thuong, Than thiet, VIP.
ALTER TABLE KHACHHANG
ADD CONSTRAINT CHECK_LOAIKH CHECK(LOAIKH IN('Moi', 'Than thiet', 'VIP'));

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

--Thang nhan luong cua nhan vien tu 1 -> 12
ALTER TABLE LUONG
ADD CONSTRAINT CHECK_THANGLUONG CHECK(THANG >= 1 AND THANG <=12);

--Nam nhan luong cua nhan vien >0
ALTER TABLE LUONG
ADD CONSTRAINT CHECK_NAMLUONG CHECK(NAM > 0);

--Số điện thoại của nhân viên phải có 10 số và bắt đầu bằng số 0.
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHECK_SDT_NHANVIEN CHECK(LENGTH(SDT) = 10 AND (SDT LIKE '0%'));

--Số điện thoại của khách hàng phải có 10 số và bắt đầu bằng số 0.
ALTER TABLE KHACHHANG
ADD CONSTRAINT CHECK_SDT_KHACHHANG CHECK(LENGTH(SDT) = 10 AND (SDT LIKE '0%'));

--CMND của nhân viên là số cmnd có 9 số hoặc cccd có 12 số.
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHECK_CMND_NHANVIEN CHECK(LENGTH(CMND)= 9 OR LENGTH(CMND)= 12);

--Số điện thoại của nhà cung cấp phải có 10 số và bắt đầu bằng số 0.
ALTER TABLE NHACUNGCAP
ADD CONSTRAINT CHECK_SDT_NHACUNGCAP CHECK(LENGTH(SDT) = 10 AND (SDT LIKE '0%'));
/* DANH SÁCH TRIGGER */
--Tong tien nhap cua mot phieu nhap phai bang tong cac gia nhap*soluong nhap.
/*Khi insert, update mot CTPN thi Tong tien nhap cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TIENNHAP_INSERT_UPDATE_CTPN
BEFORE INSERT OR UPDATE ON CTPN 
FOR EACH ROW
DECLARE
BEGIN
    UPDATE PHIEUNHAP
    SET TONGTIENNHAP = TONGTIENNHAP + (:NEW.SLNHAP * :NEW.GIANHAP)
    WHERE MAPHIEUNHAP = :NEW.MAPHIEUNHAP;
END;
/
/*Khi delete, update mot CTPN thi Tong tien nhap cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TIENNHAP_DELETE_UPDATE_CTPN
BEFORE DELETE OR UPDATE ON CTPN 
FOR EACH ROW
DECLARE
BEGIN
    UPDATE PHIEUNHAP
    SET TONGTIENNHAP = TONGTIENNHAP - (:OLD.SLNHAP * :OLD.GIANHAP)
    WHERE MAPHIEUNHAP = :OLD.MAPHIEUNHAP;
END;
/
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
/
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
/
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
    SET CHIETKHAU = CHIETKHAU + var_phantram
    WHERE SOHD = :NEW.SOHD;
END;
/
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
/
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
/
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
/
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
/
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
/
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
    IF :NEW.MAKH IS NOT NULL
    THEN
        UPDATE KHACHHANG
        SET TICHLUY = TICHLUY + :NEW.TRIGIAHD
        WHERE MAKH = :NEW.MAKH;
        
        SELECT TICHLUY INTO var_tichluy
        FROM KHACHHANG
        WHERE MAKH = :NEW.MAKH;
        
        IF(var_tichluy > 10000000 AND var_tichluy <= 30000000)
        THEN
            UPDATE KHACHHANG
            SET LOAIKH = 'Than thiet'
            WHERE MAKH = :NEW.MAKH;
        END IF;
        IF(var_tichluy > 30000000) THEN
            UPDATE KHACHHANG
            SET LOAIKH = N'VIP'
            WHERE MAKH = :NEW.MAKH;
        END IF;
    END IF;
END;
/
/*Khi delete, update mot hoa don thi tich luy cua khach hang so huu hoa don do cung thay doi*/
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_TICHLUY_DELETE_UPDATE_HOADON
AFTER DELETE OR UPDATE ON HOADON
FOR EACH ROW
DECLARE
    var_tichluy KHACHHANG.TICHLUY%TYPE;
BEGIN
    IF :OLD.MAKH IS NOT NULL
    THEN
        UPDATE KHACHHANG
        SET TICHLUY = TICHLUY - :OLD.TRIGIAHD
        WHERE MAKH = :OLD.MAKH;
        
        SELECT TICHLUY INTO var_tichluy
        FROM KHACHHANG
        WHERE MAKH = :NEW.MAKH;
        
        IF(var_tichluy > 10000000 AND var_tichluy <= 30000000)
        THEN
            UPDATE KHACHHANG
            SET LOAIKH = N'Than thiet'
            WHERE MAKH = :NEW.MAKH;
        END IF;
        IF(var_tichluy < 10000000) THEN
            UPDATE KHACHHANG
            SET LOAIKH = N'Moi'
            WHERE MAKH = :NEW.MAKH;
        END IF;
    END IF;
END;
/
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
    ELSIF(:NEW.SOLUONG <= 0) THEN
        RAISE_APPLICATION_ERROR(-20000, 'Loi nhap so luong!');
    ELSE
        UPDATE SANPHAM
        SET SLSAN = SLSAN - :NEW.SOLUONG
        WHERE MASP = :NEW.MASP;
    END IF;
END;
/
--tri gia cua mot hoa don thay doi khi tong tien hoac chiet khau cua hoa don do thay doi.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_THAYDOITIEN_HOADON
BEFORE UPDATE
ON HOADON FOR EACH ROW
DECLARE
BEGIN
    :NEW.TRIGIAHD := :NEW.TONGTIEN - :NEW.TONGTIEN * :NEW.CHIETKHAU;
END;
/
--Khi them mot hoa don thi ngay hoa don la ngay hien tai
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_INSERT_NGAYHD_HOADON
BEFORE INSERT
ON HOADON FOR EACH ROW
DECLARE
BEGIN
    :NEW.NGAYHD := SYSDATE;
END;
/
--Khi insert 1 khach hang thi ngay dang ky bang ngay hien tai.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_INSERT_NGAYDK_KHACHHANG
BEFORE INSERT
ON KHACHHANG FOR EACH ROW
DECLARE
BEGIN
    :NEW.NGAYDK := SYSDATE;
END;
/
--Không thể update thời điểm checkin của một chấm công
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_UPDATE_CHECKIN
BEFORE UPDATE OF CHECKIN ON CHAMCONG
FOR EACH ROW
DECLARE
BEGIN
    RAISE_APPLICATION_ERROR(-20000, 'Không được sửa checkin!');
END;
/
--Trong mot cham cong, khi update thoi diem checkout thì thoi diem checkin va checkout cua mot cham cong phai cung mot ngay, so gio lam them cung thay doi.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_UPDATE_CHECKOUT 
before UPDATE of checkout ON CHAMCONG
FOR EACH ROW
DECLARE
    var_sogiolam CHAMCONG.SOGIOLAM%TYPE;
    var_ngaycuoituan DATE;
BEGIN   
    var_sogiolam := (TO_DATE(to_char(:NEW.CHECKOUT, 'DD/MM/YYYY HH24:MI:SS'),'DD/MM/YYYY HH24:MI:SS') - TO_DATE(to_char(:NEW.CHECKIN, 'DD/MM/YYYY HH24:MI:SS'),'DD/MM/YYYY HH24:MI:SS')) * 24;
    
    var_ngaycuoituan := NEXT_DAY(:NEW.CHECKOUT,'SATURDAY');
    IF(TO_DATE(var_ngaycuoituan,'DD/MM/YYYY HH24:MI:SS') - TO_DATE(:NEW.CHECKOUT,'DD/MM/YYYY HH24:MI:SS') = 7
    or TO_DATE(var_ngaycuoituan,'DD/MM/YYYY HH24:MI:SS') - TO_DATE(:NEW.CHECKOUT,'DD/MM/YYYY HH24:MI:SS') = 6) THEN
        :NEW.SOGIOLAM := var_sogiolam * 2;
    ELSE
        :NEW.SOGIOLAM := var_sogiolam;
    END IF;
END;
/

/*========================= HE THONG STORE PROCEDURE ========================*/
--Hien thi thong tin khach hang
SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE HienThiThongTinKhachHang(var_sdt KHACHHANG.SDT%TYPE)
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
/
--Hien thi thong tin nhan vien
CREATE OR REPLACE PROCEDURE HienThiThongTinNhanVien(var_cmnd NHANVIEN.CMND%TYPE)
AS
    var_manv NHANVIEN.MANV%TYPE;
    var_hoten NHANVIEN.HOTEN%TYPE;
    var_chucvu NHANVIEN.CHUCVU%TYPE;
    var_luongcoban NHANVIEN.LUONGCOBAN%TYPE;
    var_sdt NHANVIEN.SDT%TYPE;
    var_diachi NHANVIEN.DIACHI%TYPE;
    var_ngaysinh NHANVIEN.NGAYSINH%TYPE;
    var_ngayvl NHANVIEN.NGAYVL%TYPE;
    var_gioitinh NHANVIEN.GIOITINH%TYPE;
BEGIN
    SELECT MANV,HOTEN,CHUCVU,LUONGCOBAN,SDT,DIACHI,NGAYSINH,NGAYVL,GIOITINH 
    INTO var_manv,var_hoten,var_chucvu,var_luongcoban,var_sdt,var_diachi,var_ngaysinh,var_ngayvl,var_gioitinh
    FROM NHANVIEN
    WHERE CMND = var_cmnd;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin nhân viên có cmnd ' ||var_cmnd|| ': ');
    DBMS_OUTPUT.PUT_LINE(N'Mã nhân viên: '|| var_manv);
    DBMS_OUTPUT.PUT_LINE(N'Họ và tên: '|| var_hoten);
    DBMS_OUTPUT.PUT_LINE(N'Chức vụ: '|| var_chucvu);
    DBMS_OUTPUT.PUT_LINE(N'Lương cơ bản: '|| var_luongcoban);
    DBMS_OUTPUT.PUT_LINE(N'Số điện thoại: '|| var_sdt);
    DBMS_OUTPUT.PUT_LINE(N'Địa chỉ: '|| var_diachi);
    DBMS_OUTPUT.PUT_LINE(N'Ngày sinh: '|| var_ngaysinh);
    DBMS_OUTPUT.PUT_LINE(N'Ngày vào làm: '|| var_ngayvl);
    DBMS_OUTPUT.PUT_LINE(N'Giới tính: '|| var_gioitinh);
    DBMS_OUTPUT.PUT_LINE(N'============================================================='); 
END;
/
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
/
--Hien thi hoa don
CREATE OR REPLACE PROCEDURE HienThiThongTinHoaDon(var_sohd HOADON.SOHD%TYPE)
AS
    var_manv HOADON.MANV%TYPE;
    var_makh HOADON.MAKH%TYPE;
    var_ngayhd HOADON.NGAYHD%TYPE;
    var_tongtien HOADON.TONGTIEN%TYPE;
    var_chietkhau HOADON.CHIETKHAU%TYPE;
    var_trigiahd HOADON.TRIGIAHD%TYPE;
    var_tensp SANPHAM.TENSP%TYPE;
    var_soluong CTHD.SOLUONG%TYPE;
    cur_hd SANPHAM.MASP%TYPE;
    CURSOR cur IS SELECT MASP
                FROM CTHD
                WHERE SOHD = var_sohd;
BEGIN
    SELECT MANV,MAKH,NGAYHD,TONGTIEN,CHIETKHAU,TRIGIAHD INTO var_manv,var_makh,var_ngayhd,var_tongtien,var_chietkhau,var_trigiahd
    FROM HOADON
    WHERE SOHD = var_sohd;
    
    DBMS_OUTPUT.PUT_LINE(N'Thông tin hóa đơn có số hóa đơn ' ||var_sohd|| ': ');
    DBMS_OUTPUT.PUT_LINE(N'Mã nhân viên: '|| var_manv);
    DBMS_OUTPUT.PUT_LINE(N'Mã khách hàng: '|| var_makh);
    DBMS_OUTPUT.PUT_LINE(N'Ngày hóa đơn: '|| var_ngayhd);
    DBMS_OUTPUT.PUT_LINE(N'Các sản phẩm: ');
    OPEN cur;
    LOOP
        FETCH cur INTO cur_hd;
        EXIT WHEN cur%NOTFOUND;
        SELECT TENSP INTO var_tensp
        FROM SANPHAM
        WHERE MASP = cur_hd;
        
        SELECT SOLUONG INTO var_soluong
        FROM CTHD
        WHERE MASP = cur_hd;
        DBMS_OUTPUT.PUT_LINE('       ' ||var_tensp|| ' - ' ||var_soluong);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE(N'Tổng tiền: '|| var_tongtien);
    DBMS_OUTPUT.PUT_LINE(N'Chiết khấu(% hóa đơn): '|| var_chietkhau);
    DBMS_OUTPUT.PUT_LINE(N'Trị giá hóa đơn: '|| var_trigiahd);
    DBMS_OUTPUT.PUT_LINE(N'============================================================='); 
END;
/
--test
SET SERVEROUTPUT ON;
BEGIN
    HienThiThongTinHoaDon(5);
END;
/
--Thống kê doanh thu theo tháng
CREATE OR REPLACE FUNCTION ThongKeDoanhThuThang(var_thang NUMBER, var_nam NUMBER) RETURN NUMBER
AS
    var_doanhthu NUMBER;
BEGIN
    SELECT SUM(TRIGIAHD) INTO var_doanhthu
    FROM HOADON
    WHERE EXTRACT(MONTH FROM NGAYHD) = var_thang AND EXTRACT(YEAR FROM NGAYHD) = var_nam;
    
    RETURN var_doanhthu;
END;
/
--Thống kê doanh thu theo năm
CREATE OR REPLACE FUNCTION ThongKeDoanhThuNam(var_nam NUMBER) RETURN NUMBER
AS
    var_doanhthu NUMBER;
BEGIN
    SELECT SUM(TRIGIAHD) INTO var_doanhthu
    FROM HOADON
    WHERE EXTRACT(YEAR FROM NGAYHD) = var_nam;
    
    RETURN var_doanhthu;
END;
/
--Thống kê tiền nhập theo tháng
CREATE OR REPLACE FUNCTION ThongKeTienNhapThang(var_thang NUMBER, var_nam NUMBER) RETURN NUMBER
AS
    var_tiennhap NUMBER;
BEGIN
    SELECT SUM(TONGTIENNHAP) INTO var_tiennhap
    FROM PHIEUNHAP
    WHERE EXTRACT(MONTH FROM NGAYNHAP) = var_thang AND EXTRACT(YEAR FROM NGAYNHAP) = var_nam;
    
    RETURN var_tiennhap;
END;
/
--Thống kê tiền nhập theo năm
CREATE OR REPLACE FUNCTION ThongKeTienNhapNam(var_nam NUMBER) RETURN NUMBER
AS
    var_tiennhap NUMBER;
BEGIN
    SELECT SUM(TONGTIENNHAP) INTO var_tiennhap
    FROM PHIEUNHAP
    WHERE EXTRACT(YEAR FROM NGAYNHAP) = var_nam;
    
    RETURN var_tiennhap;
END;
/
--Thống kê tiền nhập từng sản phẩm theo tháng
CREATE OR REPLACE PROCEDURE ThongKeTienNhapSPThang(var_thang NUMBER, var_nam NUMBER, var_masp OUT SANPHAM.MASP%TYPE,
var_tensp OUT SANPHAM.TENSP%TYPE, var_tongtiennhap OUT NUMBER)
AS
    var_tiennhapsp NUMBER;
    cur_pn CTPN.MAPHIEUNHAP%TYPE;
    CURSOR cur IS SELECT MAPHIEUNHAP
                FROM PHIEUNHAP
                WHERE EXTRACT(MONTH FROM NGAYNHAP) = var_thang AND EXTRACT(YEAR FROM NGAYNHAP) = var_nam;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO cur_pn;
        EXIT WHEN cur%NOTFOUND;
        SELECT C.MASP, S.TENSP, SUM(SLNHAP*GIANHAP) INTO var_masp,var_tensp,var_tongtiennhap
        FROM CTPN C JOIN SANPHAM S ON C.MASP = S.MASP
        WHERE MAPHIEUNHAP = cur_pn
        GROUP BY C.MASP, S.TENSP;
    END LOOP;
END;
/
--Thống kê tiền nhập từng sản phẩm theo năm
CREATE OR REPLACE PROCEDURE ThongKeTienNhapSPNam(var_nam NUMBER, var_masp OUT SANPHAM.MASP%TYPE,
var_tensp OUT SANPHAM.TENSP%TYPE, var_tongtiennhap OUT NUMBER)
AS
    var_tiennhapsp NUMBER;
    cur_pn CTPN.MAPHIEUNHAP%TYPE;
    CURSOR cur IS SELECT MAPHIEUNHAP
                FROM PHIEUNHAP
                WHERE EXTRACT(YEAR FROM NGAYNHAP) = var_nam;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO cur_pn;
        EXIT WHEN cur%NOTFOUND;
        SELECT C.MASP, S.TENSP, SUM(SLNHAP*GIANHAP) INTO var_masp,var_tensp,var_tongtiennhap
        FROM CTPN C JOIN SANPHAM S ON C.MASP = S.MASP
        WHERE MAPHIEUNHAP = cur_pn
        GROUP BY C.MASP, S.TENSP;
    END LOOP;
END;
/
----------------- CAC FUNCTION INSERT -----------------
/*Function insert KHACHHANG*/
CREATE OR REPLACE FUNCTION INSERT_KHACHHANG(var_hoten IN KHACHHANG.HOTEN%TYPE, var_sdt KHACHHANG.SDT%TYPE,var_diachi KHACHHANG.DIACHI%TYPE,
var_ngaysinh KHACHHANG.NGAYSINH%TYPE, var_ghichu KHACHHANG.GHICHU%TYPE,var_gioitinh KHACHHANG.GIOITINH%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) 
    VALUES (SEQ1_MAKH.NEXTVAL,var_hoten,var_sdt,var_diachi,var_ngaysinh,var_ghichu,var_gioitinh);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function update KHACHHANG*/
CREATE OR REPLACE FUNCTION UPDATE_KHACHHANG(var_makh KHACHHANG.MAKH%TYPE, var_hoten IN KHACHHANG.HOTEN%TYPE, var_sdt KHACHHANG.SDT%TYPE,var_diachi KHACHHANG.DIACHI%TYPE,
var_ngaysinh KHACHHANG.NGAYSINH%TYPE, var_ghichu KHACHHANG.GHICHU%TYPE,var_gioitinh KHACHHANG.GIOITINH%TYPE) RETURN NUMBER AS
BEGIN
    UPDATE KHACHHANG
    SET HOTEN = var_hoten, SDT = var_sdt, DIACHI = var_diachi, NGAYSINH = var_ngaysinh, GHICHU = var_ghichu, GIOITINH = var_gioitinh
    WHERE MAKH = var_makh;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert SANPHAM*/
CREATE OR REPLACE FUNCTION INSERT_SANPHAM(var_tensp SANPHAM.TENSP%TYPE,var_gia SANPHAM.GIA%TYPE, var_maloaisp  SANPHAM.MALOAISP%TYPE,
var_mausac SANPHAM.MAUSAC%TYPE, var_slsan SANPHAM.SLSAN%TYPE, var_ghichu SANPHAM.GHICHU%TYPE, var_anh SANPHAM.ANHSP%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO SANPHAM(MASP, TENSP, GIA, MALOAISP, MAUSAC, SLSAN, GHICHU, ANHSP)
    VALUES(SEQ2_MASP.NEXTVAL, var_tensp, var_gia, var_maloaisp, var_mausac, var_slsan, var_ghichu,var_anh);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function update SANPHAM*/
CREATE OR REPLACE FUNCTION UPDATE_SANPHAM(var_masp SANPHAM.MASP%TYPE, var_tensp SANPHAM.TENSP%TYPE,var_gia SANPHAM.GIA%TYPE, var_maloaisp  SANPHAM.MALOAISP%TYPE,
var_mausac SANPHAM.MAUSAC%TYPE, var_slsan SANPHAM.SLSAN%TYPE, var_ghichu SANPHAM.GHICHU%TYPE, var_anh SANPHAM.ANHSP%TYPE) RETURN NUMBER AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    UPDATE SANPHAM
    SET TENSP = var_tensp, GIA = var_gia, MALOAISP = var_maloaisp, 
    MAUSAC = var_mausac, SLSAN = var_slsan, GHICHU = var_ghichu, ANHSP = var_anh
    WHERE MASP = var_masp;
    LOCK TABLE SANPHAM IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
-- mở sqlplus để chạy dòng này
GRANT execute ON DBMS_LOCK TO c##QLCH_HOA;
/*Function insert HOADON*/ 
--     SET TRANSACTION ISOLATION LEVEL Read committed;
--    INSERT INTO DATVE VALUES(Mave_seq9.nextval, in_makh, in_manv, in_lichchieu, in_maghe, v_gia, v_date, in_hinhthuc, in_thanhtoan);
--        LOCK TABLE DATVE IN EXCLUSIVE MODE;
--    
--    SLEEP(10);
--    COMMIT;
-- 
CREATE OR REPLACE FUNCTION INSERT_HOADON(var_manv HOADON.MANV%TYPE,var_makh HOADON.MAKH%TYPE) RETURN NUMBER
AS
    var_loaikh KHACHHANG.LOAIKH%TYPE;
    var_chietkhau HOADON.CHIETKHAU%TYPE := 0;
BEGIN
    IF var_makh IS NOT NULL THEN
        SELECT LOAIKH INTO var_loaikh
        FROM KHACHHANG
        WHERE MAKH = var_makh;
        
        IF(var_loaikh = N'Than thiet')
        THEN
            var_chietkhau := var_chietkhau + 0.05;
        ELSIF(var_loaikh = N'VIP')
        THEN
            var_chietkhau := var_chietkhau + 0.1;
        END IF;
    END IF;
    
    INSERT INTO HOADON(SOHD, MANV, MAKH, CHIETKHAU)
    VALUES(SEQ7_SOHD.NEXTVAL, var_manv, var_makh, var_chietkhau);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert PHIEUNHAP*/
CREATE OR REPLACE FUNCTION INSERT_PHIEUNHAP(var_mancc PHIEUNHAP.MANCC%TYPE, var_ngaynhap PHIEUNHAP.NGAYNHAP%TYPE,var_manv PHIEUNHAP.MANV%TYPE) 
RETURN NUMBER AS
BEGIN
    INSERT INTO PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV)
    VALUES(SEQ3_MAPHIEUNHAP.NEXTVAL,var_mancc, var_ngaynhap,var_manv);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function UPDATE PHIEUNHAP*/
CREATE OR REPLACE FUNCTION UPDATE_PHIEUNHAP(var_mpn PHIEUNHAP.MAPHIEUNHAP%TYPE, var_mancc PHIEUNHAP.MANCC%TYPE, 
var_ngaynhap PHIEUNHAP.NGAYNHAP%TYPE,var_manv PHIEUNHAP.MANV%TYPE) RETURN NUMBER AS
BEGIN
    UPDATE PHIEUNHAP
    SET MANCC = var_mancc, NGAYNHAP = var_ngaynhap, MANV = var_manv
    WHERE MAPHIEUNHAP = var_mpn;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert NHANVIEN*/
CREATE OR REPLACE FUNCTION INSERT_NHANVIEN(var_hoten NHANVIEN.HOTEN%TYPE,var_diachi NHANVIEN.DIACHI%TYPE, var_sdt NHANVIEN.SDT%TYPE,
var_cmnd NHANVIEN.CMND%TYPE, var_ngaysinh NHANVIEN.NGAYSINH%TYPE, var_ngayvl NHANVIEN.NGAYVL%TYPE, var_luongcoban NHANVIEN.LUONGCOBAN%TYPE,
var_chucvu NHANVIEN.CHUCVU%TYPE, var_gioitinh NHANVIEN.GIOITINH%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO NHANVIEN(MANV, HOTEN, DIACHI, SDT, CMND, NGAYSINH, NGAYVL, LUONGCOBAN, CHUCVU, GIOITINH)
    VALUES(SEQ4_MANV.NEXTVAL, var_hoten, var_diachi, var_sdt, var_cmnd, var_ngaysinh, var_ngayvl, var_luongcoban, var_chucvu, var_gioitinh);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function update NHANVIEN*/
CREATE OR REPLACE FUNCTION UPDATE_NHANVIEN(var_manv NHANVIEN.MANV%TYPE, var_hoten NHANVIEN.HOTEN%TYPE,var_diachi NHANVIEN.DIACHI%TYPE, var_sdt NHANVIEN.SDT%TYPE,
var_cmnd NHANVIEN.CMND%TYPE, var_ngaysinh NHANVIEN.NGAYSINH%TYPE, var_ngayvl NHANVIEN.NGAYVL%TYPE, var_luongcoban NHANVIEN.LUONGCOBAN%TYPE,
var_chucvu NHANVIEN.CHUCVU%TYPE, var_gioitinh NHANVIEN.GIOITINH%TYPE) RETURN NUMBER AS
BEGIN
    UPDATE NHANVIEN
    SET HOTEN = var_hoten, DIACHI = var_diachi, SDT = var_sdt, CMND = var_cmnd, 
    NGAYSINH = var_ngaysinh, NGAYVL = var_ngayvl, LUONGCOBAN = var_luongcoban, 
    CHUCVU = var_chucvu, GIOITINH = var_gioitinh
    WHERE MANV = var_manv;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert NHACUNGCAP*/
CREATE OR REPLACE FUNCTION INSERT_NHACUNGCAP(var_tenncc NHACUNGCAP.TENNCC%TYPE,var_diachi NHACUNGCAP.DIACHI%TYPE, var_sdt NHACUNGCAP.SDT%TYPE)
RETURN NUMBER AS
BEGIN
    INSERT INTO NHACUNGCAP(MANCC, TENNCC, DIACHI, SDT)
    VALUES(SEQ5_MANCC.NEXTVAL, var_tenncc, var_diachi, var_sdt);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function UPDATE NHACUNGCAP*/
CREATE OR REPLACE FUNCTION UPDATE_NHACUNGCAP(var_mancc NHACUNGCAP.MANCC%TYPE, var_tenncc NHACUNGCAP.TENNCC%TYPE,var_diachi NHACUNGCAP.DIACHI%TYPE, var_sdt NHACUNGCAP.SDT%TYPE)
RETURN NUMBER AS
BEGIN
    UPDATE NHACUNGCAP
    SET TENNCC = var_tenncc, DIACHI = var_diachi, SDT = var_sdt
    WHERE MANCC = var_mancc;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/

/*function insert CTHD*/
CREATE OR REPLACE FUNCTION INSERT_CTHD(var_sohd CTHD.SOHD%TYPE,var_masp CTHD.MASP%TYPE, var_soluong CTHD.SOLUONG%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO CTHD(SOHD,MASP,SOLUONG) VALUES(var_sohd, var_masp, var_soluong);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
begin
    dbms_output.put_line(INSERT_CTHD(13, 7,6));
end;
/
/*Function insert CTPN*/
CREATE OR REPLACE FUNCTION INSERT_CTPN(var_masp CTPN.MASP%TYPE,var_maphieunhap CTPN.MAPHIEUNHAP%TYPE, var_slnhap CTPN.SLNHAP%TYPE,
var_gianhap CTPN.GIANHAP%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP)
    VALUES(var_masp, var_maphieunhap, var_slnhap, var_gianhap);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert KHUYENMAI*/
CREATE OR REPLACE FUNCTION INSERT_KHUYENMAI(var_tenkm KHUYENMAI.TENKM%TYPE,var_phantram KHUYENMAI.PHANTRAM%TYPE, var_ngaybd KHUYENMAI.NGAYBD%TYPE,
var_ngaykt KHUYENMAI.NGAYKT%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO KHUYENMAI(MAKM, TENKM, PHANTRAM, NGAYBD, NGAYKT)
    VALUES(SEQ6_MAKM.NEXTVAL, var_tenkm, var_phantram, var_ngaybd, var_ngaykt);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function update KHUYENMAI*/
CREATE OR REPLACE FUNCTION UPDATE_KHUYENMAI(var_makm KHUYENMAI.MAKM%TYPE, var_tenkm KHUYENMAI.TENKM%TYPE,var_phantram KHUYENMAI.PHANTRAM%TYPE, var_ngaybd KHUYENMAI.NGAYBD%TYPE,
var_ngaykt KHUYENMAI.NGAYKT%TYPE) RETURN NUMBER AS
BEGIN
    UPDATE KHUYENMAI 
    SET TENKM = var_tenkm, PHANTRAM = var_phantram, NGAYBD = var_ngaybd, NGAYKT = var_ngaykt
    WHERE MAKM = var_makm;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert CTKM*/
CREATE OR REPLACE FUNCTION INSERT_CTKM(var_sohd CTKM.SOHD%TYPE,var_makm CTKM.MAKM%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO CTKM(SOHD, MAKM) VALUES(var_sohd, var_makm);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert LOAISANPHAM*/
CREATE OR REPLACE FUNCTION INSERT_LOAISANPHAM(var_tenloaisp LOAISANPHAM.TENLOAISP%TYPE,var_ghichu LOAISANPHAM.GHICHU%TYPE) RETURN NUMBER AS
BEGIN
    INSERT INTO LOAISANPHAM(MALOAISP, TENLOAISP,GHICHU)
    VALUES(SEQ8_MALOAISP.NEXTVAL, var_tenloaisp, var_ghichu);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function update LOAISANPHAM*/
CREATE OR REPLACE FUNCTION UPDATE_LOAISANPHAM(var_maloaisp LOAISANPHAM.MALOAISP%TYPE, 
var_tenloaisp LOAISANPHAM.TENLOAISP%TYPE,var_ghichu LOAISANPHAM.GHICHU%TYPE) RETURN NUMBER AS
BEGIN
    UPDATE LOAISANPHAM
    SET TENLOAISP = var_tenloaisp, GHICHU = var_ghichu
    WHERE MALOAISP = var_maloaisp;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
/*Function insert CHAMCONG*/
CREATE OR REPLACE FUNCTION INSERT_CHAMCONG(var_manv CHAMCONG.MANV%TYPE) RETURN NUMBER
AS
BEGIN
    INSERT INTO CHAMCONG(MANV, CHECKIN) VALUES(var_manv, SYSDATE);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/

begin
    dbms_output.put_line(INsert_chamcong(3));
end;
/
set serveroutput on;
/*Function update checkout CHAMCONG*/
SET DEFINE OFF;
CREATE OR REPLACE FUNCTION UPDATE_CHAMCONG(var_manv CHAMCONG.MANV%TYPE)
RETURN NUMBER AS
    var_checkout CHAMCONG.CHECKOUT%TYPE;
BEGIN
    SELECT SYSDATE INTO var_checkout
    FROM DUAL;
    UPDATE CHAMCONG
    SET CHECKOUT = var_checkout
    WHERE MANV = var_manv 
    AND ((EXTRACT(YEAR FROM var_checkout) = EXTRACT(YEAR FROM CHECKIN)) AND (EXTRACT(MONTH FROM var_checkout) = EXTRACT(MONTH FROM CHECKIN))
    AND (EXTRACT(DAY FROM var_checkout) = EXTRACT(DAY FROM CHECKIN)));
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--Tính lương tháng X cho nhân viên.
/*FUNCTION: Tính số ngày tối đa của tháng*/
CREATE OR REPLACE FUNCTION SoNgayToiDaCuaThang(var_thang NUMBER, var_nam NUMBER) RETURN NUMBER
AS
    var_ngay DATE; 
    var_ngaycuoi NUMBER;
BEGIN
    var_ngay := to_date('1/'|| var_thang || '/' || var_nam,'DD/MM/YYYY HH24:MI:SS');
    var_ngaycuoi := EXTRACT(DAY FROM LAST_DAY(var_ngay));
    RETURN var_ngaycuoi;
END;
/
/*FUNCTION: Tính số ngày cuối tuần trong tháng*/
CREATE OR REPLACE FUNCTION SoNgayCuoiTuanTrongThang(var_thang NUMBER, var_nam NUMBER) RETURN NUMBER
AS
    var_dem NUMBER :=0;
    var_temp DATE;
    var_ngay DATE;
    var_ngaytoida NUMBER;
BEGIN
    var_ngaytoida := SoNgayToiDaCuaThang(var_thang,var_nam);
    var_ngay := to_date('1/'|| var_thang || '/' || var_nam,'DD/MM/YYYY HH24:MI:SS');
    var_temp := NEXT_DAY(var_ngay, 'SATURDAY');
    IF(TO_DATE(var_temp,'DD/MM/YYYY HH24:MI:SS') - var_ngay = 7 ) THEN
        var_dem := var_dem +2;
    ELSIF(TO_DATE(var_temp,'DD/MM/YYYY HH24:MI:SS') - var_ngay = 6) THEN
        var_dem := var_dem +1;
    END IF;
    
    WHILE(EXTRACT(MONTH FROM var_temp) = var_thang)
    LOOP
        var_ngay := var_temp;
        var_temp := NEXT_DAY(var_ngay, 'SATURDAY');
        IF(TO_DATE(var_temp,'DD/MM/YYYY HH24:MI:SS') < TO_DATE(LAST_DAY(var_temp),'DD/MM/YYYY HH24:MI:SS')) THEN
            var_dem := var_dem + 2;
        ELSIF(TO_DATE(var_temp,'DD/MM/YYYY HH24:MI:SS') = TO_DATE(LAST_DAY(var_temp),'DD/MM/YYYY HH24:MI:SS')) THEN
            var_dem := var_dem + 1;
        END IF;
    END LOOP;
    RETURN var_dem;
END;
/
/*FUNCTION: tính số giờ làm tiêu chuẩn trong tháng X một nhân viên phải làm*/
CREATE OR REPLACE FUNCTION TinhSoGioLamTieuChuan(var_thang LUONG.THANG%TYPE, var_nam LUONG.NAM%TYPE)
RETURN NUMBER
AS
    var_songaytrongthang NUMBER;
    var_songaycuoituan NUMBER;
BEGIN
    var_songaytrongthang := SoNgayToiDaCuaThang(var_thang,var_nam);
    var_songaycuoituan := SoNgayCuoiTuanTrongThang(var_thang,var_nam);
    
    RETURN (var_songaytrongthang - var_songaycuoituan)*9.5; --giờ làm tiêu chuẩn là từ 7h sáng đến 4h30 chiều.
END;
/
begin
    dbms_output.put_line(SoNgayToiDaCuaThang(7,2022));
    dbms_output.put_line(SoNgayCuoiTuanTrongThang(7,2022));
    dbms_output.put_line(TinhSoGioLamTieuChuan(7,2022));
end;
/
/*FUNCTION: tính số giờ làm thực tế mà nhân viên đó đi làm trong tháng X*/
CREATE OR REPLACE FUNCTION TinhSoGioLamThucTe(var_thang LUONG.THANG%TYPE, var_nam LUONG.NAM%TYPE, var_manv NHANVIEN.MANV%TYPE)
RETURN NUMBER
AS
    var_tonggiolam NUMBER;
BEGIN
    SELECT SUM(SOGIOLAM) INTO var_tonggiolam
    FROM CHAMCONG
    WHERE MANV = var_manv AND EXTRACT(MONTH FROM CHECKOUT) = var_thang AND EXTRACT(YEAR FROM CHECKOUT) = var_nam;
    
    RETURN var_tonggiolam;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 0;
END;
/
/*Function INSERT LUONG*/
CREATE OR REPLACE FUNCTION INSERT_LUONG(var_manv LUONG.MANV%TYPE, var_thang LUONG.THANG%TYPE, var_nam LUONG.NAM%TYPE)
RETURN NUMBER AS
BEGIN
    INSERT INTO LUONG(THANG, NAM, MANV) VALUES(var_thang,var_nam,var_manv);
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/

--Khi thêm một tháng lương cho nhân viên thì lương của nhân viên đó vào tháng đó tự cập nhật.
SET DEFINE OFF;
CREATE OR REPLACE TRIGGER TRIGGER_INSERT_LUONG
BEFORE INSERT ON LUONG
FOR EACH ROW
DECLARE 
    var_luongcoban NHANVIEN.LUONGCOBAN%TYPE;
BEGIN
    SELECT LUONGCOBAN INTO var_luongcoban
    FROM NHANVIEN
    WHERE MANV = :NEW.MANV; 

    :NEW.SOGIOLAMTC := TinhSoGioLamTieuChuan(:NEW.THANG, :NEW.NAM);
    :NEW.SOGIOLAMTT := TinhSoGioLamThucTe(:NEW.THANG, :NEW.NAM, :NEW.MANV);
    :NEW.LUONG := (var_luongcoban/:NEW.SOGIOLAMTC)*:NEW.SOGIOLAMTT;
END;
/
COMMIT;

--Xóa dòng dữ liệu bảng SANPHAM
CREATE OR REPLACE FUNCTION DELETE_SANPHAM(VAR_KHOACHINH NUMBER) RETURN NUMBER
AS
BEGIN
    DELETE FROM SANPHAM WHERE MASP = VAR_KHOACHINH;
    IF (SQL%ROWCOUNT = 0) THEN
        RETURN 0;
END IF;
COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--Xóa dòng dữ liệu bảng KHACHHANG
CREATE OR REPLACE FUNCTION DELETE_KHACHHANG(VAR_KHOACHINH NUMBER) RETURN NUMBER
AS
BEGIN
    DELETE FROM KHACHHANG WHERE MAKH = VAR_KHOACHINH;
    IF (SQL%ROWCOUNT = 0) THEN
        RETURN 0;
    END IF;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--Xóa dòng dữ liệu bảng KHUYENMAI
CREATE OR REPLACE FUNCTION DELETE_KHUYENMAI(VAR_KHOACHINH NUMBER) RETURN NUMBER
AS
BEGIN
    DELETE FROM KHUYENMAI WHERE MAKM = VAR_KHOACHINH;
    IF (SQL%ROWCOUNT = 0) THEN
        RETURN 0;
    END IF;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--Xóa dòng dữ liệu bảng NHACUNGCAP
CREATE OR REPLACE FUNCTION DELETE_NHACUNGCAP(VAR_KHOACHINH NUMBER)RETURN NUMBER
AS
BEGIN
    DELETE FROM NHACUNGCAP WHERE MANCC = VAR_KHOACHINH;
    IF (SQL%ROWCOUNT = 0) THEN
        RETURN 0;
    END IF;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--Xóa dòng dữ liệu bảng NHANVIEN
CREATE OR REPLACE FUNCTION DELETE_NHANVIEN(VAR_KHOACHINH NUMBER)RETURN NUMBER
AS
BEGIN
    DELETE FROM NHANVIEN WHERE MANV = VAR_KHOACHINH;
    IF (SQL%ROWCOUNT = 0) THEN
        RETURN 0;
    END IF;
    COMMIT;
    RETURN 1;
EXCEPTION
    WHEN OTHERS THEN
        RETURN 0;
END;
/
--BẢNG KHÁCH HÀNG
CREATE OR REPLACE PROCEDURE GET_KHACHHANG_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM KHACHHANG ORDER BY MAKH;
    LOCK TABLE KHACHHANG IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM KHACHHANG ORDER BY MAKH;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHACHHANG_BY_MAKH(var_makh IN KHACHHANG.MAKH%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE MAKH = var_makh ORDER BY MAKH;
    LOCK TABLE KHACHHANG IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE MAKH = var_makh ORDER BY MAKH;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHACHHANG_BY_HOTEN(var_hoten IN KHACHHANG.HOTEN%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE HOTEN = var_hoten ORDER BY MAKH;
    LOCK TABLE KHACHHANG IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE HOTEN = var_hoten ORDER BY MAKH;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHACHHANG_BY_SDT(var_sdt IN KHACHHANG.SDT%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE SDT = var_sdt ORDER BY MAKH;
    LOCK TABLE KHACHHANG IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE SDT = var_sdt ORDER BY MAKH;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHACHHANG_BY_LOAIKH(var_loaikh IN KHACHHANG.LOAIKH%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE LOAIKH = var_loaikh ORDER BY MAKH;
    LOCK TABLE KHACHHANG IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM KHACHHANG WHERE LOAIKH = var_loaikh ORDER BY MAKH;
    COMMIT;
END;
/
--BẢNG SẢN PHẨM
CREATE OR REPLACE PROCEDURE GET_SANPHAM_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
    OPEN cursor FOR
    SELECT * FROM SANPHAM ORDER BY MASP;
    LOCK TABLE SANPHAM IN EXCLUSIVE MODE;
    DBMS_LOCK.SLEEP(5);
    OPEN cursor FOR
    SELECT * FROM SANPHAM ORDER BY MASP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_CHITIET(var_masp in SANPHAM.MASP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM WHERE MASP = var_masp ORDER BY MASP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_MASP(var_masp in SANPHAM.MASP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM WHERE MASP = var_masp ORDER BY MASP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_TENSP(var_tensp in SANPHAM.TENSP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM WHERE TENSP = var_tensp ORDER BY MASP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_MAUSAC(var_bien in SANPHAM.MAUSAC%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM WHERE MAUSAC = var_bien ORDER BY MASP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_TENLOAISP(var_bien in LOAISANPHAM.TENLOAISP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM SP WHERE MALOAISP = (SELECT MALOAISP FROM LOAISANPHAM WHERE TENLOAISP = var_bien);
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_SOLUONG(var_bien in CTHD.MASP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM CTHD SP WHERE MASP = var_bien;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_SANPHAM_HOADON(var_bien in CTHD.SOHD%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM SANPHAM SP, CTHD WHERE SP.MASP = CTHD.MASP AND SOHD = var_bien ORDER BY SOHD;
    COMMIT;
END;
/
--BẢNG LOẠI SẢN PHẨM
CREATE OR REPLACE PROCEDURE GET_LOAISANPHAM_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LOAISANPHAM ORDER BY MALOAISP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LOAISANPHAM_TENLOAISP(var_bien in LOAISANPHAM.TENLOAISP%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LOAISANPHAM WHERE TENLOAISP = var_bien ORDER BY MALOAISP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LOAISANPHAM_MALOAISP(var_bien in LOAISANPHAM.MALOAISP%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LOAISANPHAM WHERE MALOAISP = var_bien ORDER BY MALOAISP;
    COMMIT;
END;
/
--bảng nhân viên
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_MANV(var_bien in NHANVIEN.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN WHERE MANV = var_bien ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_HOTEN(var_bien in NHANVIEN.HOTEN%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN WHERE HOTEN = var_bien ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_SDT(var_bien in NHANVIEN.SDT%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN WHERE SDT = var_bien ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_CMND(var_bien in NHANVIEN.CMND%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN WHERE CMND = var_bien ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHANVIEN_MANV_CMND(var_bien1 in NHANVIEN.MANV%TYPE, 
var_bien2 in NHANVIEN.CMND%TYPE, cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHANVIEN WHERE MANV = var_bien1 AND CMND = var_bien2 ORDER BY MANV;
    COMMIT;
END;
/
--BẢNG LƯƠNG
CREATE OR REPLACE PROCEDURE GET_LUONG_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LUONG ORDER BY MANV, THANG, NAM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LUONG_MANV(var_bien in LUONG.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LUONG WHERE MANV = var_bien ORDER BY MANV, THANG, NAM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LUONG_THANG(var_bien in LUONG.THANG%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LUONG WHERE THANG = var_bien ORDER BY MANV, THANG, NAM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LUONG_NAM(var_bien in LUONG.NAM%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM LUONG WHERE NAM = var_bien ORDER BY MANV, THANG, NAM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_LUONG_THANG_MAX(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT MAX(THANG) FROM LUONG;
    COMMIT;
END;
/
--KHUYẾN MÃI
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI ORDER BY MAKM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_MAKM(var_bien in KHUYENMAI.MAKM%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI WHERE MAKM = var_bien ORDER BY MAKM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_TENKM(var_bien in KHUYENMAI.TENKM%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI WHERE TENKM = var_bien ORDER BY MAKM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_PHANTRAM(var_bien in KHUYENMAI.PHANTRAM%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI WHERE PHANTRAM = var_bien ORDER BY MAKM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_HOPLE(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI WHERE NGAYBD <= SYSDATE AND
    NGAYKT >= SYSDATE OR NGAYBD IS NULL ORDER BY MAKM;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_KHUYENMAI_HOADON(var_bien in CTKM.SOHD%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM KHUYENMAI KM, CTKM WHERE KM.MAKM = CTKM.MAKM AND SOHD = var_bien ORDER BY SOHD;
    COMMIT;
END;
/
--BẢNG NHÀ CUNG CẤP
CREATE OR REPLACE PROCEDURE GET_NHACUNGCAP_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHACUNGCAP ORDER BY MANCC;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHACUNGCAP_MANCC(var_bien in NHACUNGCAP.MANCC%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHACUNGCAP WHERE MANCC = var_bien ORDER BY MANCC;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHACUNGCAP_TENNCC(var_bien in NHACUNGCAP.TENNCC%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHACUNGCAP WHERE TENNCC = var_bien ORDER BY MANCC;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NHACUNGCAP_SDT(var_bien in NHACUNGCAP.SDT%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM NHACUNGCAP WHERE SDT = var_bien ORDER BY MANCC;
    COMMIT;
END;
/
--BẢNG HÓA ĐƠN
CREATE OR REPLACE PROCEDURE GET_HOADON_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM HOADON ORDER BY SOHD;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_HOADON_SOHD(var_bien in HOADON.SOHD%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM HOADON WHERE SOHD = var_bien ORDER BY SOHD;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_HOADON_MANV(var_bien in HOADON.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM HOADON WHERE MANV = var_bien ORDER BY SOHD;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_HOADON_MAKH(var_bien in HOADON.MAKH%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM HOADON WHERE MAKH = var_bien ORDER BY SOHD;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_HOADON_SOHD_MAX(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT MAX(SOHD) FROM HOADON;
    COMMIT;
END;
/
--BẢNG CHẤM CÔNG
CREATE OR REPLACE PROCEDURE GET_CHAMCONG_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM CHAMCONG ORDER BY MANV, CHECKIN;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_CHAMCONG_MANV(var_bien in CHAMCONG.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM CHAMCONG WHERE MANV = var_bien ORDER BY MANV;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_CHAMCONG_CHECKIN_MAX(var_bien in CHAMCONG.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT MAX(CHECKIN) FROM CHAMCONG WHERE MANV = var_bien;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_CHAMCONG_CHECKOUT_MAX(var_bien in CHAMCONG.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT MAX(CHECKOUT) FROM CHAMCONG WHERE MANV = var_bien;
    COMMIT;
END;
/
--BẢNG PHIẾU NHẬP
CREATE OR REPLACE PROCEDURE GET_PHIEUNHAP_ALL(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM PHIEUNHAP PN, CTPN
    WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP ORDER BY PN.MAPHIEUNHAP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_PHIEUNHAP_MAPN(var_bien in PHIEUNHAP.MAPHIEUNHAP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM PHIEUNHAP PN, CTPN
    WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND PN.MAPHIEUNHAP = var_bien ORDER BY PN.MAPHIEUNHAP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_PHIEUNHAP_MANV(var_bien in PHIEUNHAP.MANV%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM PHIEUNHAP PN, CTPN
    WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND MANV = var_bien ORDER BY PN.MAPHIEUNHAP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_PHIEUNHAP_MASP(var_bien in CTPN.MASP%TYPE,  cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT * FROM PHIEUNHAP PN, CTPN
    WHERE PN.MAPHIEUNHAP = CTPN.MAPHIEUNHAP AND MASP = var_bien ORDER BY PN.MAPHIEUNHAP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_PHIEUNHAP_MAPHIEUNHAP_MAX(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT MAX(MAPHIEUNHAP) FROM PHIEUNHAP;
    COMMIT;
END;
/
--DOANH THU
CREATE OR REPLACE PROCEDURE GET_THANG_DOANHTHU(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT DISTINCT(EXTRACT( MONTH FROM NGAYHD )) AS MONTH FROM HOADON;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NAM_DOANHTHU(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT DISTINCT(EXTRACT( YEAR FROM NGAYHD )) AS YEAR FROM HOADON;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_THANG_NHAPHANG(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT DISTINCT(EXTRACT( MONTH FROM NGAYNHAP )) AS MONTH FROM PHIEUNHAP;
    COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE GET_NAM_NHAPHANG(cursor OUT SYS_REFCURSOR)
AS
BEGIN
    OPEN cursor FOR
    SELECT DISTINCT(EXTRACT( YEAR FROM NGAYNHAP )) AS YEAR FROM PHIEUNHAP;
    COMMIT;
END;
/