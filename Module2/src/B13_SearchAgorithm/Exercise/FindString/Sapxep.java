package B13_SearchAgorithm.Exercise.FindString;

import java.util.LinkedList;

public class Sapxep {
    public static void sort(String s) {
        LinkedList<Character> max = new LinkedList<>();

        // Find the maximum increasingly ordered subsequence
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > list.getLast()) {
                    list.add(s.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "Welcome";
        sort(input);
    }
}
