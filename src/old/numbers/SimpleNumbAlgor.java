package simple.numbers;

import java.util.Arrays;

public class SimpleNumbAlgor {
    public static long start;
    public static long end;


    public static void main(String[] args) {
        int number = 10000000;
        long firstResult = simpleMethod(number);
        long secondResult = goodMethod(number);
        System.out.println("time " +firstResult);
        System.out.println("time " +secondResult);


    }


    public static long simpleMethod(int num) {
        start = System.currentTimeMillis();
        boolean arr[] = getArray(num);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = false;
                }
            }
        }
       end = System.currentTimeMillis();
        printArr(arr);
        return end - start;
    }

    public static long goodMethod(int num) {
        start = System.currentTimeMillis();
        boolean array[] = getArray(num);
        for (int i = 2; i * i < array.length; i++) {
            if (array[i]) {
                for (int j = i*i; j < array.length; j += i) {
                    array[j] = false;
                }
            }
        }
        end = System.currentTimeMillis();
    printArr(array);
    return end - start;
    }

    public static boolean[] getArray(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        return arr;
    }

    public static void printArr(boolean arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]) System.out.println(i);
        }
    }
}
