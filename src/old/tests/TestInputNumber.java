package old.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TestInputNumber  {

    public static void main(String[] args) {
        int amount = readNumber();
        long firstCalc = simpleSort (getArray(amount));
        long secondCalc = secondSort (getArray(amount));
        System.out.println(firstCalc);
        System.out.println(secondCalc);

    }

    public static long secondSort(boolean array[]){
        long start = System.currentTimeMillis();
        for (int i = 2; i*i < array.length ; i++) {
            if(array[i]){
                for (int j = i*i; j<array.length;j +=i)
                    array[j] = false;
            }
        }
        printArray(array);

        return System.currentTimeMillis() - start;

    }

    public static long simpleSort(final boolean array[]){
        long start = System.currentTimeMillis();
        for (int i = 2; i < array.length; i++) {
            if(array[i]){
                for (int j = 2; j*i < array.length;j++){
                    array[i*j] = false;
                }
            }
        }
        printArray(array);
        return System.currentTimeMillis() - start;
    }

    public static void printArray(final boolean array[]){
        for (int i = 1; i < array.length; i++) {
            if(array[i])
                System.out.println(i);
        }
    }

    public static boolean[] getArray(final int amount){
        boolean array[] = new boolean[amount];
        Arrays.fill(array,true);
        return array;
    }

    public static  boolean isRightNumber(final int number){
        if (number > 0){
            return true;
        }else{
            System.out.println("Ввыденое число меньше 0");
            return false;
        }
    }

    public static int readNumber(){

        boolean flag = true;
        int number = 0;
        String str;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        while(flag) {
            try {
                System.out.print("input number:");
                str = reader.readLine();
                try {
                    number = Integer.parseInt(str);
                    flag = !(isRightNumber(number));
                }catch (Exception e){
                    System.out.println("ввел фигню нужно число больше 0");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }catch (Exception e){
            System.out.println("Проблемы с потоком");
        }
        return number;
    }

}
