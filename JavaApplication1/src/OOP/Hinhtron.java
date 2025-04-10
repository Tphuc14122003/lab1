/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Thien_Phuc
 */
public class Hinhtron {

    private double banKinh;

    // Phương thức nhập giá trị bán kính
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        this.banKinh = scanner.nextDouble();
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
