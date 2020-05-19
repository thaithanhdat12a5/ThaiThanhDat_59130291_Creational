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
public class ShapeFactory {

   private static ShapeFactory instanceFactory;
   protected ShapeFactory()
   {
       
   }
   public static ShapeFactory createInstanceFactory()
   {
       if(instanceFactory == null) 
           instanceFactory = new ShapeFactory();
       return instanceFactory;
   }
   
    protected Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case Circle: return Circle.createInstanceCircle();
            case Rectangle: return Rectangle.createInstanceRectangle();
            case Triangle: return Triangle.createInstanceTriangle();
        } 
        Shape shape = createShape(type);
        shape.Draw();
        return shape;
    }
   
  
}
