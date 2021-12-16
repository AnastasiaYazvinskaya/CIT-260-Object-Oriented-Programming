/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 2 (2)
*/

package W02;

import java.util.Scanner;
public class W2dot2 {
    public static void main(String args[]) {
        System.out.println("Given the price of a meal and a percentage to use for the tip, this program calculates the tip, the tax, and the total amount of the bill.");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of the meal: ");
        double cost = input.nextDouble();
        
        System.out.print("Enter the tip percentage: ");
        double tip = input.nextDouble();
        
        tip = cost * tip / 100;
        double tax = cost * 3.2 / 100;
        double bill = cost + tip + tax;
        
        System.out.format("%n%nThe tip is $%.2f%nThe tax is $%.2f%nThe total bill is $%.2f", tip, tax, bill);
        System.out.format("%nGoodbye.");
        
        input.close();
    }
}