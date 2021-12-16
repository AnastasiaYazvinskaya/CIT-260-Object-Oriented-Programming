/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 7 (1)
*/

package W07;
/*
This program prompts the user to input 5 numbers and then computes 
and display the mean and the standard deviation for this set of numbers.

public class W7dot1:
    public static void main(String[] args)
    public static double mean(double[] list)
    public static double deviation(double[] list)
*/
import java.util.Scanner;
public class W7dot1 {
    public static void main(String[] args) {
        //Tells the use what the program does.
        System.out.format("This program computes the mean and the standard deviation for a set of numbers.%n%n");
        //Prompts the user to enter five numbers.
        //Saves the user's input in an array of doubles.
        double[] numbers = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextDouble();
        }
        input.close();
        //Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
        double mean = mean(numbers);
        double deviation = deviation(numbers);
        //Displays the mean and the standard deviation with 2 digits after the decimal point.
        System.out.format("%n%nThe mean of this set of numbers is %.2f%nThe standart deviation is %.2f", mean, deviation);
        //Displays a goodbye message.
        System.out.format("%n%nGoodbye.");
        //Your file should have the proper file prologue, and each method should have the proper method prologue.
        
    }
    /*
    Method for calculating the mean
    Mean is the sum of the numbers in the list divided by their number.
    */
    public static double mean(double[] list) {
        double sum = 0;
        for (double num:list) {
            sum += num;
        }
        return (sum/list.length);
    }
    /*
    Method for calculating the Standart Deviation
    The square root of the sum of the squares of the difference list[i] and 
    the mean of numbers up to list[i], including list[i], where and takes 
    a value from 1 to 5, divided by the number of elements minus 1.
    */
    public static double deviation(double[] list) {
        double sum = 0;
        double[] newList;
        for (int i = 0; i < list.length; i++) {
            newList = new double[i+1];
            for (int j = 0; j < newList.length; j++) {
                newList[j] = list[j]; 
            }
            // If I use a newlist list for mean wich will contain the numbers until the list[i], including list[i] then I will get 1.42
            sum += Math.pow((list[i] - mean(newList)), 2);
            // But if I will use just a list list, the whole list then I will get 1.65
            //sum += Math.pow((list[i] - mean(list)), 2);
        }
        return (Math.sqrt(sum / (list.length - 1)));        
    }
}