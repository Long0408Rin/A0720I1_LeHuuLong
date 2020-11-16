package B14_SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayStep_IS {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            System.out.println(arr[i]);
            int k = i - 1;
            for (; k >= 0 && arr[k] > currentElement; k--) {
                System.out.println(arr[k + 1]);
                System.out.println(arr[k]);
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap so phan tu mang: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Moi nhap cac phan tu cua mang");
        for(int i = 0; i < n; i++ ){
            array[i]= input.nextInt();
        }
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
