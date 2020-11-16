package B7_Abstract_and_Interface.practise.Resize_Geometric;


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle.resize((Math.random()*100)+1);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
