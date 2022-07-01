package entities;

public class CalculatorV2 {

    public static final double PI = 3.14159;

    public static double calculateCircumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double calculateVolume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
