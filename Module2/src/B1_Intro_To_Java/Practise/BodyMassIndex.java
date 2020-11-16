package B1_Intro_To_Java.Practise;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BodyMassIndex {
        public static void main(String[] args){
            Scanner kb = new Scanner(System.in);
            double weigh = kb.nextDouble();
            double heigh = kb.nextDouble();
            double BMI = weigh / pow(heigh,2);
        if(BMI < 18.5){
            System.out.println("Under weigh");
        }
        else if(BMI < 22.5){
            System.out.println("Normal");
        }
        else if(BMI < 30){
            System.out.println("Over weigh");
        }
        else {
            System.out.println("Obese");
        }
        }
}
