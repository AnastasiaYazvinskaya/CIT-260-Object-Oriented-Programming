/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 2 (1)
*/

package W02;

import java.util.Scanner;
public class W2dot1 {
    public static void main(String[] args) {
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a temperature in degrees Celsius: ");
        double cel = input.nextDouble();
        
        double fahr = 9 * cel / 5 + 32;
        
        System.out.format("%n%n%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.", cel, fahr);
        System.out.format("%nGoodbye.");

        input.close();
    }
}