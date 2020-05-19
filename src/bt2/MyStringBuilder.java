/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Admin
 */
public class MyStringBuilder {
    String str;
          public MyStringBuilder(Builder builder)
        {
            this.str = builder.s +" " + builder.f+ " "+ builder.b;
        }

    @Override
    public String toString() {
        return "str = " + str ;
    }

  
    public static class Builder
    {
        String s;
        float f;
        boolean b;
        public Builder addString(String s)
        {
            this.s=s;
            return this;
        }
         public Builder addFloat(float f)
        {
            this.f=f;
            return this;
        }
         public Builder addBoolean(boolean b)
        {
            this.b=b;
            return this;
        }
         public MyStringBuilder builder()
         {
             return new MyStringBuilder(this);
         }
        
    }
}
