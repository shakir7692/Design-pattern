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
public abstract class ShapeDecorator implements shape {
    protected shape decoratedShape;

   public ShapeDecorator(shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}
