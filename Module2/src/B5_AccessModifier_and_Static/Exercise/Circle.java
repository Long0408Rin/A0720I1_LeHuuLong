package B5_AccessModifier_and_Static.Exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {}
    Circle(double r){
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
