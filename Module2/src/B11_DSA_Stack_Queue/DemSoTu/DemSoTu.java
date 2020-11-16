package B11_DSA_Stack_Queue.DemSoTu;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class DemSoTu<i> {
    public static void main(String[] args) {

        Map<String, Integer> m = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] c = input.split(" ");
        for (String w:c) {
            if(m.containsKey(w)){
                m.put(w,m.get(w)+1);
            }
            else{
                m.put(w , 1);
            }
        }
        for(String s : m.keySet()){
            System.out.println(s + "value: "+ m.get(s));
        }

    }
}