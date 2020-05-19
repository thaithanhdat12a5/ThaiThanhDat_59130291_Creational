/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class bt1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoadon = new HoaDon();
        hoadon.setHoadonHeader(new HoaDonHeader.Builder()
        .addMaHoaDon("A213")
        .addNgayBan("26/01/2015")
        .addTenKhachHang("Thái Thành Đạt")
        .build());
        hoadon.setList(new CTDH.Builder()
        .addTenSanPham("Cam sành")
        .addSoLuong(24)
        .addDonGia(250000)
        .addChietKhau("5%")
        .build());
         hoadon.setList(new CTDH.Builder()
        .addTenSanPham("Lựu Đạn")
        .addSoLuong(4)
        .addDonGia(1000000)
        .addChietKhau("2%")
        .build());
        System.out.println(hoadon.toString());
    }
    
}
