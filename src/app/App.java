package app;

import java.util.Scanner;
import app.TaggingMode;
import app.ViewingMode;

public class App {

    public static Scanner kb = new Scanner(System.in);
    
    private App() {

    }
    public static void main(String[] args) throws Exception {
        String choice = "";
        String versionNumber = "v0.0.0";

        System.out.println("Welcome to the Image Tagging app " + versionNumber + ".");
        System.out.println("What would you like to do?");
        System.out.println("T = Tagging mode");
        System.out.println("V = Viewing mode");
        choice = kb.next();
        System.out.println("Your choice was: " + choice);
        TaggingMode.choose();
        ViewingMode.choose();
    }
}