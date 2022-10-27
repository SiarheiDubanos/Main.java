package Homeworks.Home3;
import java.util.Scanner;

public class Raduga {
    public static final String RED = "red";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";
    public static final String DARK_BLUE = "dark-blue";
    public static final String PURPLE = "purple";



    public static void main (String[] args) {
        method1();
    }


    public static void method1(){
        System.out.println("You need to write a colour number from 1 to 7. \nDo you want to printout singlecolour or doublecolour? \nPlease write SINGLE or DOUBLE");
        String s = new Scanner(System.in).next();
        if (s.contains("SINGLE")) {
            singleColour();
        } else if (s.contains("DOUBLE")){
        doubleColour();}
        else {
            incorrectData();}
    }

public static String singleColour() {
    System.out.println("Please write colour number");
    int a = new Scanner(System.in).nextInt();
    switch (a) {
        case 1:
            System.out.println("Your colour is " + RED);
            break;
        case 2:
            System.out.println("Your colour is " + ORANGE);
            break;
        case 3:
            System.out.println("Your colour is " + YELLOW);
            break;
        case 4:
            System.out.println("Your colour is " + GREEN);
            break;
        case 5:
            System.out.println("Your colour is " + BLUE);
            break;
        case 6:
            System.out.println("Your colour is " + DARK_BLUE);
            break;
        case 7:
            System.out.println("Your colour is " + PURPLE);
            break;
        default:
            incorrectData();
            return singleColour();

    }
return null;

}
public static void doubleColour(){
            System.out.println("Please write colour number");
    int b = new Scanner(System.in).nextInt();

    switch (b) {
        case 1:
            singleColour();
            System.out.println(RED);
            break;
        case 2:
            singleColour();
            System.out.println(ORANGE);
            break;
        case 3:
            singleColour();
            System.out.println(YELLOW);
            break;
        case 4:
            singleColour();
            System.out.println(GREEN);
            break;
        case 5:
            singleColour();
            System.out.println(BLUE);
            break;
        case 6:
            singleColour();
            System.out.println(DARK_BLUE);
            break;
        case 7:
            singleColour();
            System.out.println(PURPLE);
            break;
        default:
            incorrectData();



    }


}



    public static void incorrectData() {
        System.out.println("Vvedeny nekorrektnye dannye");
    }


}
