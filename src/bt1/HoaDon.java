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
public class HoaDon {
    HoaDonHeader hoadonHeader;
    ArrayList<CTDH> list = new ArrayList<>();

    public HoaDon() {
    }

    public HoaDon(HoaDonHeader hoadonHeader) {
        this.hoadonHeader = hoadonHeader;
    }

    public HoaDonHeader getHoadonHeader() {
        return hoadonHeader;
    }

    public void setHoadonHeader(HoaDonHeader hoadonHeader) {
        this.hoadonHeader = hoadonHeader;
    }
    public void setList(CTDH item)
    {
        list.add(item);
    }
    
    @Override
    public String toString() {
        return "\nHóa Đơn Header: " + hoadonHeader.toString()+
                 "\nCTDH:\n" + list.toString();
    }
   
   
}
