/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 3 (2)
*/

package W03;

import java.util.Scanner;
public class W3dot2 {
    public static void main(String[] args) {
        System.out.println("Given a year and a month in that year, this program will tell you the number of days in that month.");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();
        
        if (month > 0 && month < 13) {
            int days = 0;
            String s_month = "";
            switch (month) {
                case 1: days = 31; 
                    s_month = "January"; break;
                case 2: 
                    if (isLeapYear) {
                        days = 29;
                    }
                    else {
                        days = 28;
                    }
                    s_month = "February"; break;
                case 3: days = 31;
                    s_month = "March"; break;
                case 4: days = 30;
                    s_month = "April"; break;
                case 5: days = 31;
                    s_month = "May"; break;
                case 6: days = 30;
                    s_month = "June"; break;
                case 7: days = 31;
                    s_month = "July"; break;
                case 8: days = 31;
                    s_month = "August"; break;
                case 9: days = 30;
                    s_month = "September"; break;
                case 10: days = 31;
                    s_month = "October"; break;
                case 11: days = 30;
                    s_month = "November"; break;
                case 12: days = 31;
                    s_month = "December"; break;
            }
            System.out.format("%n%n%s of %d has %d days in it.", s_month, year, days);
        }
        else {
            System.out.format("%n%n%d is invalid. Month values must be between between 1 and 12, inclusive.", month);
        }
        
        System.out.format("%nGoodbye.");
        
        input.close();
    }
}