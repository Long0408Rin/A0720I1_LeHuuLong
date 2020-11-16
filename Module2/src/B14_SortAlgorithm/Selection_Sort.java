package B14_SortAlgorithm;

public class Selection_Sort {
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length -1; i++){
            int currentMin = arr[i];
            int currentMinIndex = i;

            for(int j = i +1;j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[i];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
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
