package searching;

// A pivot element is the smallest element in array which have mountain array
// [ 7 8 9 1 2 3 4]
// here pivot element is 1 at index 3 and 9 is the peak element

import java.util.Scanner;

public class PivotElement {

    public  static  int pivotElement(int arr[], int n){
        int s = 0;
        int e = n-1;
        int mid = 0;
        while(s<e){
            mid =s+(e-s)/2;
            if(arr[mid]>arr[0])
                s = mid+1;
            else
                e = mid;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(pivotElement(arr,n));
    }

}
