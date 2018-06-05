package simple.numbers;

import java.util.Arrays;
import java.util.Map;


public class SimpleNambAlgorithm {

    public static long start;
    public static long end;


    public static void main(String[] args) {
        int number = 1000000;
        long firstResult = simpleMethod(number);
        long secondResult = goodMethod(number);
        System.out.println("time " + firstResult);
        System.out.println("time " + secondResult);
    }

    public static long simpleMethod(int num) {
        start = System.currentTimeMillis();
        boolean myArray[] = getArray(num);
        for (int i = 2; i < myArray.length; i++) {
            if (myArray[i]) {
                for (int j = 2; i * j < myArray.length; j++) {
                    myArray[i * j] = false;
                }
            }
        }
        printAr(myArray);
        end = System.currentTimeMillis();
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
        printAr(array);
        end = System.currentTimeMillis();
        return end - start;
    }

    public static boolean[] getArray(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        return arr;
    }

    public static void printAr(boolean arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]) System.out.println(i);
        }
    }
}

