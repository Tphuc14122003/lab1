/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class lab2 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float a;
//        float b;
//
//        System.out.println("Nhập a");
//        a = sc.nextFloat();
//        System.out.println("Nhập b");
//        b = sc.nextFloat();
//
//        float max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println("max" + max);

// bài 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập năm");
//        int year = sc.nextInt();
//
//        if (year % 4 == 0) {
//            System.out.println(year + "Năm nhuận");
//        } else {
//            System.out.println(year + "Năm không nhuận");
//        }
//
//        System.out.println("Nhập tháng");
//        int month = sc.nextInt();
//
//        int IndayOfMonth = 0;
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            IndayOfMonth = 31;
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            IndayOfMonth = 30;
//        } else if (month == 2) {
//            if (year % 4 == 0) {
//                if (year % 100 != 0 || year % 400 == 0) {
//                    IndayOfMonth = 31;
//                } else {
//                    IndayOfMonth = 30;
//                }
//            } else {
//                IndayOfMonth = 28;
//            }
//        } else {
//            System.out.println("Tháng không hợp lệ ");
//            return;
//        }
//        System.out.println("số ngày trong tháng" + month + "năm" + year + "là" + IndayOfMonth);
// bài 3
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập a");
//        double a = sc.nextDouble();
//        System.out.println("Nhập b");
//        double b = sc.nextDouble();
//        if (a != 0) {
//            double x = -b / a;
//            System.out.println(" Nghiệm phương trình : " + x);
//        } else {
//            if (b == 0) {
//                System.out.println("Phương trình có vô số nghiệm");
//            } else {
//                System.out.println("Phương trình vô nghiệm");
//            }
//        }
//      bài 4
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập a");
//        double a = sc.nextDouble();
//        System.out.println("Nhập b");
//        double b = sc.nextDouble();
//        System.out.println("Nhập c");
//        double c = sc.nextDouble();
//
//        double penta = b * b - 4 * a * c;
//        if (a == 0) {
//            System.out.println(" Phương trình không phải bật hai");
//        } else if (penta > 0) {
//            double x1 = (-b + Math.sqrt(penta)) / (2 * a);
//            double x2 = (-b - Math.sqrt(penta)) / (2 * a);
//            System.out.println("Phương trình có 2 nghiện");
//            System.out.println("Nghiệm 1:" + x1);
//            System.out.println("Nghiệm 2" + x2);
//        } else if (penta == 0) {
//            double x = -b / (2 * a);
//            System.out.println("Phương trình có nghiệm kẹp" + x);
//        } else {
//            System.out.println("Phương trình vô nghiệm");
//        }
//          bài 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập a1");
//        int a1 = sc.nextInt();
//        System.out.println("Nhập b1");
//        int b1 = sc.nextInt();
//        System.out.println("Nhập a2");
//        int a2 = sc.nextInt();
//        System.out.println("Nhập b2");
//        int b2 = sc.nextInt();
//
//        int startUnion = Math.min(a1, a2);
//        int endUnion = Math.max(b1, b2);
//
//        int startIntersection = Math.max(a1, a2);
//        int endIntersection = Math.min(b1, b2);
//
//        if (startIntersection <= endIntersection) {
//            System.out.println(" Phần giao 2 đoạn là " + startIntersection + "đến" + endIntersection);
//        } else {
//            System.out.println("Không có phần giao");
//        }
//        System.out.println("Phần hợp của 2 đoạn từ" + startUnion + " đến " + endUnion);
        // Bài 6
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập cạnh a");
//        double a = sc.nextDouble();
//        System.out.println("Nhập cạnh b");
//        double b = sc.nextDouble();
//        System.out.println("nhập cạnh c");
//        double c = sc.nextDouble();
//
//        if (a + b > c && a + c > b && b + c > a) {
//            System.out.println("Đây là tam giác ");
//            double chuvi = a + b + c;
//            System.out.println("chu vi tam giác :" + chuvi);
//
//            double p = chuvi / 2;
//            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//            System.out.println("Diện tích tam giác là: " + area);
//
//            double cosA = (b * b + c * c - a * a) / (2 * b * c);
//            System.out.println("cos A = " + cosA);
//
//            double angleA = Math.toDegrees(Math.acos(cosA));
//            System.out.println("Góc A là: " + angleA + " độ");
//        } else {
//            System.out.println(" Đây không phải là tam giác ");
//        }
        // bài 7
//       Scanner sc = new Scanner(System.in);
//        System.out.println("nhập cạnh a");
//        Double a = sc.nextDouble();
//        System.out.println(" nhập cạnh b");
//        Double b = sc.nextDouble();
//        System.out.println("nhập cạnh c");
//        double c = sc.nextDouble();
//
//        if (tamgiac(a, b, c)) {
//            if (a == b & b == c) {
//                System.out.println("Tam giác đều");
//            } else if (a == b || b == c || a == c) {
//                System.out.println("tam giác cân");
//            } else if (tamgiacvuong(a, b, c)) {
//                if (a == b || b == c || a == c) {
//                    System.out.println("Tam giác vuông cân");
//                } else {
//                    System.out.println("Tam giác vuông");
//                }
//            } else {
//                System.out.println("Tam giác thường");
//            }
//        } else {
//            System.out.println(" không phải 3 canhj của tam giac");
//        }
//    }
//
//    public static boolean tamgiac(double a, double b, double c) {
//        return (a + b > c) && (a + c > b) && (b + c > a);
//    }
//
//    public static boolean tamgiacvuong(double a, double b, double c) {
//        double[] sides = {a, b, c};
//        java.util.Arrays.sort(sides);  
//        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
// bài 8
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("nhập năm ");
//        int year = sc.nextInt();
//        String lunaryear = "";
//        if (year % 12 == 0) {
//            lunaryear = "Mậu Dần";
//        } else if (year % 12 == 1) {
//            lunaryear = "Kỷ Mão";
//        } else if (year % 12 == 2) {
//            lunaryear = "Tân Thìn";
//        } else if (year % 12 == 3) {
//            lunaryear = "Nhâm Tý";
//        } else if (year % 12 == 4) {
//            lunaryear = "Quý Sửu";
//        } else if (year % 12 == 5) {
//            lunaryear = "Giáp Dần";
//        } else if (year % 12 == 6) {
//            lunaryear = "Ất Mão";
//        } else if (year % 12 == 7) {
//            lunaryear = "Bính Thìn";
//        } else if (year % 12 == 8) {
//            lunaryear = "Đinh Tỵ";
//        } else if (year % 12 == 9) {
//            lunaryear = "Mậu Ngọ";
//        } else if (year % 12 == 10) {
//            lunaryear = "Kỷ Mùi";
//        } else {
//            lunaryear = "Tân Dậu";
//        }
//        System.out.println("Năm âm lịch tương ứng với năm dương lịch " + year + " là: " + lunaryear);
//          bài 9
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số <1000");
//        int n = sc.nextInt();
//        if (n < 0 || n >= 1000) {
//            System.out.println(" số phải nằm từ 0-1000");
//        } else {
//            String result = numberToWords(n);
//            System.out.println("Cách đọc:" + n + "là" + result);
//        }
//    }
//
//    public static String numberToWords(int n) {
//        if (n == 0) {
//            return "Không";
//        }
//
//        String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
//        String[] tens = {"", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};
//        String[] hundreds = {"", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm", "Chín trăm"};
//
//        StringBuilder result = new StringBuilder();
//
//        int hundred = n / 100;
//        n %= 100;
//
//        if (hundred > 0) {
//            result.append(hundreds[hundred]);
//            if (n > 0) {
//                result.append(" ");
//            }
//        }
//
//        int ten = n / 10;
//        n %= 10;
//
//        if (ten > 0) {
//            if (ten == 1 && n > 0) {
//                result.append("Mười");
//            } else {
//                result.append(tens[ten]);
//            }
//            if (n > 0) {
//                result.append(" ");
//            }
//        } else if (ten == 0 && n > 0 && hundred > 0) {
//            result.append("Lẻ ");
//        }
//
//        int one = n;
//        if (one > 0) {
//            result.append(ones[one]);
//        }
//
//        return result.toString();
//      bài 10
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập ngày ");
        int d = sc.nextInt();
        System.out.println("nhập tháng ");
        int m = sc.nextInt();
        System.out.println("nhập năm ");
        int y = sc.nextInt();

        boolean isValid = false;
        int daysInMonth = 0;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            daysInMonth = 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            daysInMonth = 30;
        } else if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        }
        if (d >= 1 && d <= daysInMonth) {
            isValid = true;
            System.out.println("Ngày hợp lệ");

            if (d < daysInMonth) {
                System.out.println("Ngày hợp lệ là : " + (d + 1) + "/" + m + "/" + y);
            } else if (m == 12) {
                System.out.println("Ngày hôm sau là : 1/1/" + (y + 1));
            } else {
                System.out.println(" Ngày hôm sau là 1/" + (m + 1) + "/" + y);
            }
        } else {
            System.out.println("Ngày không hợp lệ");
        }
    }
}
