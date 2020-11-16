package B1_Intro_To_Java.Practise;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Xin chao");
        System.out.println("Moi nhap vao ten ban : ");
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        System.out.println("Hello world by "+ name );
    }
}
