/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape
{
    public Rectangle()
    {
        setBrush("Hình Chữ Nhật");
        setFrame("Chiều dài 4cm, chiều rộng 3cm");
        setPaper("Giấy A4");
    }

    @Override
    public String draw() 
    {
        return getBrush() + "\n" + getFrame() + "\n" + getPaper();
    } 
}
