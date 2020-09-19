//Jeremy Lu
//AP Computer Science A Period
//Char Methods
// 9-18-2020
import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        char n = ch;
        if (n >= 'A' && n <= 'Z') {
        n = (char) (n + 32);
        }
        return n;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String new_string = "";
        for(int counter = 0; counter<str.length(); counter++){
          new_string += toLower(str.charAt(counter));
        }
        return new_string;
    }


    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        char n = ch;
        if (n >= 'a' && n <= 'z') {
        n = (char) (n - 32);
        }
        return n;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String new_string = "";
        for(int counter = 0; counter<str.length(); counter++){
        new_string += toUpper(str.charAt(counter));
        }
        return new_string;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a character (Note: In the event of string input, code will run for first character of string.) ");
        char ch = scan.nextLine().charAt(0);  
        System.out.println("Lowercase: " + toLower(ch));
        System.out.println("Uppercase: " + toUpper(ch));
        System.out.println("Please input a string: ");
        String str = scan.nextLine();
        System.out.println("Uppercase: " + myToUpperCase(str));
        System.out.println("Lowercase: " + myToLowerCase(str));
    }
}