package array;

import java.util.Scanner;

public class SearchInSortedRotated {

    public  static  int getPivot(int arr[]){

        int s = 0, e = arr.length-1,mid = 0;
        while (s<e){
            mid = s+(e-s)/2;
            if(arr[mid]>=arr[0])
                s= mid+1;
            else
                e= mid;

        }
        return  e;
    }

    public  static  int binarySearch(int arr[],int s,int e,int k){
        int mid = 0;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]<k)
                s = mid+1;
            else
                e = mid-1;
        }
        return -1;
    }

    public  static  int searchInSortedRotatedArray(int arr[] , int k){
        // 1 : get pivot
        // 2 : then apply binary search
        int pivot = getPivot(arr);
        int ans = -1;

        if(k>=arr[0] && k<=arr[pivot-1]){
            ans = binarySearch(arr,0,pivot-1,k);
        }else{
            ans = binarySearch(arr,pivot,arr.length-1,k);
        }

        return  ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(searchInSortedRotatedArray(arr,k));


    }
}
