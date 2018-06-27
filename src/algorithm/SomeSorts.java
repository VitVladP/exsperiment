package algorithm;

class SomeSorts {

    private static int length;

    static void softSort(int[] arr) {
        length = arr.length;

        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            exch(arr, i, min);
        }
    }

    private static void exch(int[] arr, int i, int min) {
        int a = arr[min];
        arr[min] = arr[i];
        arr[i] = a;

    }


    static void bubbleSort(int[] array) {
        length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] < array[j + 1]) exch(array, j, j + 1);
            }
        }
    }

    static void insertSort(int[] array) {

        length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && (array[j] < array[j - 1]); j--)
                exch(array, j, j - 1);
        }
    }
}
