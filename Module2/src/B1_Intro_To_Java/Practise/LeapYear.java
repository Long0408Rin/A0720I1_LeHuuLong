package B1_Intro_To_Java.Practise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year = kb.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d la nam nhuan", year);
                } else {
                    System.out.printf("%d khong phai nam nhuan", year);
                }
            } else {
                System.out.printf("%d la nam nhuan", year);
            }
        } else {
            System.out.printf("%d khong phai nam nhuan", year);

        }
    }
}
