package B11_DSA_Stack_Queue.DaonguocStack;

import java.util.Scanner;
import java.util.Stack;

public class DaoSo{
        public static void daoSo (){
            Stack st = new Stack<>();
            System.out.println("Moi ban nhap vao so: ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            String s1 = String.valueOf(s);
            for(int i = 0; i < s1.length(); i++){
                st.push(s1.charAt(i));
            }
            while(st.isEmpty() != true){
                System.out.print(st.pop());
            }
        }
    }

