package B1_Intro_To_Java.Practise;

import java.util.Scanner;

public class Convert_To_Word {


    public static void main(String[] args) {
        int number;
        int i = 0;
        String Chu = "";
        int End = 1;

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        System.out.print("Moi nhap vao: ");
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();

        while (number > 0) {
            number /= 10;
            i += 1;
        }
        System.out.println("So nhap vao co " + i + " chu so");
        while (number > 1) {
            int digit = number % 10;
            End = End * 10 + digit;
            number /= 10;
        }
        while (i > 1) {
            number %= 10;
            Chu += ones[number];
            number /= 10;
            i--;
            while (i == 2) {
                Chu += ones[number];
                i--;
            }
        }
        System.out.println(Chu);
    }
}


