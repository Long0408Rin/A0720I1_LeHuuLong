package B6_inheritance.system_of_geometric;

public class Rectangle extends Shape {
    double width;
    double length;
    public  Rectangle(){
        width = 1.0;
        length =1.0;
    }
    public Rectangle(double width,double length){}

    public Rectangle(double side, double side1, String color, boolean filled) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return (width + length)*2;
    }
    public double getPerimeter(){
        return width*length;
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "
                + width +" and length = "
                + length + "which is a subclass of "+ super.toString();
    }

}

