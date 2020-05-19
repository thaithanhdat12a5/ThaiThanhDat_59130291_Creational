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
public class Rectangle extends Shape{

    private static Rectangle instanceRectangle;
    protected Rectangle() {
    }
    public static Rectangle createInstanceRectangle()
    {
        if(instanceRectangle==null)
            instanceRectangle = new  Rectangle();
        return instanceRectangle;
    }

    @Override
    public String Draw() {
           return "Vẽ hình chữ nhật";
    }
    
}
