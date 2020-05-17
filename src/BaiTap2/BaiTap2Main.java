/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MyStringBuilder my = new MyStringBuilder.Builder()
                .addString("Chuỗi Builder")
                .addFloat(3.5f)
                .addBool(true)
                .build();
        
        System.out.println(my.toString());
    }
    
}
