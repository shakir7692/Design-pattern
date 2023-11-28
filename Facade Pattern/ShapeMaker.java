/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatterndemo;

/**
 *
 * @author KHAN
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape Triangle;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      Triangle = new Triangle();
   }

   public void drawCircle(){
      circle.draw(2*3.14,2);
   }
   public void drawRectangle(){
      rectangle.draw(2,3);
   }
   public void drawSquare(){
      square.draw(3.3,3.3);
   }
   public void drawTriangle(){
      Triangle.draw(2.3,2.4);
   }
}
