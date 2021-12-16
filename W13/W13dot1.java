package W13;
/*


*/

import java.util.ArrayList;
import java.io.File;
public class W13dot1 {
    public static void main(String[] args) {
        //Tell the user what the program does.
        System.out.format("%n%n");
        //Create the following objects and store the references to them in a single ArrayList.
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        //A Circle object with a radius of 10 inches and an identifier of 156.
        Circle circle = new Circle(156, 1, 1, 10);
        //circle.identifier = 156;
        shapes.add(circle);
        //A Square object with a side of 2 inches and an identifier of 237.
        Square square = new Square(237, 1, 3, 2);
        shapes.add(square);
        //A  Right Triangle with a height of 3 inches, a base of 4 inches and an identifier of 212.
        RightTriangle rightTriangle = new RightTriangle(212, 3, 3, 3, 4);
        shapes.add(rightTriangle);
        //Iterate through the ArrayList and display the area of the three different shape objects you have created.
        System.out.format("%n%nShape      ID  Position  Area" +
                            "%n-----------------------------");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.format("%n%-10s %3d %-8s %6.2f", shapes.get(i).getObjName(), shapes.get(i).getIdentifier(), shapes.get(i).getPoint(), shapes.get(i).getArea());
        }
        File file = new File("W13dot1.txt");
        //Display a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}
