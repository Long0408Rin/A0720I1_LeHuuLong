package B1_Intro_To_Java.Practise;

import java.util.Scanner;

public class First_Degree_Equation {
    public void Xuli(int a,int b,int c) {
        double x;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
            if (b != 0 || c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }

        }
        else if (c == 0) {
            x = (float)-b / a;
            System.out.print("Nghiem cua phuong trinh la:" + x);
        } else {
            x = (float)(c-b) /a;
            System.out.print("Nghiem cua phuong trinh la:" + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("Phuong trinh ax+b=c");
        System.out.println("Nhap vao 3 so a,b,c");
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        First_Degree_Equation n = new First_Degree_Equation();
        n.Xuli(a,b,c);
    }
}
