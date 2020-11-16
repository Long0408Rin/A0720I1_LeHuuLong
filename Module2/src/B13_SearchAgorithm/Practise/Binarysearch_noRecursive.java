package B13_SearchAgorithm.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binarysearch_noRecursive {
    static List<Integer> myArr = new ArrayList<>();
    static public int head = 0;
    static public int tail = myArr.size() -1 ;



    public static void BinarySearch(List arr, int key) {
        while (head <= tail) {
            int mid = (tail-head)/2;
            if ((int) arr.get(mid) == key) {
                System.out.println(mid);
            }
            else if((int) arr.get(mid) < key){
                head = mid + 1;
            }else{
                tail = mid - 1;
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args){
        System.out.println("Mang co bao nhieu phan tu");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("nhap mang ");
        for(int i =0; i< n;i++){
            myArr.add(input.nextInt());
        }
        System.out.println("Nhap so can tim: ");

        int key = input.nextInt();
        BinarySearch(myArr,key);
    }
}

