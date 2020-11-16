package B4_Class_and_Object.Exercise.StopWatch;

import java.util.Scanner;

public class StopWatch {

    int[] Array = new int[100000];
    private long startTime = 0;
    private long endTime = 0;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime =System.currentTimeMillis();
    }
    public void sort() {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 1000);

        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 1; j < Array.length; j++) {
                if (Array[i] > Array[j]) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
    }
    public long getElapseTime(){
        long elapseTime = (endTime - startTime)/1000;
        return elapseTime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StopWatch w = new StopWatch();
        w.start();
        w.sort();
        w.stop();
        System.out.println("Thoi gian thuc hien thuat toan: "+ w.getElapseTime()+ "s" );
    }
}
