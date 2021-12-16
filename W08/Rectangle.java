/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 8 (1)
*/

package W08;
/*
Rectangle class for working with rectangle charecteristics.
The rectangle has width and height. By the default these values equel to 1. 
But can be created a rectangle with the specified width and height.
The class allows us to get and set the width and height, 
and work with them such as get an area or perimeter.

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
public class Rectangle {
    //Two data fields named width and height, that specify the width and height of the rectangle. The default values for both width and height should be 1.
    private double width = 1;
    private double height = 1;
    //A no-arg constructor that creates a default rectangle object.
    public Rectangle() { }
    //A parameterized constructor that creates a rectangle object with the specified height and width.
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    //Getter and setter methods for height and width.
    public double getWidth() {
        return width;
    }
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    //A method named getArea( ) that computes and returns the area of the rectangle.
    public double getArea() {
        return width * height;
    }
    // A method names getPerimeter( ) that computes and returns the perimeter of the rectangle.
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
