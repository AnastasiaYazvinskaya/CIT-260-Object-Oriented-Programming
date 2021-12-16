package W13;
/*

public class Square extends Shape:
    private double side
    public Square()
    public Square(double side)
    public double getSide()
    public void setSide(double side)
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
public class Square extends Shape {
    //A double side, that holds the square's side amount.
    private double side;
    //A no-arg constructor that initializes side to 0.
    public Square() {
        side = 0;
    }
    //A parameterized constructor that initializes side using argument passed to the constructor.
    public Square(int identifier, int x, int y, double side) {
        this.identifier = identifier;
        this.x = x;
        this.y = y;
        this.side = side;
    }
    //Getters for side
    public double getSide() {
        return side;
    }
    //Setters for side
    public void setSide(double side) {
        this.side = side;
    }
    //Override the getArea( ) method from the Shape class. The area for a square is calculated as: side^2.
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
    @Override
    public String getObjName() {
        return "Square";
    }
}
