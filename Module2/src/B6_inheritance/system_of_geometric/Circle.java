package B6_inheritance.system_of_geometric;

public class Circle extends Shape{
    double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(String color,boolean filled){

    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius *2;
    }
    public double getPerimeter(){
        return Math.pow(radius,2) * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius ="
                + radius +", "
                + "which is a sub class of " + super.toString();
    }

}
