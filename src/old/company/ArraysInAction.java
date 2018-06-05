package old.company;

import java.util.ArrayList;

public class ArraysInAction {
    public static void main(String[] args) {

        ArrayList<Integer> numbers  = new ArrayList<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Списочный массив " + numbers);

       Integer numb[] = new Integer[numbers.size()];
               numb = numbers.toArray(numb);
     int summ = 0;
        for (int n:
                numbers) {
            summ += n;

        }
        System.out.println(summ);
    }


}
