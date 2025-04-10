/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Thien_Phuc
 */
public class Main {

    public static void main(String[] args) {
        //Bài 1:Viết chương trình hướng đối tượng giải quyết bài toán chu vi, diện tích hình tròn theo yêu cầu sau:
//Khởi tạo class HinhTron với thuộc tính là bán kính.
//Khai báo và định nghĩa các phương thức: 
//- nhap()
//- tinhChuVi()
//- tinhDienTich()
//Ở hàm main khởi tạo 1 đối tượng hình tròn, nhập giá trị cho bán kính và in ra màn hình chu vi và diện tính của hình tròn qua 2 phương thức ở trên.

//        Hinhtron hinhtron = new Hinhtron();
//        hinhtron.nhap();
//        double chuvi = hinhtron.tinhChuVi();
//        System.out.println("chu vi hình tron : " + chuvi);
//        double dientich = hinhtron.tinhDienTich();
//        System.out.println("Diện Tích hình tròn: " + dientich);
//     Bài 2: Cài đặt chương trình hướng đối tượng thực hiện các yêu cầu sau:
//Thiết kế, cài đặt lớp CanBo bao gồm các thuộc tính: Mã cán bộ, họ tên, ngày sinh, số ngày làm việc trong tháng và các phương thức:
//Phương thức Nhap() để nhập thông tin của cán bộ.
//Phương thức TinhLuong(): trả về lương của cán bộ theo công thức Lương = Số ngày làm trong tháng * 250000.
//Phương thức Xuat(): hiển thị thông tin của cán bộ ra màn hình.
//Xây dựng chương trình chính nhập thông tin cho 1 cán bộ. Xuất thông tin của cán bộ đó ra cùng với phương thức Xuat() ở trên.
//        CanBo  canBo = new CanBo();
//         canBo.nhap();
//          canBo.xuat();
        // Bài bonus : Nhập vào 1 số nguyên, đếm các số lẻ trong số nguyên đó
//Ví dụ:  1234 => kq: 2
//876543=> kq: 3 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số nguyên");
//        int number = sc.nextInt();
//        int count = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            if (digit % 2 != 0) {
//                count++;
//            }
//            number /= 10;
//        }
//        System.out.println("số lẻ trong dãy" + count);
// Bài 4 Bài toán quản lý danh bạ:
//Danh bạ sẽ lưu các liên hệ, mỗi một liên hệ cần lưu các thông tin: tên, số điện thoại, thời gian tạo (lấy thời gian tự động).
//
//Hãy khai báo 1 mảng có 1000 phần tử để lưu các liên hệ. Khi chương trình chạy, sử  dụng switch case để cho người dùng chọn các chức năng sau:
//
//1. Thêm liên hệ mới
//2. Hiển thị danh sách liên hệ
//3. Tìm và hiển thị thông tin liên hệ dựa theo tên hoặc số điện thoại
//4. Hiển thị danh sách liên hệ sắp xếp theo tên
//5. Hiển thị danh sách liên hệ sắp xếp theo thời gian tạo
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Chọn câu trả lời :");
            System.out.println("1. Thêm liên hệ mới");
            System.out.println("2. Hiển thị danh sách liên hệ");
            System.out.println("3. Tìm và hiển thị thông tin liên hệ dựa theo tên hoặc số điện thoại");
            System.out.println("4. Hiển thị danh sách liên hệ sắp xếp theo tên");
            System.out.println(" 5. Hiển thị danh sách liên hệ sắp xếp theo thời gian tạo");
            System.out.print("Lựa chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    if (soLuongLienHe < 1000) {
                        System.out.print("Nhập tên liên hệ: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhập số điện thoại: ");
                        String soDienThoai = sc.nextLine();

                        danhBa[soLuongLienHe] = new DanhBa(ten, soDienThoai);
                        soLuongLienHe++;
                        System.out.println("Thêm liên hệ thành công!");
                    } else {
                        System.out.println(" Không thể thêm liên hệ mới.");
                    }
                    break;
                case 2:
                    if (soLuongLienHe == 0) {
                        System.out.println("Danh bạ hiện tại không có liên hệ.");
                    } else {
                        System.out.println("Danh sách liên hệ:");
                        for (int i = 0; i < soLuongLienHe; i++) {
                            danhBa[i].xuatThongTin();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên hoặc số điện thoại để tìm: ");
                    String timKiem = sc.nextLine();

                    boolean timThay = false;
                    for (int i = 0; i < soLuongLienHe; i++) {
                        if (danhBa[i].getTen().equalsIgnoreCase(timKiem) || danhBa[i].getSoDienThoai().equals(timKiem)) {
                            danhBa[i].xuatThongTin();
                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Không tìm thấy liên hệ.");
                    }
                    break;
                case 4:
                    Arrays.sort(danhBa, 0, soLuongLienHe, Comparator.comparing(DanhBa::getTen));
                    System.out.println("Danh sách đã được sắp xếp theo tên.");
                    if (soLuongLienHe == 0) {
                        System.out.println("Danh bạ hiện tại không có liên hệ.");
                    } else {
                        for (int i = 0; i < soLuongLienHe; i++) {
                            danhBa[i].xuatThongTin();
                        }
                    }
                    break;
                case 5:
                    Arrays.sort(danhBa, 0, soLuongLienHe, Comparator.comparing(DanhBa::getThoiGianTao));
                    System.out.println("Danh sách sắp xếp theo thời gian tạo.");
                    if (soLuongLienHe == 0) {
                        System.out.println("Danh bạ hiện tại không có liên hệ.");
                    } else {
                        for (int i = 0; i < soLuongLienHe; i++) {
                            danhBa[i].xuatThongTin();
                        }
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (chon != 0);

    }
    private static DanhBa[] danhBa = new DanhBa[1000];
    private static int soLuongLienHe = 0;

}
