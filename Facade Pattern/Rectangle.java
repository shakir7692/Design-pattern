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
public class Rectangle implements Shape {
    @Override
   public void draw(double length,double width) {
      System.out.printf("Rectangle has length of: %f, and also have width of:%f", length, width);
      System.out.println("Square::draw()");
   }
}
