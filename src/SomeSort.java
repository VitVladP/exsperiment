import java.util.Arrays;

public class SomeSort {

    private static Comparable[] aux;

    public static void main(String[] args) {
        Integer[] arr = {3,54,233,13,32,1,34,56};
//        bubbleSort(arr);
//        sortChoose(arr);
//        insert(arr);
        System.out.println
                (Arrays.toString(arr));
        sort(arr);
        System.out.println
                (Arrays.toString(arr));
        System.out.println(reverseString("Some fucking test"));
    }

    private static void sortChoose(Comparable[] arr){

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
               if (less(arr[j] , arr[min]))
                   min = j;
            }
            change(arr,i,min);
        }
    }

    private static void insert (Comparable[] arr){
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && less(arr[j],arr[j-1]); j--) change(arr,j,j-1);
            }
        }


    private static boolean less (Comparable a, Comparable b){
      return   a.compareTo(b) < 0;
    }

    private static void  bubbleSort(Comparable[] arr){
        int length = arr.length;

        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (less(arr[j] , arr[j+1])) change(arr,j,j+1);
            }
        }
    }

    private static void change (Comparable[] arr, int from, int to){
        Comparable vremValue = arr[from];
        arr[from] = arr[to];
        arr[to] = vremValue;

    }

    public static void merge (Comparable[] arr, int lo, int mid,int hi) {
//       aux = new Comparable[arr.length];
        int i = lo, j= mid+1;
        for (int k = lo; k <= hi; k++)
        aux[k] = arr[k];
        for(int k = lo; k <= hi; k++)
            if ( i > mid)  arr[k] = aux[j++];
            else if (j > hi ) arr[k] = aux[i++];
            else if (less(aux[j],aux[i])) arr[k] = aux[j++];
            else arr[k] = aux[i++];
     }

    public static void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr,0, arr.length-1);


    }
    public static void sort(Comparable[] arr,int lo,int hi){
        if(hi<=lo) return;
        int mid = lo+(hi-lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);

    }

    public static String reverseString (String str){
        if (str.length() < 2) return str;
        return reverseString(str.substring(str.length()/2)) + reverseString(str.substring(0,str.length()/2));
    }
}
