/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private static Circle instanceCircle;
    protected Circle() {
    }
    public static Circle createInstanceCircle()
    {
        if(instanceCircle==null)
            instanceCircle = new  Circle();
        return instanceCircle;
    }

    @Override
    public String Draw() {
           return "Vẽ hình tròn";
    }
    
}
