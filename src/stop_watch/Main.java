package stop_watch;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long[] arr = new long[100000];
        Date date = new Date();
        StopWatch stopWatch = new StopWatch();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (long)(Math.random()*1000);
        }
        System.out.println("Start sorting: " + date);
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    long temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        stopWatch.stop();
        System.out.println("Sorting time in ms: " + stopWatch.getElapsedTime());
    }
}
