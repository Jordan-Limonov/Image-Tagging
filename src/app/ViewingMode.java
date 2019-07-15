package app;

import java.util.Scanner;
import app.ViewingFunctions.*;;

public class ViewingMode {

    public static Scanner kb = new Scanner(System.in);

    private ViewingMode(){
        
    }

    public static void choose(){
        String choice = "";
        System.out.println("Hey look you're viewing something which means I didn't screw up.");
        System.out.println("Would you like to view images by tag, or view tag information on a single image?");
        System.out.println("T = View information by tag");
        System.out.println("I = View information on a single image");
        choice = kb.next();
        selectMode(choice);
    }

    public static void selectMode(String choice){
        if(choice.equals("I") || choice.equals("i")){
            ImageInformationCheck.main();
        }else if(choice.equals("T") || choice.equals("t")){
            TagInformationCheck.main();
        }else{
            System.out.println("Please choose T or I");
            choose();
        }
    }
}