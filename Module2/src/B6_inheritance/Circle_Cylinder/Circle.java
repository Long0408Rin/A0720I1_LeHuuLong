package B6_inheritance.Circle_Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){}
    public Circle(double radius, String color){
        this.color= color;
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Perimeter(){
        return 2*radius*Math.PI;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius: "
                + radius +
                "\n has color is: "+
                color +"\n with Area: "+ getArea()+ "\n and Perimeter is: "
                + getRadius();
    }
}
