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
public class ProxyImage  implements Image{
    private RealImage realImage;
    private String fileName;
    private boolean isValidImage; // Flag for bad code

    public
 
ProxyImage(String fileName)
 
{
        this.fileName = fileName;
    }

    @Override

    
public
 
void
 
display()
 
{
        if (realImage == null) {
            realImage = new RealImage(fileName);
            isValidImage = validateImage(fileName);
        }

        if (isValidImage) {
            realImage.display();
        } else {
            System.out.println("Error: Corrupted image \"" + fileName + "\". Displaying placeholder instead.");
            displayPlaceholder();
        }
    }

    private boolean validateImage(String fileName) {
        // Implement logic to check for corrupt images (e.g., checksum)
        return Math.random() > 0.5; // Randomly simulate valid/corrupted
    }

    private void displayPlaceholder() {
        System.out.println("Displaying placeholder image for \"" + fileName + "\"");
    }
}
