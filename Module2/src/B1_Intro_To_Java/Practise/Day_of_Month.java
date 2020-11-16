package B1_Intro_To_Java.Practise;

import java.util.Scanner;

public class Day_of_Month {
    public static void main(String[] args) {
        System.out.println("Moi nhap vao thang:");
        Scanner kb = new Scanner(System.in);
        int month = kb.nextInt();
        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
