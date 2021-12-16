/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 9
*/
package W09;

/*
This class represents a point in 2-dimensional space 
and count the distance between two points.

public class MyPoint
    private int x, y;
    public int getX()
        return x
    public void setX(int newX)
    public int getY()
        return y
    public void setY(int newY)
    public MyPoint()
    public MyPoint(int newX, int newY)
    public double distance(int xCoord, int yCoord)
        return Math.sqrt(Math.pow(x-xCoord, 2) + Math.pow(y-yCoord, 2))
    public double distance(MyPoint p)
        return Math.sqrt(Math.pow(x-p.getX(), 2) + Math.pow(y-p.getY(), 2))
    public static double distance(MyPoint mp1, MyPoint mp2)
        return Math.sqrt(Math.pow(mp1.getX()-mp2.getX(), 2) + Math.pow(mp1.getY()-mp2.getY(), 2))
*/

//Design a class named MyPoint that represents a point in 2-dimensional space. Your class should contain the following:
public class MyPoint {
    //Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
    private int x, y;
    //Getter and setter methods for x and y.
    public int getX() {
        return x;
    }
    public void setX(int newX) {
        x = newX;
    }
    public int getY() {
        return y;
    }
    public void setY(int newY) {
        y = newY;
    }
    //A no-arg constructor that creates a default point at (0,0).
    public MyPoint() {
        x = 0;
        y = 0;
    }
    //A parameterized constructor that creates a point at the designated x and y coordinate.
    public MyPoint(int newX, int newY) {
        x = newX;
        y = newY;
    }
    //A member method named distance that calculates and returns the distance between this MyPoint object and another point that is specified by its x- and y-coordinates.
    public double distance(int xCoord, int yCoord) {
        return Math.sqrt(Math.pow(x-xCoord, 2) + Math.pow(y-yCoord, 2));
    }
    //A member method named distance that calculates and returns the distance between this MyPoint object and another object of the MyPoint class.
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(x-p.getX(), 2) + Math.pow(y-p.getY(), 2));
    }

    //A static method named distance that takes two objects of the MyPoint class as parameters, and calculates and returns the distance between the two of them.
    public static double distance(MyPoint mp1, MyPoint mp2) {
        return Math.sqrt(Math.pow(mp1.getX()-mp2.getX(), 2) + Math.pow(mp1.getY()-mp2.getY(), 2));
    }

    //Create a UML diagram that documents your class design Submit your class diagram with your assignment. The preferred format is a .PDF file  
}
