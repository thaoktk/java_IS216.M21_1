CREATE TABLE SANPHAM(
    MASP NUMBER NOT NULL,
    TENSP NVARCHAR2 (60) NOT NULL UNIQUE,
    GIA NUMBER NOT NULL,
    MALOAISP NUMBER NOT NULL,
    MAUSAC NVARCHAR2(100) NULL,
    SLSAN NUMBER DEFAULT 0,
    GHICHU NVARCHAR2(255),
    ANHSP NVARCHAR2(255) NOT NULL,
    CONSTRAINT PK_SP PRIMARY KEY(MASP)
)
CREATE SEQUENCE SEQ2_MASP START WITH 1;
--INSERT DATA
SELECT * FROM SANPHAM order by masp;
----HOA HỒNG --1
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại III', 200000, 1, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại II', 250000, 1, N'Cam', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại I', 300000, 1, N'Cam', 65, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg'); 

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng Aoi', 45000, 1, N'Hồng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng AOI.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng Keira', 40000, 1, N'Cam', 83, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Keira.jpg'); 

--đl
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại III', 34000, 1, N'Hồng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại II', 38000, 1, N'Hồng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại I', 40000, 1, N'Hồng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 

--ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium', 50000, 1, N'Đỏ', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium - Loại II', 55000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium - Loại I', 60000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 

--ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại III', 34000, 1, N'Vàng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại II', 38000, 1, N'Vàng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại I', 40000, 1, N'Vàng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');

---DL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose avalanche premium - Loại II', 38000, 1, N'Trắng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose avalanche premium.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose avalanche premium - Loại I', 40000, 1, N'Trắng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose avalanche premium.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại III', 60000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại II',70000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại I',80000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg');
---ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng đỏ Đà Lạt', 20000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Đà Lạt đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng vàng Đà Lạt', 20000, 1, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng đà lạt vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa hồng trắng Đà Lạt', 20000, 1, N'Trắng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Đà Lạt trắng.jpg');
 
---HOA MẪU ĐƠN --5
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony - Loại III', 80000, 5, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony - Loại II', 120000, 5, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony - Loại I', 150000, 5, N'Hồng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg');
-----
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại III', 80000, 5, N'Đỏ', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại II', 120000, 5, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại I', 150000, 5, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony vàng', 150000, 5, N'Vàng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony vàng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony trắng', 150000, 5, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony trắng.jpg');

----CÚC MẪU ĐƠN --4
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn – Blue peony chrysanthemum - xanh',100000, 4, N'Xanh', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn xanh.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn –Violet peony chrysanthemum chrysanthemum - tím', 100000, 4, N'Tím', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn –Violet peony chrysanthemum chrysanthemum - cam', 90000, 4, N'Cam', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn cam.jpg'); 

----HOA CẨM CHƯỚNG --3 ---ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Light Pink Barbara', 120000, 3, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation light pink barbara.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Barbara', 120000, 3, N'Vàng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation barbara.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation  kiss', 120000, 3, N'Cam', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation kiss.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Pink Donan', 120000, 3, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation pink dona.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Light Star', 120000, 3, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation light star.jpg');

----HOA MAO LƯƠNG --2
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại III', 12000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại II', 15000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại I', 17000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại III', 12000, 2, N'Cam', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại II', 15000, 2, N'Cam', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại I', 17000, 2, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên tím', 17000, 2, N'Tím', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên vàng', 17000, 2, N'Vàng', 130, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương vàng.jpg'); 

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên trắng', 17000, 2, N'Trắng', 130, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương trắng.jpg');

-----HƯỚNG DƯƠNG --6 ---ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại III', 20000, 6, N'Vàng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại II', 25000, 6, N'Vàng', 120, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại I', 30000, 6, N'Vàng', 115, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg');

----CẨM TÚ CẦU --7
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím III', 100000, 7, N'Tím', 70, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím II', 120000, 7, N'Tím', 70, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím I', 150000, 7, N'Tím', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');

--ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh III', 100000, 7, N'Xanh', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh II', 120000, 7, N'Xanh', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh I', 150000, 7, N'Xanh', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg'); 

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng III', 100000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng II', 120000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng I', 150000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');

----TULIP --8
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím III', 50000, 8, N'Tím', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím II', 60000, 8, N'Tím', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím I', 70000, 8, N'Tím', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng III', 30000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng II', 40000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng I', 50000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng III', 30000, 8, N'Trắng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng II', 40000, 8, N'Trắng', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg'); 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng I', 50000, 8, N'Trắng', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg'); 

----HOA ĐÀO --9
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura hồng III', 650000, 9, N'Hồng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura hồng II', 800000, 9, N'Hồng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura hông I', 900000, 9, N'Hồng', 25, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng III', 650000, 9, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng II', 800000, 9, N'Trắng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng I', 900000, 9, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');

---THỦY TIÊN --10 ---ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên cam III', 9000, 10, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên cam II', 12000, 10, N'Cam', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên cam I', 15000, 10, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng III', 9000, 10, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng II', 12000, 10, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng I', 15000, 10, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng III', 9000, 10, N'Vàng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng II', 12000, 10, N'Vàng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng I', 15000, 10, N'Vàng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ III', 9000, 10, N'Đỏ', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ II', 12000, 10, N'Đỏ', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ I', 15000, 10, N'Đỏ', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');

--HOA SEN --11 --ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa sen III', 30000, 11, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa sen II', 40000, 11, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa sen I', 45000, 11, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');

--HOA BABY --12 ----ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa baby – Baby’s Breath II', 20000, 12, N'Trắng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa baby.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó hoa baby – Baby’s Breath', 45000, 12, N'Trắng', 15, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa baby.jpg'); --3C/bó

--HOA TUYẾT MAI --13
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Tuyết Mai – Mã Thiên Hương II', 160000, 13, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\tuyết mai.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Tuyết Mai – Mã Thiên Hương I', 180000, 13, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\tuyết mai.jpg');

--HOA ĐỒNG TIỀN --14 ----ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ III', 10000, 14, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ II', 12000, 14, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ I', 15000, 14, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng III', 10000, 14, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng II', 12000, 14, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng I', 15000, 14, N'Vàng', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam III', 10000, 14, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam II', 12000, 14, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg'); --+10
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam I', 15000, 14, N'Cam', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng III', 10000, 14, N'Hồng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng II', 12000, 14, N'Hồng', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng I', 15000, 14, N'Hồng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');

----SALEM --15 ----ĐL
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem tím III', 15000, 15, N'Tím', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem tím II', 20000, 15, N'Tím', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem tím I', 25000, 15, N'Tím', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg'); 

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem vàng III', 15000, 15, N'Vàng', 46, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem vàng II', 20000, 15, N'Vàng', 83, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem vàng I', 25000, 15, N'Vàng', 12, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');

INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Salem trắng', 25000, 15, N'Trắng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem trắng.jpg');

----BOX HOA --16
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Box hoa hồng – Một chút thảnh thơi', 600000, 16, N'hồng', 6, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone hồng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Box hoa đỏ – Một chút thảnh thơi', 600000, 16, N'Đỏ', 3, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone đỏ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Box hoa cam – Một chút thảnh thơi', 600000, 16, N'Cam', 2, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone cam.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Box hoa trắng – Một chút thảnh thơi', 600000, 16, N'Trắng', 8, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone trắng.jpg');

----GIỎ HOA --17
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – A Little Summer', 600000, 17, N'Tone Cam', 5, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\A little summer.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – Ngọt ngào 1', 450000, 17, N'Tone Hồng', 4, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\Ngọt ngào 1.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – Ngọt ngào 2', 450000, 17, N'Tone Hồng', 3, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\Ngọt ngào 2.jpg');

---GIAY GOI HOA --22
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Blooming Times', 50000, 22, NULL, 200, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy báo.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Giấy báo xi măng', 50000, 22, N'Nâu' , 210, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy xi măng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Giấy mika màu', 45000, 22, N'Tone Hồng Trắng' , 156, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy mika.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Vải bố vintage', 50000, 22, N'Nâu' , 178, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\vải bố.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Vải gấm', 70000, 22, N'Nâu' , 100, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\vải gấm.jpg');

---KHUNG HOA 23
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Hoa Lavender', 350000, 23, N'Tím', 20, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  hoa lavender.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Lá Hạt Dẻ', 350000, 23, N'Đỏ', 10, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  lá hạt dẻ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Lá Khuynh Diệp', 350000, 23, N'Xanh', 15, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  lá khuynh diệp.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Hoa Cúc Họa Mi', 350000, 23, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  hoa cúc họa mi.jpg');

----VÒNG WEARTH --19 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Vòng Wearth 1', 300000, 19, N'Tone Xanh', 5, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 1.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Vòng Wearth 2', 350000, 19, N'Tone Nâu', 5, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 2.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Vòng Wearth 3', 450000, 19, N'Tone Xanh', 4, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 3.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Vòng Wearth 4', 300000, 19, N'Tone Xanh', 3, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 4.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Vòng Wearth 5', 450000, 19, N'Tone Nâu', 7, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 5.jpg');

----BÓ HOA --24 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Cẩm Tú Cầu Blue', 500000, 24, N'Tone Xanh', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Cẩm Tú Cầu Blue.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Giản Đơn', 500000, 24, N'Tone Trắng', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Giản Đơn.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Hướng Dương Gọi Hạ', 500000, 24, N'Tone Vàng', 6, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\bó Hướng Dương gọi Hạ.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tròn Xoe Hồng Aoi', 650000, 24, N'Tone Hồng', 8, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Tròn Xoe - Hồng AOI.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tròn Xoe Hồng Keira', 650000, 24, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Tròn Xoe - Hồng Keira.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tuyệt Đối Hồn Nhiên', 800000, 24, N'Tone Capuchino', 4, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Tuyệt Đối Hồn Nhiên - Tone Capuchino.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – On The Rainy Day', 700000, 24, N'Tone Cam Vàng', 5, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\On rainy day.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Hồn Nhiên', 500000, 24, N'Tone Trắng', 6, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\hồn nhiên tone trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Spring Signature Bouquet', 900000, 24, N'Tone Capuchino', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Spring Signature Bouquet.jpg');

----HOA CƯỚI --18
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day Tulip', 700000, 18, N'Tone Trắng', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day - tulip.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 1', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 1.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 2', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 2.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 3', 1000000, 18, N'Tone Cam', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 3.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 4', 900000, 18, N'Tone Capuchino', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 4.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 5', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 5.jpg');

---CÀI ÁO --25
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 1', 100000, 25, NULL, 6, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 1.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 2', 100000, 25, NULL, 3, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 2.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 3', 100000, 25, NULL, 2, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 3.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cài áo - tone trắng', 50000, 25, NULL, 3, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo tone trắng.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Cài áo - tulip trắng', 100000, 25, NULL, 4, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo tulip trắng.jpg');

---BÌNH HOA --21 
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình gốm Một chú mèo', 400000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm Một Chú Mèo.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình gốm xanh ngọc bích', 800000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm xanh ngọc bích.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình gốm Xích Châu', 550000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm Xích Châu.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình hoa gốm Biên Hòa xưa', 780000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình hoa gốm Biên Hòa xưa.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình hoa nắng mai', 600000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình nắng mai.jpg');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Bình hoa họa tiết cành sen', 600000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\Bình hoa họa tiết cành sen.jpg');

---THIỆP --20
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thiệp – Happy Women’s Day', 100000, 20, NULL, 40, NULL, N'\CuaHangHoa\AnhSanPham\Thiep\HAPPY WOMEN DAY.png');
INSERT INTO SANPHAM VALUES(SEQ2_MASP.NEXTVAL, N'Thiệp – Chúc một ngày tốt lành', 100000, 20, NULL, 60, NULL, N'\CuaHangHoa\AnhSanPham\Thiep\CHÚC MỘT NGÀY TỐT LÀNH.png');

COMMIT;
--thành công