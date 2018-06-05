package sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Future never comes!";
        simpleNumbers(20);
        System.out.println(revers(s));
    }

    private static String revers(String s) {
        if (s.length() < 2) return s;
        return s.substring(s.length() - 1) + revers(s.substring(0, s.length() - 1));
    }


    private static void simpleNumbers(int number) {
        boolean arr[] = new boolean[number];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i * i < number; i++) {
            if (arr[i]) {
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i])
                System.out.print(i + " ");
        }
    }
}

