package W10;
/*
This program gets input for a triangle from the user.\nIt then creates a Triangle object and displays its description

public class W10dot1:
    public static void main(String[] args)

(GeometricObject.java)
public class GeometricObject:
    private String color
    private boolean filled
    private java.util.Date dateCreated
    public GeometricObject()
    public GeometricObject(String color, boolean filled)
    public String getColor()
    public void setColor(String color)
    public boolean isFilled()
    public void setFilled(boolean filled)
    public java.util.Date getDateCreated()
    public String toString()

(Triangle.java)
public class Triangle:
    private double side1, side2, side3;
    public double getSide1()
    public void setSide1(double side1)
    public double getSide2()
    public void setSide2(double side2)
    public double getSide3()
    public void setSide3(double side3)
    public Triangle()
    public Triangle(double side1, double side2, double side3)
    public double getArea()
    public String toString()
*/
import java.util.Scanner;
public class W10dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.format("This program gets input for a triangle from the user.\nIt then creates a Triangle object and displays its description.%n%n");
        //Prompts the user to enter the values for the sides, color, and filled attribute for a triangle object.
        //Saves the users input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the color of the triangle (e.g. \"red\"): ");
        String color = input.nextLine();
        System.out.print("Is the triangle filled (y or n): ");
        char filledStr = input.nextLine().charAt(0);
        boolean filled = false;
        if (filledStr == 'y') {
            filled = true;
        }
        else if (filledStr == 'n') {
            filled = false;
        }
        double[] sides = new double[3];
        System.out.print("Enter the non-zero, positive lengths of the three sides of the triangle (3 4 5): ");
        String sidesStr = input.nextLine();
        for (int i = 0; i < 3; i++) {
            sides[i] = Double.parseDouble(sidesStr.split(" ")[i]);
        }
        input.close();
        //Using the values entered by the user, creates the Triangle object.
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(filled);
        //Displays the string representation of the Triangle object by calling its toString( ) method.
        System.out.format("%n%s", triangle.toString());
        //Displays a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}
