package question2;

import java.util.ArrayList;

public class Main {

    public static void main(String... args) {

        IShape triangle = new Triangle(10, 5);
        IShape circle = new Circle(8);
        IShape rectangle = new Rectangle(6, 8);

        ArrayList<IShape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);

        double sumOfAreas = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sumOfAreas += shapes.get(i).computeArea();
        }

        System.out.println("Sum of Areas : " + sumOfAreas);

    }
}
