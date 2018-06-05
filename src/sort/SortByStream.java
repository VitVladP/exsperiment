package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class SortByStream {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Напиши ченить.....");
            String line = reader.readLine();
            System.out.println(sortString(line));
        } catch (IOException ex) {
            System.out.println("Aaaaaaaa " + ex.getMessage());
        }
    }

    private static String newSort(String s) {
        int length = s.length();
        int[] mass = new int[length];
        mass = s.chars()
                .boxed()
                .parallel()
                .sorted((s1, s2) -> -1)
                .mapToInt(Integer::intValue)
                .toArray();
        return new String(mass, 0, length);
    }

    public static String sortString(String s) {
        return Arrays.stream(s.split(""))
                .sorted(reverseComparator())
                .collect(Collectors.joining());
    }


    public static Comparator<? super String> reverseComparator(){
        return  (o1, o2) -> -1;
    }
}
