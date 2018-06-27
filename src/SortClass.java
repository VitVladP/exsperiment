import java.util.Arrays;
import java.util.Collections;

public class SortClass {

    private static Comparable[] buff;

    public static void main(String[] args) {
        Integer[] arr = {3,42,4,56,12,34,53};
//        bubbleSort(arr);
//        choseSort(arr);
//        insertSort(arr);
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void change(Comparable[] arr, int from, int to){
        Comparable var = arr[from];
        arr[from] = arr[to];
        arr[to] = var;
    }

    private static boolean less (Comparable a,Comparable b) {return a.compareTo(b) < 0;}

    private static void bubbleSort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (less(arr[j+1],arr[j])) change(arr,j+1,j);
            }
        }
    }

    private static void choseSort(Comparable[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[j],arr[min])) min = j;
            }
            change(arr,min,i);
        }
    }
    private static void insertSort (Comparable[] arr) {
//        buff = Arrays.copyOf(arr,arr.length);

        for (int i = 0; i < arr.length; i++) {
           for (int j = i; j > 0 && less(arr[j],arr[j-1]); j--)
            change(arr,j,j-1);
        }
    }

    private static void merge(Comparable[] arr,int lo,int mid, int hi){
    buff = Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(arr));
    int i =lo, t= mid+1;
//        for (int k = lo; k <= hi; k++)
//            buff[k] = arr[k];

        for (int k = lo; k <= hi; k++) {
            if ( i > mid) arr[k] = buff[t++];

            else if (t > hi) arr[k] = buff[i++];
            else if(less(buff[t],buff[i])) arr[k] = buff[t++];
            else arr[k] = buff[i++];
        }
    }

    public static void sort(Comparable[] arr) {
//        buff = new Comparable[arr.length];
        sort(arr,0,arr.length-1);
    }

    public static void sort(Comparable[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi-lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);

    }
}
