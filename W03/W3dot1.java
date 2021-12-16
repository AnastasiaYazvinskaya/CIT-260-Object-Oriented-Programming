/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 3 (1)
*/

package W03;

import java.util.Scanner;
public class W3dot1 {
    public static void main(String[] args) {
        System.out.println("Given today's day of the week and some number of days in the future this program will tell you the day of the week for the future day.");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        int wday = input.nextInt();
        System.out.print("Enter the number of days in the future: ");
        int days = input.nextInt();
        
        int future = (wday + days) / 7;
        
        if (days > 0) {
            String s_wday = "";
            switch (wday) {
                case 0: s_wday  = "Sunday"; break;
                case 1: s_wday  = "Monday"; break;
                case 2: s_wday  = "Tuesday"; break;
                case 3: s_wday  = "Wednesday"; break;
                case 4: s_wday  = "Thursday"; break;
                case 5: s_wday  = "Friday"; break;
                case 6: s_wday  = "Saturday"; break;
            }
            String s_future = "";
            switch (future) {
                case 0: s_future = "Sunday"; break;
                case 1: s_future = "Monday"; break;
                case 2: s_future = "Tuesday"; break;
                case 3: s_future = "Wednesday"; break;
                case 4: s_future = "Thursday"; break;
                case 5: s_future = "Friday"; break;
                case 6: s_future = "Saturday"; break;
            }
            System.out.format("%n%nToday is %s and the future day is %s.", s_wday, s_future);
        }
        else {
            System.out.format("%n%n%d is invalid. You must enter a positive number.", days);
        }
        
        System.out.format("%nGoodbye.");
        
        input.close();
    }
}