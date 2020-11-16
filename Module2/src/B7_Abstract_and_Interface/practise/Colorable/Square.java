package B7_Abstract_and_Interface.practise.Colorable;

public class Square extends Rectangle implements howtoColor{

    public Square() {
    }

    public Square(double side) {
        super(side,side) ;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeigh(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeigh(double heigh) {
        setSide(heigh);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void Colorable(boolean isColorable){
        System.out.println("Color for all sides");
    }
}

