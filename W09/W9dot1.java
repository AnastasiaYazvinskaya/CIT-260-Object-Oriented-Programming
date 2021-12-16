/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 9
*/
package W09;
/*


public class W9dot1:
    public static void main(String[] args)

(MyPoint.java)
public class MyPoint {
    private int x, y;
    public int getX()
    public void setX(int newX)
    public int getY()
    public void setY(int newY)
    public MyPoint()
    public MyPoint(int newX, int newY)
    public double distance(int xCoord, int yCoord)
    public double distance(MyPoint p)
    public static double distance(MyPoint mp1, MyPoint mp2)
*/
import java.util.Scanner;
public class W9dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.format("This program creates a point at (0,0) and a point at the coordinates entered by you. It then computes and displays the distance from (0,0) to the point defined by you, using three different methods.%n%n");
        //Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
        MyPoint p1 = new MyPoint();
        //Prompts the user to enter the x and y coordinates of a point.
        //Saves the users input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate of a point: ");
        int xCoord = input.nextInt();
        System.out.print("Enter the y coordinate of a point: ");
        int yCoord = input.nextInt();
        input.close();
        //Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.
        System.out.format("Using method 1, the distance from (%d,%d) to (%d,%d) is %.2f%n", p1.getX(), p1.getY(), xCoord, yCoord, p1.distance(xCoord, yCoord));
        //Uses the parameterized constructor to create a MyPoint object p2 using the x-coordinate and the y-coordinate entered  by the user.
        MyPoint p2 = new MyPoint(xCoord, yCoord);
        //Uses the second and third distance methods to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2.  The distance is displayed with two digits after the decimal point.
        System.out.format("Using method 2, the distance from (%d,%d) to (%d,%d) is %.2f%n", p1.getX(), p1.getY(), p2.getX(), p2.getY(), p1.distance(p2));
        System.out.format("Using method 3, the distance from (%d,%d) to (%d,%d) is %.2f", p1.getX(), p1.getY(), p2.getX(), p2.getY(), MyPoint.distance(p1, p2));
        //Displays a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}
