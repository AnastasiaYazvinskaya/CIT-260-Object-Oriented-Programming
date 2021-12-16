/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 6 (2)
*/

package W06;

public class W6dot2 {
    //Main method
    public static void main(String[] args) {
        //Tell the user what the program does.
        System.out.format("Dispalying a Celsius to Fahrenheit and Fahrenheit to Celcius ratio table.%n%n");
        //Invoke the above two methods to compute and display the table shown below.
        double cels = 40;
        double fahr = 120;
        int i;
        System.out.format("Celsius        Fahrenheit     |    Fahrenheit     Celsius%n----------------------------------------------------------");
        for (i = 0; i < 10; i++) {
            System.out.format("%n%4.1f           %5.1f          |    %5.1f          %4.1f", cels, celsiusToFahrenheit(cels), fahr, fahrenheitToCelsius(fahr));
            cels--;
            fahr -= 10;
        }
        //Output a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
    //Method for converting Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double tempCelsius) {
        double fahr = (tempCelsius * 9 / 5) + 32;
        return fahr;
    }
    //Method for converting Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        double cels = (tempFahrenheit - 32) * 5 / 9;
        return cels;
    }
}