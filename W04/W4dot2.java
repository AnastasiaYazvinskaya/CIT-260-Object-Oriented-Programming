/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 4 (2)
*/

package W04;

import java.util.Scanner;
public class W4dot2 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your gross pay, state withholding tax, federal withholding tax, and your net pay. It then displays your pay stub.");
        // Prompts the user to enter their first and last name.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        // Gets the user's input and saves it as a String.
        String name = input.nextLine();
        // Prompts the user to enter the number of hours they worked this week.
        System.out.print("Enter the hours you worked this week: ");
        // Gets the user's input and saves it.
        double work = input.nextDouble();
        // Prompts the user to enter their hourly wage.
        System.out.print("Enter your hourly wage: ");
        // Get's the user's input and saves it.
        double wage = input.nextDouble();
        // Calculates the state withholding tax (9%) and the federal withholding tax (20%).
        // Calculates the gross pay and the net pay after subtracting the withholding taxes.
        double pay = work * wage;
        double state_tax = pay * 0.09;
        double federal_tax = pay * 0.2;
        double net = pay - state_tax - federal_tax;
        // Outputs a pay statement as shown in the example below.
        System.out.format("%n%nPay Stub for %s%nHours Worked: %.0f%nHourly Wage: $%.2f%nGross Pay: $%.2f%nState Tax Withheld: $%.2f%nFederal Tax Withheld: $%.2f%nNet Pay: $%.2f%n",
            name, work, wage, pay, state_tax, federal_tax, net);
        // Outputs a goodbye message.
        System.out.format("%nGoodbye.");
        
        input.close();
    }
}