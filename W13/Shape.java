package W13;
/*
This class contain Shape identifier.
And base for getArea method.

public class Shape:
    private int identifier
    public Shape()
    public Shape(int identifier)
    public int getIdentifier()
    public void setIdentifier(int identifier)
    public double getArea()
*/

//Design a class named Shape.
public class Shape {
    //An integer identifier, that holds the shape's identifier number.
    protected int identifier;
    protected int x;
    protected int y;
    //A no-arg constructor that initializes identifier to 0.
    public Shape() {
        identifier = 0;
        x = 0;
        y = 0;
    }
    //A parameterized constructor that initializes identifier using argument passed to the constructor.
    public Shape(int identifier, int x, int y) {
        this.identifier = identifier;
        this.x = x;
        this.y = y;
    }
    //Getters for identifier
    public int getIdentifier() {
        return identifier;
    }
    //Setters for identifier
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    //Getters for identifier
    public double getX() {
        return x;
    }
    //Setters for identifier
    public void setX(int x) {
        this.identifier = identifier;
    }
    //Getters for identifier
    public double getY() {
        return y;
    }
    //Setters for identifier
    public void setY(int y) {
        this.y = y;
    }
    //A method named getArea( ) that returns a zero.
    public double getArea() {
        return 0;
    }
    public String getPoint() {
        return "("+x+","+y+")";
    }
    public String getObjName() {
        return "";
    }
}
