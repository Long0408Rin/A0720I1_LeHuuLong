package B4_Class_and_Object.Practise;

import java.util.Scanner;

public class Class_Rectangle {
    float width;
    float height;

    public Class_Rectangle() {
    }

    public Class_Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public float getArea(){
        return this.width * this.height;
    }
    public float getPerimeter(){
        return (this.height + this.width)*2;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Moi nhap vao chieu dai va chieu rong");
        System.out.println("Chieu dai: ");
        float width = kb.nextFloat();
        System.out.println("Chieu rong: ");
        float height = kb.nextFloat();
        Class_Rectangle a = new Class_Rectangle(width,height);
        System.out.println("width :"+width + "\t height :"+ height  );
        System.out.println("Perimeter :"+ a.getPerimeter());
        System.out.println("Area :" + a.getArea() );
    }
}