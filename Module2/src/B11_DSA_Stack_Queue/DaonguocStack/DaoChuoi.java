package B11_DSA_Stack_Queue.DaonguocStack;


import java.util.Scanner;
import java.util.Stack;

public class DaoChuoi {
    public static void daoChuoi(){
       Stack a = new Stack<>();
       System.out.println("Nhap chuoi tai day: ");
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       for(int i = 0; i < input.length(); i++){
           a.push(input.charAt(i));
       }
       while(!a.isEmpty()){
           System.out.print(a.pop());
       }
   }
}
