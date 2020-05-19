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
public class bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory = new ShapeFactory();
        Shape product = factory.createShape(ShapeType.Circle);
        product.setBrush("Cọ");
        product.setPaper("Giấy A4");
        product.setFrame("khung gỗ");
        System.out.println(product.toString());
    }
    
}
