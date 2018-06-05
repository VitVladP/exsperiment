package simple.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleNumbers {
    public static void main(String[] args) {

        int number = readNumber();
        printSimpleNumbers(number);

    }

    public static void printSimpleNumbers(int number){
        long start = System.currentTimeMillis();
        for (int i = 1; i < number; i++) {
            if (i<4) {
                System.out.println(i);
                continue;
            }
            for (int j = 2 ; j <= i/2; j++){
                if (i%j == 0) break;
                if (j == i/2)
                System.out.println(i);

            }

        }
        long end = System.currentTimeMillis();
        long thirst = end - start;


        start = System.currentTimeMillis();
        boolean boolNumbers [] = new boolean[number];
        Arrays.fill(boolNumbers,true);
        for (int i=2; i*i< number; i++){
            if (boolNumbers[i]){
                for (int j=i*i; j < number; j+=i ){
                    boolNumbers[j] = false;
                }
            }

        }
        for (int i=0; i<number; i++ )
            if (boolNumbers[i]) {
                System.out.println(i);
            }
        end = System.currentTimeMillis();
        System.out.println(thirst);
        System.out.println(end - start);
    }

    public static int readNumber (){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        String str;
        boolean flag = true;
        while(flag) {
            try {
               System.out.println("введите число: ");
               str = reader.readLine();
                try {
                    number = Integer.parseInt(str);
                    flag = !(testNumber(number));
                } catch (Exception e){
                    System.out.println("Не получилось преобразовать строку в число!");
                }
            } catch (IOException e) {
                System.out.println("не удалось считать строку");
            }


        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    public static boolean testNumber (int number){
        if (number > 0) {
            return true;
        }else {
            System.out.println("Введено не корректное число");
            return false;
        }

    }
}
