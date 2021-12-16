/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 5 (1)
*/

package W05;

public class W5dot1 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program shows a table of the ratio of kilograms and pounds.");
        // Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
        System.out.format("%n%nkilograms    pounds%n---------    ------");
        int kg;
        double lb;
        for (kg = 1; kg <= 15; kg += 2) {
            lb = kg * 2.2;
            System.out.format("%n%2d          %4.1f   ", kg, lb);
        }
        // Outputs a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}