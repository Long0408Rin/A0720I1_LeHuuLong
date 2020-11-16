package B6_inheritance.Triagle_Class;

public class Triangle extends Shape {
    double side = 1.0;
    double side1 = 1.0;
    double side2 = 1.0;

    public Triangle(){}
    public Triangle(double side, double side1, double side2) {
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(String color, double side, double side1, double side2) {
        super(color);
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getPerimeter(){
        return side + side1 + side2;
    }
    public double getArea(){
        return Math.sqrt((getPerimeter()/2 * ((getPerimeter() / 2) - side)  * ((getPerimeter() / 2) - side1) * ((getPerimeter() / 2) - side2)));
    }

    public String toString(){
        return "Triangle" + color +
                "Perimeter: " + getPerimeter()
                +"Area: " + getArea();
    }
}
