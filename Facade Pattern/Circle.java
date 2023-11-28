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
public class Circle implements Shape{
    @Override
   public void draw(double radius,double l) { 
       System.out.printf("Circlehas radius of: %f", radius);
       System.out.println("Square::draw()");
   }
}
