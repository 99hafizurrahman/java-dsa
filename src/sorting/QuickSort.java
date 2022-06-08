package sorting;

import java.util.Scanner;

public class QuickSort {

    //swap method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //partition method
    //it is used to pivot element of array
    // return correct position of pivot element and
    // shift all element to the left which is less than pivot element and shift all element to right which is greater than pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, high);
        return i + 1;

    }

        //quickSort method
        public static void quickSort (int[] arr, int low, int high){
            if (low < high) {
                int p = partition(arr, low, high);
                quickSort(arr, p + 1, high);
                quickSort(arr, low, p - 1);
            }
        }

        //Main method
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            //input array
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            //calling quickSort method
            quickSort(arr,0,n-1);

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");

        }

}