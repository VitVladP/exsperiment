import java.util.Arrays;
import java.util.List;

public class LastSort {

    private static Comparable[] buff;

        public static void main(String[] args) {
            Integer[] arr = {3,6,1,23,6,434,54,87,90};
//        bubble(arr);
//        choose(arr);
//        sort(arr);
            insert(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(reverse("I love this game!"));

            List<Integer> num = Arrays.asList(2,3,4,5,6);
            num.forEach(System.out::println);
        }

        public static void change(Comparable[] arr, int from,int to) {
            Comparable temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
        }

        public static boolean less(Comparable a, Comparable b) {
            return a.compareTo(b) < 0;
    }

    public static void bubble(Comparable[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length -1; j++) {
                if (less(arr[j+1],arr[j])) change(arr,j,j+1);
            }
        }
    }

    private static void insert(Comparable[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && less(arr[j],arr[j-1]); j--) {
                change(arr,j,j-1);
            }
        }
    }


    public static void choose(Comparable[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (less (arr[j],arr[min])) change(arr,min,j);
            }
        }
    }

    private static void merge (Comparable[] arr, int lo,int mid,int hi){
        int i = lo, j = mid+1;
        buff = Arrays.copyOf(arr,arr.length);

        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = buff[j++];
            else if (j > hi) arr[k] = buff[i++];
            else if (less(arr[j],arr[i])) arr[k] = buff[j++];
            else arr[k] = buff[i++];
        }
    }

    private static void sort(Comparable[] arr){
        sort(arr,0,arr.length-1);
    }

    private static void sort(Comparable[] arr,int lo,int hi ){
        if(lo >= hi) return;
        int mid = lo + (hi -lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo ,mid,hi);
    }

    private static String reverse(String str){
        if (str.length() < 2) return str;
        return reverse(str.substring(str.length()/2)) + reverse(str.substring(0,str.length()/2));
    }


}


