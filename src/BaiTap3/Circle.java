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
public class Circle extends Shape
{
    public Circle()
    {
        setBrush("Hình Tròn");
        setFrame("Bán kính 5cm");
        setPaper("Giấy vẽ hình tròn");
    }

    @Override
    public String draw() 
    {
        return getBrush() + "\n" + getFrame() + "\n" + getPaper();
    }

}
