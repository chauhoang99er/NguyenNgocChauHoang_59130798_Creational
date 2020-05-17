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
public class ShapeFactory
{
    //Theo đề bài để đảm bảo việc việc tạo đối tượng do chính lớp đảm nhận
    private static ShapeFactory instance;

    protected ShapeFactory() {
    }
    
    public static ShapeFactory createInstance()
// cho phép phương thức này truy cập thông qua tên class
    {
        if(instance == null)
        {
            instance = new ShapeFactory();
        }
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType)
    {
        switch(shapeType)
        {
            case Rectangle: return new Rectangle();
            case Circle: return new Circle();
            case Triangle: return new Triangle();
            default: return null;
        }
    }
}
