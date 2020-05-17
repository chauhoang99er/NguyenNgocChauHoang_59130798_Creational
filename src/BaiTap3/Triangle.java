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
public class Triangle extends Shape
{
    public Triangle()
    {
        setBrush("Hình Tam Giác");
        setFrame("3 cạnh lần lượt là 3cm, 4cm và 5cm");
        setPaper("Giấy vở ô ly");
    }

    @Override
    public String draw() 
    {
        return getBrush() + "\n" + getFrame() + "\n" + getPaper();
    }
}
