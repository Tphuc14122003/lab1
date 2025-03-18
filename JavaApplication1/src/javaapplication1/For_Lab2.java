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
public class For_Lab2 {

    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int sum =0;
//        int count= 0;
//        int max= Integer.MIN_VALUE;
//        while(true) {
//            System.out.println("Nhập sô nguyên : , khi nhập 0 sẽ in ra kq");
//            int number = sc.nextInt() ;
//            if(number == 0) {
//                break;
//            }
//            sum += number;
//            count++;
//            if(number >max) {
//                max= number;
//            }
//        }
//        if(count >0)  {
//            double average = (double) sum / count;
//            System.out.println("tổng các số dã nhập: " + sum); 
//            System.out.println("Trung bình công: " +average);
//            System.out.println("Giá trị lớn nhất"+ max);
//        } else {
//            System.out.println("Bạn chưa nhập số");
//        }

// Bài 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên: ");
//        int n = sc.nextInt();
//        int count = 0;
//        int temp = 0;
//        while (temp != 0) {
//            temp = temp / 10;
//            count++;
//        }
//        System.out.println("số chữ của số nguyên" + n + "là :" + count);
//        int reversed = 0;
//        while (n != 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//            n = n / 10;
//        }
//        System.out.println("Số đảo ngược của số nguyên là: " + reversed);
//          Bài 3
//    int ba = 35;
//    int con= 4;
//    int year = ba -2 *con;
//        System.out.println(" Sau: " + year + " năm nữa tuổi cha gấp tuổi con");
//      Bài 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số a: ");
//        int a = sc.nextInt();
//
//        System.out.println(" Nhập số b: ");
//        int b = sc.nextInt();
//
//        int ucln = a;
//        int btemp = b;
//
//        while (btemp != 0) {
//            int temp = btemp;
//            btemp = ucln % btemp;
//            ucln = temp;
//        }
//        int bcnn = (a * b) / ucln;
//        System.out.println("ước số chung lớn nhất của " + a + "và" + b + "là:" + ucln);
//        System.out.println("Bội  số chung nhỏ  nhất của " + a + "và" + b + "là:" + bcnn);
//      Bài 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số tự nhiên: ");
//        int n = sc.nextInt();
//        System.out.println(" CHọn các phép tính bên dưới");
//        System.out.println("1. Tìm ước lẻ lớn nhất của n. ");
//        System.out.println("2. Kiểm tra xem số đó có là số nguyên tố không. ");
//        System.out.println("3. Phân tích số n ra các thừa số nguyên tố.");
//        System.out.println("4. Tìm và in ra tất cả các số nguyên tố nhỏ hơn n. ");
//
//        System.out.println(" Nhập lựa chọn của bạn (1-4");
//        int choice = sc.nextInt();
//
//        switch (choice) {
//            case 1:
//                int largest = -1;
//                for (int i = n; i >= 1; i--) {
//                    if (n % i == 0 && i % 2 != 0) {
//                        largest = i;
//                        break;
//                    }
//                }
//                System.out.println("Ước lẻ lớn nhất của " + n + " là: " + largest);
//                break;
//
//            case 2:
//                int largestForCheck = -1;
//                for (int i = n; i >= 1; i--) {
//                    if (n % i == 0 && i % 2 != 0) {
//                        largestForCheck = i;
//                        break;
//                    }
//                }
//                boolean isPrime = true;
//                if (largestForCheck <= 1) {
//                    isPrime = false;
//                } else {
//                    for (int i = 2; i <= Math.sqrt(largestForCheck); i++) {
//                        if (largestForCheck % i == 0) {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                }
//
//                if (isPrime) {
//                    System.out.println("Ước lẻ lớn nhất " + largestForCheck + " là số nguyên tố.");
//                } else {
//                    System.out.println("Ước lẻ lớn nhất " + largestForCheck + " không phải là số nguyên tố.");
//                }
//                break;
//            case 3:
//                System.out.println(" Thừa số nguyên tố của" + n + "là");
//                for (int i = 2; i < n; i++) {
//                    while (n % i == 0) {
//                        System.out.print(i + " ");
//                        n = n / i;
//                    }
//                }
//                System.out.println("");
//                break;
//            case 4:
//                System.out.println(" Các số nguyên nhỏ hơn " + n + "là:");
//                for (int i = 2; i < n; i++) {
//                    boolean prime = true;
//                    for (int j = 2; j <= Math.sqrt(i); j++) {
//                        if (i % j == 0) {
//                            prime = false;
//                            break;
//                        }
//                    }
//                    if (prime) {
//                        System.out.println(i + "");
//                    }
//
//                }
//                System.out.println("");
//                break;
//            default:
//                System.out.println("Vui lòng chỉ chọn 1 đến 4");
//                break;
//        }
//          Bài 6
//       Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Nhập các góc cách nhau bởi dấu phẩy (ví dụ: 0, 50°, 10°, ... 90°): ");
//        String input = sc.nextLine();
//        
//        String[] angles = input.split(",");
//        
//        for (String angleStr : angles) {
//            int degree = Integer.parseInt(angleStr.trim());
//
//            if (degree < 0 || degree > 90) {
//                System.out.println("Góc " + degree + "° Ko hợp lệ , Vui lòng nhập góc từ 0 đến 90° .");
//                continue;
//            }
//
//            double radian = Math.toRadians(degree);
//            
//            System.out.printf("Góc: %d°\n", degree);
//            System.out.printf("Sin: %.4f\n", Math.sin(radian));
//            System.out.printf("Cos: %.4f\n", Math.cos(radian));
//            
//            if (Math.cos(radian) != 0) {
//                System.out.printf("Tan: %.4f\n", Math.tan(radian));
//                System.out.printf("Cotan: %.4f\n", 1 / Math.tan(radian));
//            } else {
//                System.out.println("Tan và Cotan ko xác định tại góc 90°");
//            }
//            System.out.println();
//        }
//      Bài 7
// System.out.println(" Bảng cửu chương");
//        for(int i=2 ; i <=9; i++) {
//            for (int j=1 ; j <= 9; j++) {
//                System.out.println(i +"x" + j +"=" + (i*j) );
//            }
//            System.out.println("");
//       }
        // bài 8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số n :");
//        int n = sc.nextInt();
//        System.out.println("Chọn kết quả ");
//        System.out.println("Tính tổng S = 1 + 2 + ... + n. ");
//        System.out.println("Tính giai thừa n! = 1 x 2 x ... x n.");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                int sum = 0;
//                for (int i = 1; i <= n; i++) {
//                    sum += i;
//                }
//                System.out.println("1. Tổng S = " + sum);
//                break;
//            case 2:
//                long factorial = 1;
//                for (int i = 1; i <= n; i++) {
//                    factorial *= i;
//                }
//                System.out.println("2. Giai thừa n! = " + factorial);
//                break;
//            default:
//                System.out.println("lựa chọn không hợp lệ");
//                break;
//        }
// Bài 9  
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double P = sc.nextDouble();

        System.out.println("Nhập lãi suất hàng tháng: ");
        double r = sc.nextDouble();

        System.out.println("Nhập số tháng gửi : ");
        int n = sc.nextInt();
        double F = P * Math.pow(1 + r, n);
        System.out.printf("Số tiền sẽ rút ra sau %d tháng là: %.2f VND\n", n, F);

    }
}
