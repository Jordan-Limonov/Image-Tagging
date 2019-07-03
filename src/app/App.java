package app;

import java.util.Scanner;
import app.TaggingMode;
import app.ViewingMode;

public class App {

    public static Scanner kb = new Scanner(System.in);
    public static String[] placeholder = new String[20];

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
        // if(choice == "V" || choice == "v"){
        //     ViewingMode.choose();
        // }else if(choice == "T" || choice == "t"){
        //     TaggingMode.choose();
        // }else{
        //     System.out.println("Please choose V or T");
        // }
        selectMode(choice);
    }
    public static void selectMode(String mode) throws Exception {
        if(mode.equals("V") || mode.equals("v")){
            ViewingMode.choose();
        }else if(mode.equals("T") || mode.equals("t")){
            TaggingMode.choose();
        }else{
            System.out.println("Please choose V or T");
            main(placeholder);
        }
    }
}