package B14_SortAlgorithm;

public class BubbleSort {
    public static void sort(int[] array){
        boolean isSort = true;
        for (int k = 1; k < array.length && isSort; k++) {
            /* Array may be sorted and next pass not needed */
            isSort = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSort = true; /* Next pass still needed */
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 10, 5, 8, 3};
        sort(arr);
        for (int a : arr) {
                System.out.print(a + "\n");
            }
    }
}
