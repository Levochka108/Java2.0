package HeapSort;

import HeapSort.com.heapsort.HeapSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {43, 23, 18, 1, 19, 2, 108, 55, 25, 46, 77, 89, 90};
        HeapSort.heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
