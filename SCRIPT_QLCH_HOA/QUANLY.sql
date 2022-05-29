/*========================== Thêm loại sản phẩm ==========================*/
SELECT * FROM user_qlch.LOAISANPHAM;
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa hồng', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Mao lương', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa cẩm chướng', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Cúc mẫu đơn', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa mẫu đơn', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hướng dương', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Cẩm tú cầu', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Tulip', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Đào', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Thủy tiên', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa sen', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa baby', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Tuyết mai', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Đồng tiền', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Salem', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Box hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Giỏ hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Hoa cưới', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Vòng wearth', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Thiệp', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Bình hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Giấy gói hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Khung hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Bó hoa', NULL);
INSERT INTO user_qlch.LOAISANPHAM VALUES(user_qlch.SEQ8_MALOAISP.NEXTVAL, N'Cài áo', NULL);

/*========================== Thêm sản phẩm ==========================*/
SELECT * FROM user_qlch.SANPHAM;
DELETE FROM user_qlch.SANPHAM;
----HOA HỒNG --1
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại III', 200000, 1, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại II', 250000, 1, N'Cam', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng Juliet - Loại I', 300000, 1, N'Cam', 65, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng juliet.jpg'); 

INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng Aoi', 45000, 1, N'Hồng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng AOI.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa hồng Keira', 40000, 1, N'Cam', 83, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa hồng Keira.jpg'); 

---HOA MẪU ĐƠN --5
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Hồng - Loại III', 80000, 5, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Hồng - Loại II', 120000, 5, N'Hồng', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Hồng - Loại I', 150000, 5, N'Hồng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony hồng.jpg');
-----
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại III', 80000, 5, N'Đỏ', 35, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại II', 120000, 5, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony Đỏ - Loại I', 150000, 5, N'Đỏ', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony vàng', 150000, 5, N'Vàng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony vàng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mẫu đơn – Peony trắng', 150000, 5, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa mẫu đơn - peony trắng.jpg');

----CÚC MẪU ĐƠN --4
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn – Blue peony chrysanthemum - xanh',100000, 4, N'Xanh', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn xanh.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn –Violet peony chrysanthemum chrysanthemum - tím', 100000, 4, N'Tím', 50, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cúc mẫu đơn –Violet peony chrysanthemum chrysanthemum - cam', 90000, 4, N'Cam', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cúc mẫu đơn cam.jpg'); 

----HOA MAO LƯƠNG --2
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại III', 12000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại II', 15000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên đỏ - Loại I', 17000, 2, N'Đỏ', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương - màu đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại III', 12000, 2, N'Cam', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại II', 15000, 2, N'Cam', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên cam - Loại I', 17000, 2, N'Cam', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương - màu coral cam đào.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên tím', 17000, 2, N'Tím', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\mao lương tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên vàng', 17000, 2, N'Vàng', 130, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương vàng.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Mao lương – Hoa hoàng liên trắng', 17000, 2, N'Trắng', 130, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\Mao lương trắng.jpg');

----CẨM TÚ CẦU --7
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím III', 100000, 7, N'Tím', 70, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím II', 120000, 7, N'Tím', 70, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Cẩm tú cầu tím I', 150000, 7, N'Tím', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\cẩm tú cầu tím.jpg');

----TULIP --8
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím III', 50000, 8, N'Tím', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím II', 60000, 8, N'Tím', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip tím I', 70000, 8, N'Tím', 100, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip tím.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng III', 30000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng II', 40000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip hồng I', 50000, 8, N'Hồng', 150, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng III', 30000, 8, N'Trắng', 80, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng II', 40000, 8, N'Trắng', 90, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg'); 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Uất Kim Hương - Tulip trắng I', 50000, 8, N'Trắng', 60, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\hoa tulip trắng.jpg'); 

----HOA ĐÀO --9
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura hồng III', 650000, 9, N'Hồng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura hồng II', 800000, 9, N'Hồng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura hông I', 900000, 9, N'Hồng', 25, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng III', 650000, 9, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng II', 800000, 9, N'Trắng', 30, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Đào Sakura trắng I', 900000, 9, N'Trắng', 40, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\đào sakura trắng.jpg');

--HOA TUYẾT MAI --13
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Tuyết Mai – Mã Thiên Hương II', 160000, 13, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\tuyết mai.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Tuyết Mai – Mã Thiên Hương I', 180000, 13, N'Trắng', 20, NULL, N'\CuaHangHoa\AnhSanPham\HoaCanh\tuyết mai.jpg');

----BOX HOA --16
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Box hoa hồng – Một chút thảnh thơi', 600000, 16, N'hồng', 6, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone hồng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Box hoa đỏ – Một chút thảnh thơi', 600000, 16, N'Đỏ', 3, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone đỏ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Box hoa cam – Một chút thảnh thơi', 600000, 16, N'Cam', 2, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone cam.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Box hoa trắng – Một chút thảnh thơi', 600000, 16, N'Trắng', 8, NULL, N'\CuaHangHoa\AnhSanPham\BoxHoa\một chút thảnh thơi tone trắng.jpg');

----GIỎ HOA --17
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – A Little Summer', 600000, 17, N'Tone Cam', 5, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\A little summer.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – Ngọt ngào 1', 450000, 17, N'Tone Hồng', 4, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\Ngọt ngào 1.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Giỏ Hoa – Ngọt ngào 2', 450000, 17, N'Tone Hồng', 3, NULL, N'\CuaHangHoa\AnhSanPham\HoaGio\Ngọt ngào 2.jpg');

----BÓ HOA --24 
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Cẩm Tú Cầu Blue', 500000, 24, N'Tone Xanh', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Cẩm Tú Cầu Blue.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Giản Đơn', 500000, 24, N'Tone Trắng', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Giản Đơn.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Hướng Dương Gọi Hạ', 500000, 24, N'Tone Vàng', 6, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\bó Hướng Dương gọi Hạ.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tròn Xoe Hồng Aoi', 650000, 24, N'Tone Hồng', 8, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Tròn Xoe - Hồng AOI.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tròn Xoe Hồng Keira', 650000, 24, N'Tone Cam', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Bó Tròn Xoe - Hồng Keira.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Tuyệt Đối Hồn Nhiên', 800000, 24, N'Tone Capuchino', 4, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Tuyệt Đối Hồn Nhiên - Tone Capuchino.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – On The Rainy Day', 700000, 24, N'Tone Cam Vàng', 5, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\On rainy day.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Hồn Nhiên', 500000, 24, N'Tone Trắng', 6, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\hồn nhiên tone trắng.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Bó Hoa – Bó Spring Signature Bouquet', 900000, 24, N'Tone Capuchino', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaBo\Spring Signature Bouquet.jpg');

----HOA CƯỚI --18
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day Tulip', 700000, 18, N'Tone Trắng', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day - tulip.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 1', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 1.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 2', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 2.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 3', 1000000, 18, N'Tone Cam', 2, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 3.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 4', 900000, 18, N'Tone Capuchino', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 4.jpg');
INSERT INTO user_qlch.SANPHAM VALUES(user_qlch.SEQ2_MASP.NEXTVAL, N'Hoa cưới – On Your Wedding Day 5', 800000, 18, N'Tone Trắng', 1, NULL, N'\CuaHangHoa\AnhSanPham\HoaCuoi\on your wedding day 5.jpg');

/*============================ Thêm Nhà Cung Cấp =============================*/
SELECT * FROM user_qlch.NHACUNGCAP;
DELETE FROM user_qlch.NHACUNGCAP;
----------------------------------
INSERT INTO user_qlch.NHACUNGCAP VALUES(user_qlch.SEQ5_MANCC.NEXTVAL, N'Dalats Hasfarm', N'2C Trương Văn Hoàn, P.9, Tp.Đà Lạt, Tỉnh Lâm Đồng', '0969316685'); --Hoa dalat
INSERT INTO user_qlch.NHACUNGCAP VALUES(user_qlch.SEQ5_MANCC.NEXTVAL, N'Nam Long', N'27 Nguyễn Văn Vịnh, Hiệp Tân, Quận Tân Phú, Tp.HCM', '0843620620'); --giấy
INSERT INTO user_qlch.NHACUNGCAP VALUES(user_qlch.SEQ5_MANCC.NEXTVAL, N'Brangift', N'21 Cộng Hòa, P.4, Quận Tân Bình, Tp.HCM', '0945998009'); --Bình
INSERT INTO user_qlch.NHACUNGCAP VALUES(user_qlch.SEQ5_MANCC.NEXTVAL, N'TRUMXNK', N'212 Khuông Việt, P.Tân Phú Trung, Q.Tân Phú, Tp.HCM', '0363127802'); --nhập khẩu
INSERT INTO user_qlch.NHACUNGCAP VALUES(user_qlch.SEQ5_MANCC.NEXTVAL, N'UMIND', N'532A Đường Láng, Quận Đống Đa, Hà Nội', '0982137209'); --VÒNG

/*============================ Thêm Nhân Viên =============================*/
SELECT * FROM user_qlch.NHANVIEN;
DELETE FROM user_qlch.NHANVIEN;
ALTER SESSION SET NLS_DATE_FORMAT='DD/MM/YYYY HH24:MI:SS';
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Đinh Mạnh Hùng', N'384 Đường Nam Kỳ Khởi Nghĩa, Phường 8, Quận 3, TP.HCM', '0760646138','034298398071','01/07/1998', '02/05/2022', 5500000, N'Nhân viên kho', 'Nam');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Võ Văn Đạt', N'221 Đường Nam Kỳ Khởi Nghĩa, Phường 8, Quận 3, TP.HCM', '0363674438','034211587071','14/07/1996', '02/05/2022', 5500000, N'Nhân viên kho', 'Nam');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Trần Quốc Toàn', N'312 Đường Võ Văn Kiệt, Phường Cô Giang, Quận 1, TP.HCM', '0397172623','010200108272', '16/07/2000', '02/05/2022',5500000, N'Nhân viên kho', 'Nam');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Nguyễn Hữu Thắng', N'449 Đường Trường Chinh, Phường 14, Quận Tân Bình, TP.HCM', '0835169040','011298193420', '23/05/1998', '02/05/2022',5500000, N'Nhân viên kho', 'Nam');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Mai Thị Trinh', N'10 Nguyễn Kiêm, Phường 3, Quận Gò Vấp, TP.HCM', '0326786536','002395204812', '04/04/1995', '02/05/2022',5000000, N'Thu ngân', 'Nữ');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Võ Thu Thảo', N'278 Võ Văn Ngân, Phường Bình Thọ, Thủ Đức, TP.HCM', '0810640057','025394332891','26/04/1994', '02/05/2022',5000000, N'Thu ngân', 'Nữ');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Lê Thị Thanh Trúc', N'32 Đặng Văn Bi, Phường Bình Thọ, Thủ Đức, TP.HCM', '0982544013','010367332992','15/01/1994', '02/05/2022',5000000, N'Thu ngân', 'Nữ');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Hà Thị Loan', N'99 Đường Đõ Xuân Hợp, Phường Phước Long B, Thủ Đức, TP.HCM', '0355650107','034399016287', '03/05/1999', '02/05/2022',5000000, N'Bán hàng', 'Nữ');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Hà Trần Quốc Tiến', N'333 Đường Lê Văn Sơ, Phường 1, Quận  Tân Bình, TP.HCM', '0363698684','031295732981','17/06/1995', '02/05/2022',5000000, N'Bán hàng', 'Nam');
INSERT INTO user_qlch.NHANVIEN VALUES (user_qlch.SEQ4_MANV.NEXTVAL, N'Vũ Thảo Linh', N'78 Đường CMT8, Phường 6, Quận 3, TP.HCM', '0335070943','015320013579','10/10/1996','02/05/2022',5000000, N'Bán hàng', 'Nữ');

/*============================ Tạo phiếu nhập =============================*/
SELECT * FROM user_qlch.PHIEUNHAP;
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 4, '28/05/2022', 1); --Nhập khẩu 4
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 4, '29/05/2022', 1); --5
INSERT INTO user_qlch.PHIEUNHAP(MAPHIEUNHAP, MANCC, NGAYNHAP, MANV) VALUES(user_qlch.SEQ3_MAPHIEUNHAP.NEXTVAL, 4, '02/06/2022', 2); --10

/*============================== Nhập sản phẩm ===============================*/
SELECT * FROM user_qlch.CTPN;
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(1, 4, 100, 140000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(2, 4, 98, 175000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(3, 4, 65, 210000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(4, 4, 224, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(5, 4, 164, 25000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(17, 4, 50, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(18, 4, 68, 36000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(19, 4, 54, 42000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(23, 4, 54, 48000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(69, 8, 30, 500000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(70, 8, 20, 600000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(24, 4, 50, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(25, 4, 44, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(26, 4, 35, 48000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(27, 4, 30, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(28, 4, 32, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(29, 4, 20, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(30, 4, 38, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(31, 4, 50, 60000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(32, 4, 50, 60000);

INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(33, 5, 44, 54000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(39, 5, 100, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(40, 5, 100, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(41, 5, 112, 10000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(42, 5, 155, 7000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(43, 5, 155, 9000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(44, 5, 111, 10000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(45, 5, 150, 10000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(46, 5, 138, 10000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(47, 5, 263, 10000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(51, 5, 70, 60000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(52, 5, 70, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(53, 5, 60, 90000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(57, 5, 50, 60000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(58, 5, 68, 72000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(59, 5, 50, 90000);

INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(60, 10, 100, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(61, 10, 150, 36000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(62, 10, 100, 42000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(63, 10, 150, 18000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(64, 10, 150, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(65, 10, 150, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(66, 10, 80, 18000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(67, 10, 114, 24000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(68, 10, 60, 30000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(71, 10, 25, 650000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(72, 10, 40, 500000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(73, 10, 30, 600000);
INSERT INTO user_qlch.CTPN(MASP, MAPHIEUNHAP, SLNHAP, GIANHAP) VALUES(74, 10, 40, 650000);


/*============================= Nhập Khuyến Mãi ==============================*/
SELECT * FROM user_qlch.KHUYENMAI;
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Sinh nhật đầu tiên',0.2,'27/05/2023 00:00:00','30/05/2023 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Tưng bừng khai trương',0.3,'27/05/2022','31/05/2022');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Sinh nhật cửa hàng 2024',0.2,'27/05/2024 00:00:00','30/05/2024 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Ngày giải phóng Miền Nam - Thống nhất đất nước 2023',0.1,'30/04/2023 00:00:00','30/04/2023 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Sinh nhật khách hàng',0.2,NULL,NULL);
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Ngày lễ tình nhân 2023',0.1,'14/02/2023 00:00:00','14/02/2023 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Ngày nhà giáo Việt Nam 20-11-2022',0.1,'20/11/2022 00:00:00','20/11/2022 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Ngày phụ nữ Việt Nam 20-10-2022',0.1,'20/10/2022 00:00:00', '20/10/2022 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Ngày quốc tế phụ nữ 8-3-2023',0.1,'08/03/2023 00:00:00','08/03/2023 23:59:59');
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Khuyến mãi cho đơn hàng trên 5 triệu',0.05,NULL,NULL);
INSERT INTO user_qlch.KHUYENMAI VALUES(user_qlch.SEQ6_MAKM.NEXTVAL,N'Khuyến mãi cho đơn hàng trên 10 triệu',0.1,NULL,NULL);

/*============================= Thêm Khách Hàng ==============================*/
SELECT * FROM user_qlch.KHACHHANG;
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY HH24:MI:SS';
--ngày 27/5
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Nguyễn Văn Anh','0912373899',N'234 Đ. Tô Ngọc Vân, P.Linh Chiểu, TP. Thủ Đức, TP. Hồ Chí Minh','22/02/1998',NULL,'Nam');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Lê Thị Ngọc Mai','0979132947',N'87 Đ. Lê Văn Duyệt , Phường 3, Quận Bình Thạnh, TP. Hồ Chí Minh','12/03/2000',NULL,'Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Phan Thị Kim Oanh','0984287811',N'1128 Đ. Kha Vạn Cân, P.Linh Chiểu, TP. Thủ Đức, TP. Hồ Chí Minh','30/12/1995',NULL,'Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Khương Hằng Nga','0914609066',N'365 Đ. Kha Vạn Cân, P. Hiệp Bình Chánh, TP. Thủ Đức, TP. Hồ Chí Minh','21/04/1997',N'Không xịt mùi hương vào hoa','Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Dương Thị Hồng Thắm','0975025199',N'226 Đ. Nguyễn Thái Sơn, Phường 3, Quận Gò Vấp, TP. Hồ Chí Minh','03/05/1989',NULL,'Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Vũ Thị Mai Thoa','0967701212',N'965 Đ. Quang Trung, Phường 14, Quận Gò Gấp, TP. Hồ Chí Minh','11/09/1990',N'Liên hệ khách hàng khi vừa nhập hoa hồng Pháp','Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Trương Thúy Hằng','0869516563',N'123/6 Đ. Cao Thắng, Phường 17, Quận Phú Nhuận, TP. Hồ Chí Minh','18/09/1999',NULL,'Nữ');
INSERT INTO user_qlch.KHACHHANG(MAKH,HOTEN,SDT,DIACHI,NGAYSINH,GHICHU,GIOITINH) VALUES (user_qlch.SEQ1_MAKH.NEXTVAL,N'Đặng Ngọc Sơn','0967771212',N'12 Đường số 4, P. Tăng Nhơn Phú B, TP. Thủ Đức, TP. Hồ Chí Minh','05/12/2001',NULL,'Nam');

COMMIT;