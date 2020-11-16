package B6_inheritance.Triagle_Class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input color: ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(color, 3.0, 4.0,5.0);
        System.out.println(triangle);
    }
}
