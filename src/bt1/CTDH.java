/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Admin
 */
public class CTDH {
    //sản phẩm, số lượng, đơn giá, chiết khấu
    String tenSanPham,chietKhau;
    int soLuong,donGia;

    public CTDH(Builder builder) {
        this.tenSanPham = builder.tenSanPham;
        this.chietKhau = builder.chietKhau;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
    }

    @Override
    public String toString() {
        return "\nTên Sản Phẩm: " + tenSanPham+
                 "\nSố Lượng: " + soLuong+
                 "\nĐơn Giá: " + donGia+
                 "\nChiết khấu: " + chietKhau+
                 "\n-------------------\n";
    }

    
    
   
    
    public static class Builder
    {
       String tenSanPham,chietKhau;
       int soLuong,donGia;
       public Builder addTenSanPham(String tenSanPham)
       {
           this.tenSanPham = tenSanPham;
           return this;
       }
       public Builder addSoLuong(int soLuong)
       {
           this.soLuong = soLuong;
           return this;
       }
       public Builder addDonGia(int donGia)
       {
           this.donGia = donGia;
           return this;
       }
        public Builder addChietKhau(String chietKhau)
       {
           this.chietKhau = chietKhau;
           return this;
       }
        public CTDH build()
        {
           return new CTDH(this);
        }
    }
}
