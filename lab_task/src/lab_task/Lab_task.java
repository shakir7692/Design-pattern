
package lab_task;


public class Lab_task {

   
    public static void main(String[] args) {
        shape circle = new Circle();

      shape redCircle = new RedShapeDecorator(new Circle());

      shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
    }
    

