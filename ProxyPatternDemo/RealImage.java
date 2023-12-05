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
public class RealImage implements Image {
     private String fileName;
    private long fileSize;

    public RealImage(String fileName) {
        this.fileName = fileName;
        fileSize = loadImageFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.printf("Displaying %s (%.2f MB)\n", fileName, fileSize / 1024.0 / 1024.0);
    }

    private long loadImageFromDisk(String fileName) {
        // Simulate loading image from disk
        System.out.println("Loading image: " + fileName);
        return (long) (Math.random() * 10); // Random size in MB
    }
}
