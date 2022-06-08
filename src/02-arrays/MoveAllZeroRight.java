package array;

import java.util.Scanner;

public class MoveAllZeroRight {
    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i] = 0;
        }

         for(int i=0;i<n;i++)
             System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();


        pushZerosToEnd(arr,n);



    }

}
