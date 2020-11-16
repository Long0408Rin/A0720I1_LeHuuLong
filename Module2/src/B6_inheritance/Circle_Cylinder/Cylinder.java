package B6_inheritance.Circle_Cylinder;

public class Cylinder extends Circle {
    private double heigh;
    public Cylinder(){};

    //constructor
    public Cylinder(double heigh){
        this.heigh = heigh;
    }
    public Cylinder(double radius, String color, double heigh){
        super(radius, color);
        this.heigh = heigh;
    }
    //getter & setter
    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double CylinderArea(){
        return heigh*super.getArea();
    }
    public double CylinderPerimeter(){
        return heigh*super.Perimeter();
    }
}
