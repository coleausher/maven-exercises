import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
//
//Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//        Example Console Output
//
//
//        Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

public class MavenExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");

        String input = scanner.nextLine();
        System.out.println("You Entered: " + input);
        if(StringUtils.isNumeric(input)){
            System.out.println("This is a number");
        }else {
            System.out.println("This is not a number");
        }
        System.out.println("Flipped Case: " + input.toUpperCase());
        System.out.println("Reversed: \"" + StringUtils.reverse(input) + "\"");
        System.out.println("Origional String: " + input);




    }
}
