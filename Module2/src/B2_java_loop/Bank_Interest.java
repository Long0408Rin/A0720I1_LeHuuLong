package B2_java_loop;

import java.util.Scanner;

public class Bank_Interest {

    public static void main(String[] args){
        System.out.println("nhap vao so tien can nhap");
        Scanner input = new Scanner(System.in);
        int Tiengoi = input.nextInt();
        System.out.println("Nhap lai suat:");
        float Laisuat = input.nextFloat()/100;
        System.out.println("tien lai la:" + Tiengoi*Laisuat);
    }
}
