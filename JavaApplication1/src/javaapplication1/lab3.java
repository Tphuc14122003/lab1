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
public class lab3 {

    // bài 1
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chiều dài");
//        double a = sc.nextDouble();
//        System.out.println("Nhập chiều rộng");
//        double b = sc.nextDouble();
//
//        double chu_vi = 2 * (a + b);
//        double dien_tich = a * b;
//
//        System.out.println("chu vi là " + chu_vi);
//        System.out.println("diện tích là " + dien_tich);
        // bài 2
//        Scanner sc = new Scanner(System.in);
//          System.out.println("Nhập bán kính");
//        double a = sc.nextDouble();
//        
//        double pi = 3.14159;
//        double chu_vi = 2 *pi*a;
//        double diện_tích = pi*a*a;
//        
//        System.out.println("chu vi là " + chu_vi);
////        System.out.println("diện tích là " + diện_tích);

// bài 3 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tiền điện");
//        double a = sc.nextDouble();
//
//        double giá_điện = 3.14159;
//        double tiền_điện = a * giá_điện;
//        System.out.println("Tiền điện là " + tiền_điện);
// Bài 4
//   Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập cân nặng");
//        double a = sc.nextDouble();
//        
//        System.out.println("Nhập chiều cao");
//        double b = sc.nextDouble();
//
//        double  bmi = a /(b*b);
//        System.out.println("bmi là:  " + bmi);
        // bài 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập đấy 1 hình thang");
//        double a = sc.nextDouble();
//        
//        System.out.println("Nhập đấy 2 hình thang");
//        double b = sc.nextDouble();
//
//        System.out.println("Nhập chiều cao hình thang");
//        double c = sc.nextDouble();
//        
//        double  diện_tích =  (a+b)*c/2;
//        System.out.println("bmi là:  " + diện_tích);
        //bài 6
//          Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 số ");
//        int a = sc.nextInt();
//        if(a %2 ==0) {
//            System.out.println(a+ "là số chẵn");
//        } else {
//            System.out.println(a+ "là số lẻ");
//        }
        // bài 7 
//          Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số thứ 1 ");
//        int a = sc.nextInt();
//         System.out.println("Nhập số thứ 2 ");
//        int b = sc.nextInt();
//         System.out.println("Nhập số thứ 3 ");
//        int c = sc.nextInt();
//        
//        int số_lớn_nhất = a;
//        if (b >a) {
//            số_lớn_nhất =b;
//        }
//        if( c >a) {
//            số_lớn_nhất= c;
//        }
//        System.out.println("Số lớn nhất là "+ số_lớn_nhất);
        // Bài 8
        // Bài 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Nhập số nguyên dương");
           
        }
        long giaithua = 1;
        for (int i = 1; i <= a; i++) {
            giaithua *= i;
        }
                System.out.println("giai thừa của" +a+ "là" + giaithua);

        // Bài 10
    }
}
