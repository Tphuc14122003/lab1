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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bài 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input one integer and one floating-point number");
//        int x;
//        int y;
//        
//        System.out.println("Nhập x");
//        x = sc.nextInt();
//        
//        System.out.println("Nhập y");
//        y = sc.nextInt();
//        
//        System.out.println("Input values are" + x + "and " + y + "their product is " + x*y);

        // Bài 2
//        Scanner sc = new Scanner(System.in);
//        int x ;
//        int y;
//        System.out.println("Nhập x");
//          x = sc.nextInt();
//          y = 4*(x-3) + 20;
//          
//         System.out.println("KQ của y là:" + y);
        // Bài 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập m");
//        double miles = sc.nextDouble();
//
//        double km = miles * 1.609;
//        System.out.println("Số km " + km + "km");
//        Bài 4
//        Scanner sc = new Scanner(System.in);
//        int x;
//        double y;
//        double z;
//        
//        System.out.println("Nhập bán kính");
//        x = sc.nextInt();
//        
//        y = 2 * x * 3.14;
//        
//        z = x*x *3.14;
//
//        System.out.println("Kết quả chu vi là:" + y);
//        System.out.println("Kết quả diện tích là:" + z);
// Bài 5
        Scanner sc = new Scanner(System.in);
        int totalSeconds;
        int hours, minutes, seconds;
        System.out.println("Nhập thời gian");
        totalSeconds = sc.nextInt();

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;
        System.out.println("Thời gian là " + hours + ":" + minutes + ":" + seconds);
    }
}
