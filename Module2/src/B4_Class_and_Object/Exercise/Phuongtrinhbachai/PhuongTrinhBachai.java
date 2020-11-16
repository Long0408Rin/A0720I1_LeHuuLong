package B4_Class_and_Object.Exercise.Phuongtrinhbachai;

import java.util.Scanner;

import static java.lang.Math.*;

public class PhuongTrinhBachai {
    int a,b,c;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public PhuongTrinhBachai(){
    }
    public PhuongTrinhBachai(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDiscriminant(){
        return 4*a*c - b*b;
    }
    public double getRoot1(){
        double r1 = (-b + sqrt(pow(b,2) - 4*a*c) ) / ( 2*a);
        return r1;
    }
    public double getRoot2() {
        double r2 = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        return r2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao cac tham so a,b,c: ");
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
        System.out.println("c : ");
        int c = sc.nextInt();
        PhuongTrinhBachai pt = new PhuongTrinhBachai(a,b,c);
        if(pt.getDiscriminant() > 0){
            System.out.println("Phuong trinh co hai nghiem : "+ pt.getRoot1() + "va " +pt.getRoot2());
        }
        if(pt.getDiscriminant() == 0){
            System.out.println("Phuong trinh co nghiem duy nhat :" + (-b)/(2*a));
        }
        if(pt.getDiscriminant() < 0){
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
