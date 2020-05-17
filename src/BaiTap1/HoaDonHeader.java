/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class HoaDonHeader 
{
    private String maHD;
    private String ngayBan;
    private String tenKH;
    
    private HoaDonHeader(Builder builder)
    {
        this.maHD = builder.maHD;
        this.ngayBan = builder.ngayBan;
        this.tenKH = builder.tenKH;
    }
    
    @Override
    public String toString() 
    {
        return "Mã hóa đơn: " + maHD + "\nNgày bán: " + ngayBan + "\nTên khách hàng: " + tenKH;
    }
    
    public static class Builder
    {
        private String maHD;
        private String ngayBan;
        private String tenKH;
        
        public Builder addMaHD(String maHD)
        {
            this.maHD=maHD;
            return this;
        }
        
        public Builder addNgayBan(String ngayBan)
        {
            this.ngayBan=ngayBan;
            return this;
        }
        
        public Builder addTenKH(String tenKH)
        {
            this.tenKH = tenKH;
            return this;
        }
        
        public HoaDonHeader Build()
        {
            return new HoaDonHeader(this);
        }
    }
}
