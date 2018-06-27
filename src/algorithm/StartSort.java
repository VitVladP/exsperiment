package algorithm;

import java.util.Arrays;

public class StartSort {
    public static void main(String[] args) {

        int[] arr = { 2,4,566,12,5,322,567,23,43,6};
        System.out.println(Arrays.toString(arr));
//        SomeSorts.softSort(arr);
//        SomeSorts.bubbleSort(arr);
        SomeSorts.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
