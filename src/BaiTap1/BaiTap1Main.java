/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        CTHD cthd1 = new CTHD.Builder()
                .addSanPham("Điện thoại Iphone Xs")
                .addsoLuong(1)
                .addDonGia(19990000)
                .addchietKhau("15%")
                .Build();
        
        CTHD cthd2 = new CTHD.Builder()
                .addSanPham("Điện thoại Iphone Xs Max")
                .addsoLuong(1)
                .addDonGia(23990000)
                .addchietKhau("17%")
                .Build();
        
        HoaDonHeader hoadonHeader = new HoaDonHeader.Builder()
                .addMaHD("SP001")
                .addNgayBan("15/5/2020")
                .addTenKH("Nguyễn Ngọc Châu Hoàng")
                .Build();
        
        HoaDon hd = new HoaDon.Builder()
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .addHD(hoadonHeader)
                .Build();
        
        System.out.println(hd.toString());
    }
    
}
