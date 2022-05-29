/*========================== Thêm sản phẩm ==========================*/
SELECT * FROM user_qlch.SANPHAM;
DELETE FROM user_qlch.SANPHAM;
--đl
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại III', 34000, 1, N'Hồng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại II', 38000, 1, N'Hồng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose Sweet Avalanche Premium - Loại I', 40000, 1, N'Hồng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose sweet avalanche premium.jpg'); 

--ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium', 50000, 1, N'Đỏ', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium - Loại II', 55000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose red naomi premium - Loại I', 60000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng RED NAOMI.jpg'); 

--ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại III', 34000, 1, N'Vàng', 250, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại II', 38000, 1, N'Vàng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose peach avalanche premium - Loại I', 40000, 1, N'Vàng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose peach avalanche premium.jpg');

---DL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose avalanche premium - Loại II', 38000, 1, N'Trắng', 200, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose avalanche premium.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng – Rose avalanche premium - Loại I', 40000, 1, N'Trắng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng - Rose avalanche premium.jpg');

INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại III', 60000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại II',70000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng cam Spirit - Loại I',80000, 1, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng cam SPIRIT.jpg');
---ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng đỏ Đà Lạt', 20000, 1, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Đà Lạt đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng vàng Đà Lạt', 20000, 1, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng đà lạt vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng trắng Đà Lạt', 20000, 1, N'Trắng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Đà Lạt trắng.jpg');

----HOA CẨM CHƯỚNG --3 ---ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Light Pink Barbara', 120000, 3, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation light pink barbara.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Barbara', 120000, 3, N'Vàng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation barbara.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation  kiss', 120000, 3, N'Cam', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation kiss.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Pink Donan', 120000, 3, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation pink dona.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cẩm chướng nhánh – Carnation Light Star', 120000, 3, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Carnation light star.jpg');

-----HƯỚNG DƯƠNG --6 ---ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại III', 20000, 6, N'Vàng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại II', 25000, 6, N'Vàng', 120, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hướng dương - Loại I', 30000, 6, N'Vàng', 115, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hướng dương.jpg');

----CẨM TÚ CẦU --7
--ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh III', 100000, 7, N'Xanh', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh II', 120000, 7, N'Xanh', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu xanh I', 150000, 7, N'Xanh', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu xanh.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng III', 100000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng II', 120000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu trắng I', 150000, 7, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu - trắng.jpg');

---THỦY TIÊN --10 ---ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên cam III', 9000, 10, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên cam II', 12000, 10, N'Cam', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên cam I', 15000, 10, N'Cam', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng III', 9000, 10, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng II', 12000, 10, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên trắng I', 15000, 10, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng III', 9000, 10, N'Vàng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng II', 12000, 10, N'Vàng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên vàng I', 15000, 10, N'Vàng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ III', 9000, 10, N'Đỏ', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ II', 12000, 10, N'Đỏ', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thủy tiên đỏ I', 15000, 10, N'Đỏ', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\thủy tiên đỏ.jpg');

--HOA SEN --11 --ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa sen III', 30000, 11, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa sen II', 40000, 11, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa sen I', 45000, 11, N'Trắng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa sen.jpg');

--HOA BABY --12 ----ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa baby – Baby’s Breath II', 20000, 12, N'Trắng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa baby.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó hoa baby – Baby’s Breath', 45000, 12, N'Trắng', 15, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa baby.jpg'); --3C/bó

--HOA ĐỒNG TIỀN --14 ----ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ III', 10000, 14, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ II', 12000, 14, N'Đỏ', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền đỏ I', 15000, 14, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng III', 10000, 14, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng II', 12000, 14, N'Vàng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền vàng I', 15000, 14, N'Vàng', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam III', 10000, 14, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam II', 12000, 14, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg'); --+10
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền cam I', 15000, 14, N'Cam', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng III', 10000, 14, N'Hồng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng II', 12000, 14, N'Hồng', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa đồng tiền hồng I', 15000, 14, N'Hồng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đồng tiền hồng.jpg');

----SALEM --15 ----ĐL
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem tím III', 15000, 15, N'Tím', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem tím II', 20000, 15, N'Tím', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem tím I', 25000, 15, N'Tím', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem tím.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem vàng III', 15000, 15, N'Vàng', 46, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem vàng II', 20000, 15, N'Vàng', 83, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem vàng I', 25000, 15, N'Vàng', 12, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Salem trắng', 25000, 15, N'Trắng', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\salem trắng.jpg');

---GIAY GOI HOA --22
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Blooming Times', 50000, 22, NULL, 200, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy báo.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Giấy báo xi măng', 50000, 22, N'Nâu' , 210, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy xi măng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Giấy mika màu', 45000, 22, N'Tone Hồng Trắng' , 156, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\giấy mika.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Vải bố vintage', 50000, 22, N'Nâu' , 178, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\vải bố.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giấy gói hoa - Vải gấm', 70000, 22, N'Nâu' , 100, NULL, N'\CuaHangHoa\AnhSanPham\GiayGoiHoa\vải gấm.jpg');

---KHUNG HOA 23
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Hoa Lavender', 350000, 23, N'Tím', 20, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  hoa lavender.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Lá Hạt Dẻ', 350000, 23, N'Đỏ', 10, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  lá hạt dẻ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Lá Khuynh Diệp', 350000, 23, N'Xanh', 15, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  lá khuynh diệp.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Khung Hoa Lá Ép Khô – Hoa Cúc Họa Mi', 350000, 23, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\KhungHoaLaEpKho\khung hoa lá ép khô -  hoa cúc họa mi.jpg');

----VÒNG WEARTH --19 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Vòng Wearth 1', 300000, 19, N'Tone Xanh', 5, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 1.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Vòng Wearth 2', 350000, 19, N'Tone Nâu', 5, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 2.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Vòng Wearth 3', 450000, 19, N'Tone Xanh', 4, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 3.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Vòng Wearth 4', 300000, 19, N'Tone Xanh', 3, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 4.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Vòng Wearth 5', 450000, 19, N'Tone Nâu', 7, NULL, N'\CuaHangHoa\AnhSanPham\VongWearth\vòng wearth 5.jpg');

---CÀI ÁO --25
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 1', 100000, 25, NULL, 6, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 1.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 2', 100000, 25, NULL, 3, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 2.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cài áo - hoa hồng trắng 3', 100000, 25, NULL, 2, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo hoa hồng trắng 3.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cài áo - tone trắng', 50000, 25, NULL, 3, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo tone trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cài áo - tulip trắng', 100000, 25, NULL, 4, NULL, N'\CuaHangHoa\AnhSanPham\CaiAoChuRe\cài áo tulip trắng.jpg');

---BÌNH HOA --21 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình gốm Một chú mèo', 400000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm Một Chú Mèo.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình gốm xanh ngọc bích', 800000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm xanh ngọc bích.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình gốm Xích Châu', 550000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình gốm Xích Châu.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình hoa gốm Biên Hòa xưa', 780000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình hoa gốm Biên Hòa xưa.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình hoa nắng mai', 600000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\bình nắng mai.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bình hoa họa tiết cành sen', 600000, 21, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBinh\Bình hoa họa tiết cành sen.jpg');

---THIỆP --20
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thiệp – Happy Women’s Day', 100000, 20, NULL, 40, NULL, N'\CuaHangHoa\AnhSanPham\Thiep\HAPPY WOMEN DAY.png');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Thiệp – Chúc một ngày tốt lành', 100000, 20, NULL, 60, NULL, N'\CuaHangHoa\AnhSanPham\Thiep\CHÚC MỘT NGÀY TỐT LÀNH.png');

/*============================= Tạo phiếu nhập ===============================*/
SELECT * FROM user_qlch.PHIEUNHAP;
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 2, '25/05/2022', 4); --Giay
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 1, '27/05/2022', 3); --DL
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 3, '27/05/2022', 5); --Binh
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 2, '29/05/2022', 6);--Giấy
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 3, '29/05/2022', 4);--Bình
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 5, '29/05/2022', 6); --Khung, Vòng wearth
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 1, '01/06/2022', 3);  --DL
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 1, '02/06/2022', 5); --DL

/*========================= Nhập Sản Phẩm ===========================*/
--Giấy gói hoa
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(120, 1, 200, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(121, 1, 210, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(122, 1, 156, 27000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(123, 6, 178, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(124, 6, 100, 42000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(160, 6, 40, 60000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(161, 6, 60, 60000);

--Hoa trên đà lạt từ nhà cung cấp: Dalats Hasfarm
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(6, 2, 298, 20000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(7, 2, 238, 22000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(8, 2, 271, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(9, 2, 206, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(10, 2, 156, 33000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(11, 2, 153, 42000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(12, 2, 250, 22000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(13, 2, 204, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(14, 2, 100, 25000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(15, 2, 280, 22000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(16, 2, 106, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(20, 2, 150, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(21, 2, 150, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(87, 2, 50, 18000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(88, 2, 40, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(89, 2, 50, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(90, 2, 120, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(92, 2, 20, 96000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(93, 2, 20, 108000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(94, 2, 150, 6000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(95, 2, 150, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(96, 2, 100, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(97, 2, 150, 6000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(98, 2, 150, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(99, 2, 60, 9000);

INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(22, 9, 198, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(34, 9, 50, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(35, 9, 30, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(36, 9, 35, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(37, 9, 30, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(38, 9, 50, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(48, 9, 100, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(49, 9, 187, 15000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(50, 9, 115, 18000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(54, 9, 80, 60000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(55, 9, 90, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(56, 9, 52, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(100, 9, 100, 6000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(101, 9, 110, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(102, 9, 80, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(103, 9, 80, 6000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(104, 9, 90, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(105, 9, 100, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(106, 9, 40, 9000);

INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(75, 11, 50, 5000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(76, 11, 40, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(77, 11, 50, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(78, 11, 80, 5000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(79, 11, 90, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(80, 11, 70, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(81, 11, 50, 5000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(82, 11, 40, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(83, 11, 50, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(84, 11, 50, 5000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(85, 11, 40, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(86, 11, 50, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(107, 11, 60, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(108, 11, 37, 15000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(109, 11, 46, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(110, 11, 83, 12000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(111, 11, 12, 15000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(112, 11, 136, 15000);

-- BÌNH HOA: Brangift 
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(154, 3, 1, 300000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(155, 3, 1, 650000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(156, 3, 1, 410000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(157, 3, 1, 630000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(158, 3, 1, 420000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(159, 3, 1, 420000);

-- NHẬP KHUNG HOA TỪ: UMIND
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(125, 8, 20, 210000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(126, 8, 10, 210000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(127, 8, 15, 210000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(128, 8, 20, 210000);

-- NHẬP VÒNG WEARTH TỪ: UMIND
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(129, 8, 5, 180000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(130, 8, 5, 210000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(131, 8, 4, 270000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(132, 8, 3, 180000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(133, 8, 7, 270000);

COMMIT;







