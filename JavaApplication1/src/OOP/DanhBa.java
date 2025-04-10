/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Date;

/**
 *
 * @author Thien_Phuc
 */
public class DanhBa {

    private String ten;
    private String soDienThoai;
    private Date thoiGianTao;

    public DanhBa(String ten, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.thoiGianTao = new Date();
    }
     public String getTen() {
        return ten;
    }
     public String getSoDienThoai() {
        return soDienThoai;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    // 
    public void xuatThongTin() {
        System.out.println("Tên: " + ten + ", Số điện thoại: " + soDienThoai + ", Thời gian tạo: " + thoiGianTao);
    }
}
