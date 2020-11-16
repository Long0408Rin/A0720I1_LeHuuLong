package B1_Intro_To_Java.Exercise;

import java.util.Scanner;

public class QuyDoiTien {
    public static void main(){
        System.out.println("Moi nhap so tien can doi");
        Scanner input = new Scanner(System.in);
        float USD = input.nextFloat();
        float Quydoi = USD*23000;
        System.out.println("So tien da quy doi la: "+ Quydoi + "VND");
    }
}
