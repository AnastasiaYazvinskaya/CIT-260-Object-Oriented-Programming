package W13;
/*

public class Circle extends Shape:
    private double radius
    public Circle()
    public Circle(double radius, int identifier)
    public double getRadius()
    public void setRadius(double radius)
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
public class Circle extends Shape {
    //A double radius, that holds the circle's radius amount.
    private double radius;
    //A no-arg constructor that initializes radius to 0.
    public Circle() {
        radius = 0;
    }
    //A parameterized constructor that initializes radius using argument passed to the constructor.
    public Circle(int identifier, int x, int y, double radius) {
        this.identifier = identifier;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //Getters for radius
    public double getRadius() {
        return radius;
    }
    //Setters for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Override the getArea( ) method from the Shape class. The area for a circle is calculated as: Pi x radius^2.
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String getObjName() {
        return "Circle";
    }
}
