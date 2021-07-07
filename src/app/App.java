package app;

import java.util.Scanner;

import javax.swing.*;

public class App {

    public static Scanner kb = new Scanner(System.in);
    public static String[] placeholder = new String[20];

    static String versionNumber = "v0.0.0";

    static JFrame frame = new JFrame();
    static JLabel welcomeMessage = new JLabel("Welcome to the Image Tagging app " + versionNumber + ".");

    private App() {

    }

    public static void main(String[] args) throws Exception {
        welcomeMessage.setHorizontalAlignment();
        
        frame.add(welcomeMessage);
        frame.setSize(640, 480);
        frame.setVisible(true);
        // String choice = "";

        // System.out.println("What would you like to do?");
        // System.out.println("T = Tagging mode");
        // System.out.println("V = Viewing mode");
        // choice = kb.next();

        // selectMode(choice);
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