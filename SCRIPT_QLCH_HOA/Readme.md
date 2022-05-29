# GIỚI THIỆU ĐỒ ÁN

*TIỆM HOA BÌNH YÊN* là 1 app hệ thống quản lý kinh doanh về mặt hàng hoa tươi dành cho admin. Phần mềm được xây dựng với ngôn ngữ chính là Java, thư viện đồ họa GUI Java Swing. Hệ quản trị cơ sở dữ liệu sử dụng là Oracle 19C. Phần mềm tích hợp các tính năng cơ bản của 1 phần mềm quản lý hệ thống và 1 số tích năng nâng cao khác. Giao diện phần mềm được tối ưu cho trải nghiệm người dùng tốt nhất cho trang quản trị admin.

## CÁC CHỨC NĂNG ĐÃ LÀM

- Chung: 
	
    * Đăng nhập.
    * Xem thông tin tổng quát.

- Người quản lý:

    * Quản lý sản phẩm, xem chi tiết sản phẩm, thêm loại sản phẩm.
    * Quản lý nhân viên, tính lương cho từng nhân viên.
    * Quản lý nhập hàng vào kho, in phiếu nhập.
    * Quản lý khách hàng.
    * Chấm công và tra cứu chấm công.
    * Tạo, tra cứu hóa đơn và in hóa đơn.
    * Quản lý đối tác (nhà cung cấp).
    * Quản lý các khuyến mãi.
    * Báo cáo, thống kê doanh thu và số tiền nhập hàng.

- Nhân viên thu ngân:

    * Tạo, tra cứu, in hóa đơn cho khách hàng.
    * Quản lý khách hàng.
    * Tra cứu khuyến mãi.
    * Tra cứu sản phẩm.

- Nhân viên bán hàng: 
    
    * Tra cứu khách hàng.
    * Tra cứu sản phẩm.
    * Tra cứu hóa đơn.

- Nhân viên kho:

    * Quản lý nhập hàng vào kho, in phiếu nhập.
    * Thêm sản phẩm mới.

## CÁC THƯ VIỆN NGOÀI ĐÃ SỬ DỤNG
- LGoodDatePicker (download tại đây: [Link](https://github.com/LGoodDatePicker/LGoodDatePicker/releases))
(Lưu ý: hãy chọn bản LGoodDatePicker-11.2.1.jar để có trải nghiệm tốt nhất)

## GIỚI THIỆU CÁC THÀNH VIÊN TRONG NHÓM
| HỌ TÊN | MSSV | FB | SĐT | NHIỆM VỤ | HOÀN THÀNH |
| ------ | ---- | -- | --- | -------- | ---------- |
| Trần Thu Thảo (Nhóm trưởng) | 20520769 | [Thảo Thu Trần](https://www.facebook.com/thaoktk0508) | 0962298125 | Xây dựng các giao diện phần mềm, code các chức năng chính của phần mềm | XXX% |
| Võ Thị Hà Trang | 20522043 | [Võ Hà Trang](https://www.facebook.com/h4ch4n) | 0363466904 | Tạo toàn bộ Database, viết báo cáo hệ quản trị, hỗ trợ code thêm | XXX% |
| Võ Nữ Diễm Trang | 20521013 | [Diễm Trang](https://www.facebook.com/vo.nu.diem.trang.ltd) | 0913941345 | Thiết kế các hoạt động cho ứng dụng, viết báo cáo phân tích thiết kế, hỗ trợ code thêm | XXX% |
| Võ Phạm Thùy Nhung | 20520679 | [Võ Phạm Thùy Nhung](https://www.facebook.com/linh.phong.1829405) | 0783276098 | Tester kiểm tra các test case, lọc bug, viết báo cáo quản lý dự án, hỗ trợ code thêm | XXX% |

## CÀI ĐẶT CHƯƠNG TRÌNH PHẦN MỀM

- Hệ quản trị cơ sở dữ liệu Oracle 19C.
- Thư viện sử dụng:
    * Java Swing (Java SE 12 & JSK 12).
    * Apache NetBeans 13.
    * LGoodDatePicker-11.2.1.jar
    * ojdbc11.jar

## CÁC BƯỚC CHẠY PHẦN MỀM

B1: Clone project về máy.

B2: Cài đặt hệ quản trị cơ sở dữ liệu Oracle 19C

    + https://www.oracle.com/database/technologies/oracle19c-windows-downloads.html
    
B3: Setup database, tạo các table -> chạy trigger, procedure, function -> insert dữ liệu -> commit.
