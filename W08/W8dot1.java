/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 8 (1)
*/

package W08;

/* 
This program creates rectangle objects with the specified 
height and width, and displays the information about them
(height, width, area, perimeter).

public class W8dot1:
    public static void main(String[] args)

(Rectangle.java)
public class Rectangle:
    private double width, height
    public Rectangle()
    public Rectangle(double newWidth, double newHeight)
    public double getWidth()
    public void setWidth(double newWidth)
    public double getHeight()
    public void setHeight(double newHeight)
    public double getArea()
    public double getPerimeter()
*/
public class W8dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.format("This program creates two rectangle objects and displays their width, height, area and perimeter.%n%n");
        //Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a height of 3.5 and a width of 5.
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 5);
        //Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle, with 2 digits after the decimal point. 
        System.out.format("Rectangle 1:%nheight = %.2f%nwidth = %.2f%narea = %.2f%nperimeter = %.2f%n",
            rect1.getHeight(), rect1.getWidth(), rect1.getArea(), rect1.getPerimeter());
        System.out.format("%nRectangle 2:%nheight = %.2f%nwidth = %.2f%narea = %.2f%nperimeter = %.2f",
            rect2.getHeight(), rect2.getWidth(), rect2.getArea(), rect2.getPerimeter());
        //Output a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}