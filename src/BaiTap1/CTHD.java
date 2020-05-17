/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Admin
 */
public class CTHD 
{
    private String sanPham;
    private int soLuong;
    private double donGia;
    private String chietKhau;
    
    private CTHD(Builder builder)
    {
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() 
    {
        return "Sản phẩm: " + sanPham + "\nSố lượng: " + soLuong + "\nĐơn giá: " 
                + donGia + "\nChiết khấu: " + chietKhau +"\n";
    }
    
    public static class Builder
    {
        private String sanPham;
        private int soLuong;
        private double donGia;
        private String chietKhau; 
    

        public Builder addSanPham(String sanPham)
        {
            this.sanPham = sanPham;
            return this;
        }
        
        public Builder addsoLuong(int soLuong)
        {
            this.soLuong=soLuong;
            return this;
        }
        
        public Builder addDonGia(double donGia)
        {
            this.donGia=donGia;
            return this;
        }
        
        public Builder addchietKhau(String chietKhau)
        {
            this.chietKhau=chietKhau;
            return this;
        }
        
        public CTHD Build()
        {
            return new CTHD(this);
        }
    }
}