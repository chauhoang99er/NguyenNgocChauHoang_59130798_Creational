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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ShapeFactory sf = ShapeFactory.createInstance();
        
        Shape Rectangle = sf.createShape(ShapeType.Rectangle);
        Shape Circle = sf.createShape(ShapeType.Circle);
        Shape Triangle = sf.createShape(ShapeType.Triangle);
        
        System.out.println(Rectangle.draw());
        System.out.println(Circle.draw());
        System.out.println(Triangle.draw());
    }
    
}
