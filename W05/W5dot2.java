/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 5 (2)
*/

package W05;

public class W5dot2 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program displays all of the numbers from 100 to 1000 that are divisible by both 5 and 6.");
        // Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        // The numbers must be separated by exactly one space and there must be 10 numbers per line.
        System.out.format("%n");
        int num;
        int i = 0;
        for (num = 100; num < 1000; num++) {
            if ((num % 5 == 0) && (num % 6 == 0)) {
                System.out.print(num);
                i++;
                if (i < 10) {
                    System.out.print(" ");
                }
                else {
                    i = 0;
                    System.out.format("%n");
                }
            }
        }
        // Outputs a goodbye message.
        System.out.format("%nGoodbye.");
    }
}