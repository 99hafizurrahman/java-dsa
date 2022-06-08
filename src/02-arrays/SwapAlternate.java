package array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {

    public  static  void swap(int arr[], int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    public  static  void  swapAlternate(int [] arr){
        for(int i=0;i<arr.length;i = i+2){
            if(i+1< arr.length)
              swap(arr,i);
        }

        //print array
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //check always with odd and even array
        // [1 2 3 4 5 6]
        // [1 2 3 4 5]
        swapAlternate(arr);
    }
}
