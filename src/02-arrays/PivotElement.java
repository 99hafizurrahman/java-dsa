package array;
// Pivot element is the least element in array

import java.util.Scanner;

public class PivotElement {

    public  static  int pivotElement(int arr[]){
        int s = 0 , e = arr.length-1, mid = 0;
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[mid] >=arr[0])
                s = mid+1;
            else
                e = mid;
        }
        return arr[e];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(pivotElement(arr));
    }
}
