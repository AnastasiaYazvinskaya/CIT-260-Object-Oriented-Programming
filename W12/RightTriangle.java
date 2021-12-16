package W12;
/*

public class RightTriangle extends Shape:
    private double height
    private double base
    public RightTriangle()
    public RightTriangle(double height, double base)
    public double getHeight()
    public void setHeight(double height)
    public double getBase()
    public void setBase(double base)
    @Override
    public double getArea()

(Shape.java)
public class Shape:
    private int identifier
    public Shape()
    public Shape(int identifier)
    public int getIdentifier()
    public void setIdentifier(int identifier)
    public double getArea()
*/

//Design a class named Circle that inherits from Shape.
public class RightTriangle extends Shape {
    //A double height, that holds the right triangle's height amount.
    private double height;
    //A double base, that holds the square's base amount.
    private double base;
    //A no-arg constructor that initializes height and base to 0.
    public RightTriangle() {
        height = 0;
        base = 0;
    }
    //A parameterized constructor that initializes height and base using arguments passed to the constructor.
    public RightTriangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    //Getters for height
    public double getHeight() {
        return height;
    }
    //Setters for height
    public void setHeight(double height) {
        this.height = height;
    }
    //Getters for base
    public double getBase() {
        return base;
    }
    //Setters for base
    public void setBase(double base) {
        this.base = base;
    }
    //Override the getArea( ) method from the Shape class. The area for a RightTriangle is calculated as: height x base / 2.
    @Override
    public double getArea() {
        return height * base / 2;
    }
}
