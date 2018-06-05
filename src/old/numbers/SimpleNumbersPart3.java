package simple.numbers;


import java.util.Arrays;

public class SimpleNumbersPart3 {
    static int amount = 100;

    public static void main(String[] args) {
        calc1();
        calc2();
    }

    public static void calc1 (){
        boolean array[] = getbooleanArrayofTrue(amount);
        for (int i = 2; i < array.length; i++) {
            if (array[i]){
                for (int j = 2; j*i < array.length ; j++) {
                    array[i*j] = false;
                }
            }


        }
        printArray(array);
    }
    public static void calc2(){
        boolean array[] = getbooleanArrayofTrue(amount);
        for (int i = 2; i*i <array.length ; i++) {
            if(array[i]){
                for (int j = i*i; j < array.length ; j +=i) {
                    array[j] = false;
                }
            }

        }
        printArray(array);


    }

    public static boolean [] getbooleanArrayofTrue(final int count){
        boolean array[] = new boolean [count];
        Arrays.fill(array,true);
        return array;
    }
    public static void printArray(boolean array[]){
        for( int i = 1 ; i<array.length;i++)
            if (array[i])
                System.out.println(i);
    }
}
