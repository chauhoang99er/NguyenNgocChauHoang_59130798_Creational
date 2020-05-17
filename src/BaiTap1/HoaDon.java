/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon 
{
    private HoaDonHeader hoadonHeader;
    private ArrayList<CTHD> listChiTietHoaDon;
    
    private HoaDon(Builder builder)
    {
        this.hoadonHeader = builder.hoadonHeader;
        this.listChiTietHoaDon = builder.listChiTietHoaDon;
    }

    @Override
    public String toString() {
        return listChiTietHoaDon + "\n" + hoadonHeader;
    }
    
    public static class Builder
    {
        private HoaDonHeader hoadonHeader;
        private ArrayList<CTHD> listChiTietHoaDon;
        
        public Builder()
        {
            listChiTietHoaDon=new ArrayList<>();
        }
        
        public Builder addCTHD(CTHD cthd)
        {
            this.listChiTietHoaDon.add(cthd);
            return this;
        }
        
        public Builder addHD(HoaDonHeader hoadonHeader)
        {
            this.hoadonHeader=hoadonHeader;
            return this;
        }
        
        public HoaDon Build()
        {
            return new HoaDon(this);
        }
    } 
}
