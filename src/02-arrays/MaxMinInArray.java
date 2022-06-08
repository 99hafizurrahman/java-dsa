package array;

import java.util.Scanner;

public class MaxMinInArray {

    public  static  void  maxAndMinInArray(int arr[]){
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max)
                max = arr[i];

            if(arr[i]<min)
                min = arr[i];
        }

        System.out.println(max +  " " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        maxAndMinInArray(arr);
    }
}
