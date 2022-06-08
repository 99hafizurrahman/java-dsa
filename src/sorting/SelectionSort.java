package sorting;
import java.util.Scanner;

// APPROACH
// PUT LEAST/MINIMUM ELEMENT LEFT SIDE OF THE ARRAY IN EVERY ROUND

// DRY RUN

// CONDITION : Here we check every starting index i<j true then swap with swap(arr[i],arr[j]);
// we have to find minimum value in array and swap this to left side
// i = 0 to i<n-1 round loop will run b/c no need to compare last index to last index
// j = i+1 to j<n b/c j have to compare every remaining element in array

// [5 4 3 2 1]  // 1 < 5 || arr[4] < arr[0] so swap the element
// [1 4 3 2 5]
// [1 2 3 4 5]
// [1 2 3 4 5]

// Time Complexity : O(n^2)
// Unstable algorithm : because its swap same element position after sorting (9==9)


public class SelectionSort {


    public  static void selectionSort(int[] arr){

        int n = arr.length;
        boolean isSwap = false;
        int count = 0;
        for (int i=0;i<n-1;i++){

            isSwap = false;
            count++;

            //j<n-i-1 : means we only compare less than previous value b/c large element already present in last index in every round so no need to compre that
            for(int j=i+1;j<n;j++){

                //compare to its adjacent element (just next right side element)
                if(arr[i]>arr[j]){

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    isSwap = true;
                }
            }
            //if array is sorted before round n-1 then terminate the loop
            if(isSwap==false)
                break;
        }
        System.out.println("Round : " + count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //calling selectionSort method
        selectionSort(arr);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

    }
}
