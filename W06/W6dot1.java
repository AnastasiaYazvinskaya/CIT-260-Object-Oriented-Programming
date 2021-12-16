/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 6 (1)
*/

package W06;

import java.util.Scanner;
public class W6dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.format("Given an investment amount and an annual interest rate, this program will calculate the future value of the investment for a period of ten years.%n%n");
        Scanner input = new Scanner(System.in);
        //Prompts the user to an investment amount, for example, 1000.
        //Gets the user's input and saves it. If the user's input is not a positive, non-zero value, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
        Boolean check = true;
        double rate = 0;
        double invest = 0;
        while (check) {
            System.out.print("Enter a positive, non-zero value for the investment: ");
            invest = input.nextDouble();
            if (invest > 0){
                check = false;
            }
            else {
                System.out.format("%nYour number must be positive, non-zero. Try again.%n%n");
            }
        }
        //Prompts the user to enter an annual interest rate between 0 and 100. For example, 9 would be 9%.
        //Gets the user's input and saves it. If the user's input is not positive or if it is greater than 100, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
        check = true;
        while (check) {
            System.out.print("Enter an annual interest rate, between 0 and 100: ");
            rate = input.nextDouble();
            if (rate >= 0 && rate <= 100){
                check = false;
            }
            else {
                System.out.format("%nYour number must be between 0 and 100. Try again.%n%n");
            }
        }
        
        input.close();
        
        //Using a method that you have written, calculate and display the future value of the investment for a period of 10 years. 
        int year;
        System.out.format("%n%nYears   Future Value");
        for (year=1; year <= 10; year++) {
            System.out.format("%n%2d       $%6.2f", year, futureValue(invest, rate/12/100, year ));
        }
        System.out.format("%n%nGoodbye.");
    }
    //The method header for your method should look like this:
        //public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)
    //The formula for computing the future value of an investment is
        //futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
        return futureValue;
    }
}