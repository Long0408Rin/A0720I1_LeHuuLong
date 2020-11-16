package B7_Abstract_and_Interface.practise.Colorable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double heigh = 1.0;

    public Rectangle(){
    }
    public Rectangle(double width,double heigh){
        this.heigh = heigh;
        this.width = width;
    }
    public Rectangle(String color,boolean filled,double width,double heigh){
        super(color,filled);
        this.width = width;
        this.heigh = heigh;
    }
    //get set
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getArea() {
        return width * this.heigh;
    }

    public double getPerimeter() {
        return 2 * (width + this.heigh);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                +getHeigh()
                + ", which is a subclass of "
                + super.toString();
    }
}

