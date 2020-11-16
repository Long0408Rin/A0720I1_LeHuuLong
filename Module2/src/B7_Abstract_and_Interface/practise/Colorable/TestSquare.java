package B7_Abstract_and_Interface.practise.Colorable;

public class TestSquare {
    public static void main(String[] args){
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(5);
        System.out.println(square1);

        square1.Colorable(true);
        System.out.println(square1);
    }
}
