package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

    public static void main(String[] args) {

        AbstractShape shape = new Circle(Color.BLACK, 2.0);
        AbstractShape shape1 = new Rectangle(Color.BLUE, 3.0, 4.0);

        System.out.println("Circle color: " + shape.getColor());
        System.out.println("Cicle area: " + String.format("%.3f", shape.area()));
        System.out.println("Retangle color: " + shape1.getColor());
        System.out.println("Retangle area: " + String.format("%.3f", shape1.area()));
    }
}
