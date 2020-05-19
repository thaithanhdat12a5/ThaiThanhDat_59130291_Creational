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
public class Triangle extends Shape{

    private static Triangle instanceTriangle;
    protected Triangle() {
    }
    public static Triangle createInstanceTriangle()
    {
        if(instanceTriangle==null)
            instanceTriangle = new  Triangle();
        return instanceTriangle;
    }

    @Override
    public String Draw() {
           return "Vẽ hình tam giác";
    }
    
}
