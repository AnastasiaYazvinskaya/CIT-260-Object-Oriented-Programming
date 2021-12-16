package W10;
/*
The Triangle class inherits all accessible data fields and methods from the ­GeometricObject class.
In addition, it has the data fields for sides: side1, side2, side3.

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
*/
public class Triangle extends GeometricObject {
    //Three data fields side1, side2, and side3 that represent sides of a triangle.
    private double side1, side2, side3;
    //Getter and setter methods for side1, side2, and side3.
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    //A no-arg constructor that creates a default triangle with each side equal to 1.
    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    //A parameterized constructor that creates a triangle with specified values for side1, side2, and side3, a color, and a filled attribute.
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //A member method named getArea( ) that calculates and returns the area of the triangle. The formula to compute the area of a Triangle, given three sides is called Heron's formula. Heron's formula is described in problem 2.19 in the textbook. 
    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        return (Math.sqrt(S * (S - side1) * (S - side2) * (S - side3)));
    }
    //A member method named toString( ) that generates a String representation of the triangle object. This toString()  method must call GeometricObject's  toString() method to correctly display the String representation of the Triangle object.
    public String toString() {
        return "Triangle Output:" + 
            "\nside1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 +
            "\n" + super.toString() + "\nArea = " + getArea(); 
    }
    //Create a UML diagram that documents your class design. Show both the GeometricObject class and the Triangle class in your diagram. Include your diagram when you submit your assignment. The preferred format is a .PDF file.
}
