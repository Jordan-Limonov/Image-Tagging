package app.ViewingFunctions;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ImageInformationCheck {

    public static Scanner kb = new Scanner(System.in);
    static String imagePath = "";
    
    private ImageInformationCheck(){

    }

    public static void main() {
        System.out.println("Checking Image stuff...");
        System.out.println("");
        imagePath = kb.next();
        loadImage();
    }

    public static void loadImage() {

    }
}