/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 4 (1)
*/

package W04;

import java.util.Scanner;
public class W4dot1 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        // Prompts the user to enter a single hexadecimal digit.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        // Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
        String userInput = input.nextLine();    //A-a
        char hex = Character.toUpperCase(userInput.charAt(0)); //A
        if (userInput.length() != 1 || hex > 'F') {
            System.out.format("%n%n%s is not a valid hexadecimal digit.%nGoodbye.", userInput);
            System.exit(1);
        }
        // Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.
        int dec = hex - '0';
        if (Character.isLetter(hex)) {
            dec = dec - 7;
        }
        String bin = "" + (dec / 8 % 2) + (dec / 4 % 2) + (dec / 2 % 2) + (dec % 2);
        // Outputs the four digit binary number, including any leading zeros.
        System.out.format("%n%nThe binary value is %s.",bin);
        // Outputs a goodbye message.
        System.out.format("%nGoodbye.");

        
        input.close();
    }
}