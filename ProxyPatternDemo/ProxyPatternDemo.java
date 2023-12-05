/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypatterndemo;

/**
 *
 * @author fa20-bse-133
 */
public class ProxyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Image image1 = new ProxyImage("image1.jpg");

        // Display image (potentially loading)
        image1.display();

        // Display again (no loading needed)
        System.out.println("----");
        image1.display();

        // Corrupted image
        System.out.println("----");
        Image image2 = new ProxyImage("corrupted.jpg");
        image2.display();
    }
    
}
