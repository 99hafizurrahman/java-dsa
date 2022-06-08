package sorting;

import java.util.Scanner;

// APPROACH
// Divide the array into two parts and divide this array into two parts until they became single element
// After that compare single value and merge it into current array.
// This can solve using two method first is used to divide the array into two parts and another one is used to merge
// the array after sorting


//Method :
// 1 :mergeSort() method :
// 1 : make an mergeSort() method and pass into three things arr,l(start index), and last index
// 2 : calculate its middle index
// 3 : now call mergeSort() method recursively two times
// 4 : Now we pass into mergeSort(arr,l,mid)  //first part array
// 5 : mergeSort(arr,mid+1,r) //second part of array
// 6 : now call the merge(arr,l,mid,r) method

// 6 : merge() method :
// 7 : merge(arr,l,mid,r) , this method take four parameter first is actual array, second is index of left side of
// array, third, middle index (where array is divided into two parts position) and final is right index of array.
// 8 : merge() method create two temporary arrays to store divide arrays.
// 9 : before creating arrays we must have to declare its size using l,mid,and r

public class MergeSort {

    //merge method
    public  static  void merge(int[] arr, int l, int mid , int r){

        //calculate the size of arrays
        int n1 = mid-l+1;
        int n2 = r-mid;

        //creating arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //storing values in temporary arrays.
        for(int i=0; i<n1; i++)
            L[i] = arr[l+i];

        for(int i=0;i<n2;i++)
            R[i] = arr[mid+i+1];

        int i = 0;
        int j = 0;
        int k = l;

        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //remaining elements
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    //mergeSort method
    public  static  void mergeSort(int[] arr, int l , int r){
        if(l<r){

            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid); //calling for first half array
            mergeSort(arr,mid+1,r); //calling for second half array
            merge(arr,l,mid,r); //merge two sorted half
        }
    }






    //Main method
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[]  arr = new int[n];

        //input array
//        for(int i=0;i<n;i++)
//            arr[i] = sc.nextInt();

        //calling mergeSort method
        int arr2[] = {6,3,9,2,8,5};
        int n = arr2.length;
        mergeSort(arr2,0,n-1);

        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i] + " ");

    }
}
