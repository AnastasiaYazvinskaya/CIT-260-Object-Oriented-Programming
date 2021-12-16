package W12;
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
    //A no-arg constructor that initializes identifier to 0.
    public Shape() {
        identifier = 0;
    }
    //A parameterized constructor that initializes identifier using argument passed to the constructor.
    public Shape(int identifier) {
        this.identifier = identifier;
    }
    //Getters for identifier
    public int getIdentifier() {
        return identifier;
    }
    //Setters for identifier
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    //A method named getArea( ) that returns a zero.
    public double getArea() {
        return 0;
    }
}
