package entities;

public class CalculatorV1 {

    public final double PI = 3.14159;

    public double calculateCircumference(double radius){
        return 2.0 * PI * radius;
    }

    public double calculateVolume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
