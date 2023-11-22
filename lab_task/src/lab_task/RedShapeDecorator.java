/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_task;

/**
 *
 * @author ZAKIR FAYYAZ
 */
public class RedShapeDecorator extends ShapeDecorator {
     public RedShapeDecorator(shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}
