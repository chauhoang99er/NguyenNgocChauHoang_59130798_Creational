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
public class MyStringBuilder 
{
    private String str;
    
    private MyStringBuilder(Builder builder)
    {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "Chuỗi str: " + str;
    }
    
    public static class Builder
    {
        private String str;
        
        public Builder addString(String str)
        {
            this.str = str;
            return this;
        }
        
        public Builder addFloat(float f)
        {
            this.str += f;
            return this;
        }
        
        public Builder addBool(boolean b)
        {
            this.str += b;
            return this;
        }
        
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
    }
}
