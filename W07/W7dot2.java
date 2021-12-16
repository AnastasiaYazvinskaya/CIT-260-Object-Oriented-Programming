/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 7 (2)
*/

package W07;
/*
This program, according to the available data, calculates the total number
of hours for each employee per week and displays two tables. 
One according to the list of names, and the second is a sorted copy of the first, 
in which the lines are arranged in order of decreasing the total number of hours.

public class W7dot2:
    public static void main(String[] args)
    public static double selectingSort(double[] list, String[] name)
*/
public class W7dot2 {
    public static void main(String[] args) {
        //Tells the user what the program does. Note that no user input is required for this program.
        System.out.format("This Program computes the number of hours worked for a set of hourly employees.%n%n");
        //Creates a one-dimensional array of Strings and stores the employee names from the above table in that array.
        String[] name = {
            "Tara Teamlead", 
            "Harry Hacker", 
            "Carl Coder", 
            "Paula Programmer", 
            "Darrin Debugger"
        };
        //Creates a two-dimensional array and stores the hourly data from the table above in that array.
        double[][] hours = {
            {0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0},
            {0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0},
            {0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0},
            {0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0}
        };
        //Adds up the number of hours for each employee and stores the results in a one-dimensional array.
        double[] hoursTotal = {0, 0, 0, 0, 0};
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                hoursTotal[i] += hours[i][j];
            }
        }
        //Displays the names and hours worked for that week as shown in the example below.
        System.out.format("Employee Name       Total Hours");
        for (int i = 0; i < name.length; i++) {
            System.out.format("%n%-20s%.2f", name[i], hoursTotal[i]);
        }
        //Extra credit display
        //Sort the array that contains the total hours for each employee from the highest number of hours to the lowest.
        selectingSort(hoursTotal, name);
        //Displays a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
    /*
    This method sorts two related arrays and displays the table in descending order.
    */
    public static void selectingSort(double[] list, String[] name) {
        for (int i  = 0; i < list.length - 1; i++) {
            double max = list[i];
            String maxName = name[i];
            int maxIndex = i;
            //Finding the maximum value after the list[i] and saving it
            for (int j = i + 1; j < list.length; j++) {
                if (max < list[j]) {
                    max = list[j];
                    maxName = name[j];
                    maxIndex = j;
                }
            }
            //Rechange values in arrays
            if (maxIndex != i) {
                list[maxIndex] = list[i];
                list[i] = max;
                name[maxIndex] = name[i];
                name[i] = maxName;
            }
        }
        //Printing the table
        System.out.format("%n%nExtra Credit:%n%nEmployee Name       Total Hours");
        for (int i = 0; i < name.length; i++) {
            System.out.format("%n%-20s%.2f", name[i], list[i]);
        }
    }
}