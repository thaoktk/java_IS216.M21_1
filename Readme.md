# GIỚI THIỆU ĐỒ ÁN

*TIỆM HOA BÌNH YÊN* là 1 app hệ thống quản lý kinh doanh về mặt hàng hoa tươi dành cho admin. Phần mềm được xây dựng với ngôn ngữ chính là Java, thư viện đồ họa GUI Java Swing. Hệ quản trị cơ sở dữ liệu sử dụng là Oracle 19C. Phần mềm tích hợp các tính năng cơ bản của 1 phần mềm quản lý hệ thống và 1 số tích năng nâng cao khác. Giao diện phần mềm được tối ưu cho trải nghiệm người dùng tốt nhất cho trang quản trị admin.

## CÁC CHỨC NĂNG ĐÃ LÀM

- Chung: 
	
    * Đăng nhập.
    * Xem thông tin tổng quát.

- Người quản lý:

    * Quản lý sản phẩm, xem chi tiết sản phẩm, quản lý loại sản phẩm.
    * Quản lý nhân viên, tính lương cho từng nhân viên, tra cứu lương.
    * Quản lý nhập hàng vào kho, xem chi tiết phiếu nhập, in phiếu nhập.
    * Quản lý khách hàng.
    * Chấm công và tra cứu chấm công.
    * Tạo, tra cứu hóa đơn, xem chi tiết hóa đơn và in hóa đơn.
    * Quản lý đối tác (nhà cung cấp).
    * Quản lý các khuyến mãi.
    * Báo cáo, thống kê doanh thu và số tiền nhập hàng.

- Nhân viên thu ngân:

    * Tạo, tra cứu, in hóa đơn cho khách hàng.
    * Quản lý khách hàng.
    * Tra cứu khuyến mãi.
    * Tra cứu sản phẩm.
    * Chấm công.

- Nhân viên bán hàng: 
    
    * Tra cứu khách hàng.
    * Tra cứu sản phẩm.
    * Tra cứu hóa đơn.
    * Chấm công.
    
- Nhân viên kho:

    * Quản lý nhập hàng vào kho, in phiếu nhập.
    * Quản lý sản phẩm, xem chi tiết sản phẩm.
    * Chấm công.

- Chức năng nâng cao đã làm: chấm công, tính lương nhân viên.

## CÁC THƯ VIỆN NGOÀI ĐÃ SỬ DỤNG
- LGoodDatePicker (download tại đây: [Link](https://github.com/LGoodDatePicker/LGoodDatePicker/releases))
(Lưu ý: hãy chọn bản LGoodDatePicker-11.2.1.jar để có trải nghiệm tốt nhất)

## GIỚI THIỆU CÁC THÀNH VIÊN TRONG NHÓM
| HỌ TÊN | MSSV | FB | SĐT | NHIỆM VỤ | HOÀN THÀNH |
| ------ | ---- | -- | --- | -------- | ---------- |
| Trần Thu Thảo (Nhóm trưởng) | 20520769 | [Thảo Thu Trần](https://www.facebook.com/thaoktk0508) | 0962298125 | Xây dựng các giao diện phần mềm, code các chức năng chính của phần mềm | 100% |
| Võ Thị Hà Trang | 20522043 | [Võ Hà Trang](https://www.facebook.com/h4ch4n) | 0363466904 | Tạo toàn bộ Database, viết báo cáo hệ quản trị, hỗ trợ code thêm | 100% |
| Võ Nữ Diễm Trang | 20521013 | [Diễm Trang](https://www.facebook.com/vo.nu.diem.trang.ltd) | 0913941345 | Thiết kế các hoạt động cho ứng dụng, viết báo cáo phân tích thiết kế, hỗ trợ code thêm | 100% |
| Võ Phạm Thùy Nhung | 20520679 | [Võ Phạm Thùy Nhung](https://www.facebook.com/linh.phong.1829405) | 0783276098 | Tester kiểm tra các test case, lọc bug, viết báo cáo quản lý dự án, hỗ trợ code thêm | 100% |

## CÀI ĐẶT CHƯƠNG TRÌNH PHẦN MỀM

- Hệ quản trị cơ sở dữ liệu Oracle 19C.
- Thư viện sử dụng:
    * Java Swing (Java SE 12 & JSK 12).
    * Apache NetBeans 13.
    * LGoodDatePicker-11.2.1.jar
    * ojdbc11.jar
    * commons-beanutils-1.8.0.jar
    * commons-collections-2.1.1.jar
    * commons-digester-2.1.jar
    * commons-logging-1.1.1.jar
    * dom4j-1.6.1.jar
    * groovy-all-2.0.1.jar
    * jasperreports-5.5.0.jar
    * jasperreports-applet-5.5.0.jar
    * jasperreports-fonts-5.5.0.jar
    * javax.servlet-5.1.12.jar
    * itext-2.1.7.jar
    * org-jruby-jruby.jar
    * org-jdesktop-layout.jar
    * jasper-compiler-jdt.jar
- Các plugin đã sử dụng để tạo report:
    * ${distro.zipfilename.extensions}.nbm
    * iReport-5.5.0.nbm
    * jasperreports-components-plugin-5.5.0.nbm
    * jasperserver-plugin-5.5.0.nbm
    * org-jdesktop-layout-RELEASE65.nbm

## CÁC BƯỚC CHẠY PHẦN MỀM

B1: Clone project về máy, file java nằm trong folder DoAn, có chia các View và mô hình 3 lớp

B2: Cài đặt hệ quản trị cơ sở dữ liệu Oracle 19C

    + https://www.oracle.com/database/technologies/oracle19c-windows-downloads.html
    
B3: Setup database, tạo user trên sqlplus (tên user: c##QLCH_HOA, mật khẩu: Admin123), tạo các table, sequence, chạy sesion ngày tháng -> chạy trigger, procedure, function -> insert dữ liệu -> commit (làm đúng thứ tự)

B4: Cài đặt các thư viện và plugin đã nêu ở trên, chạy chương trình
    + Tài khoản để đăng nhập vào chương trình (tên đăng nhập: mã nhân viên, mật khẩu: cmnd của từng nhân viên), ví dụ: 


	Thu ngân:
	1
	002395204812

	Nhân viên bán hàng: 
	5
	034399016287

	Nhân viên kho:
	2
	010200108272
	
	Quản lý: 
	3
	023289018294
