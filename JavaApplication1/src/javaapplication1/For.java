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
public class For {

    public static void main(String[] args) {
//        int rong = 7;
//        int dai = 20;
//        for (int i = 0; i < rong; i++) {
//            for (int j = 0; j < dai; j++) {
//                if (i == 0 || i == rong - 1 || j == 0 || j == dai - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }

// Bài 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số dòng ");
//        int dong = sc.nextInt();
//        
//        for( int i =1; i <=dong; i++) {
//            for(int j =1; j <= i; j++) {
//                   System.out.print("*");
//            }
//            System.out.println("");
//        }
//          Bài 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập chiều cao");
//        int h = sc.nextInt();
//
//        for (int i = 1; i <= h; i++) {
//            for (int j = h - 1; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      Bài4 
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên dương ");
//        int n = sc.nextInt();
//        if (n <= 1) {
//            System.out.println("Không phải số nguyên tố");
//        }
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(n + "là số nguyên tố");
//        } else {
//            System.out.println(n + "Không là số nguyên tố");
//        }
//          bài 5 
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên      ");
//        int n = sc.nextInt();
//
//        System.out.println(" Các số nguyên từ 1 đến " + n + "là:");
//        for (int i = 2; i <= n; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(i + " ");
//            }
//        }
//      Bài 6 
//        System.out.println(" Bảng cửu chương");
//        for(int i=1 ; i <=9; i++) {
//            for (int j=1 ; j <= 9; j++) {
//                System.out.println(i +"x" + j +"=" + (i*j) );
//            }
//            System.out.println("");
//        }
//      Bài 7
Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số nguyên");
        int n = sc.nextInt();
        
        int dao =0;
        while (n != 0) {
            int digit = n%10;
            dao = dao  *10 + digit;
            n = n/10;
        }
        System.out.println("số đảo ngược : " + dao);
//bai 8
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên");
//        int n = sc.nextInt();
//        
//        if (n <= 0) {
//            System.out.println("Nhập số nguyên dương");
//        }
//        long a = 0,
//        b = 1;
//                for (int i =1; i <n; i++) {
//                    long next = a +b;
//                    a =b;
//                    b = next;
//            }
//                System.out.println("Dẫy số tiếp theo Fibonacci của" +n + "là:");
//                for (int i =0; i <6;i ++) {
//                    long next = a+b;
//                    System.out.println(next);
//                    a=b;
//                    b=next;
//                }
// Bài 9
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên");
//        int n = sc.nextInt();
//        if (n < 0) {
//            System.out.println("Nhập số nguyên dương");
//        }
//        long giaithua = 1;
//        for (int i = 1; i <= n; i++) {
//            giaithua *= i;
//        }
//        System.out.println("giai thừa của" + n + "là" + giaithua);

// Bài 10
// Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên");
//        int n = sc.nextInt();
//         if (n < 0) {
//            System.out.println("Nhập số nguyên dương");
//        }
//         int sum = 0;
//         for (int i =1; i <=n/2; i++) {
//             if(n %i == 0) {
//                 sum += i;
//             }
//         }
//         if (sum ==n ) {
//             System.out.println(n + "là số hoàn hảo");
//         }else {
//             System.out.println(n + "không phải là số hoàn hảo");
//         }
// bài 11
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Nhập số nguyên");
//        int n = sc.nextInt();
//        float tong = 0;
//        for (int i = 1; i <= n; i++) {  
//            tong += 1 / Math.pow(i, 3);
//        }
//        System.out.printf("Kết quả của biểu thức S = %.5f\n", tong);
    }
}
