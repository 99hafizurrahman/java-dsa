package sorting;
import java.util.Scanner;

// APPROACH
// Bubble sort take the largest element to last/right side of array in every round;
// Bubble sort compare value to its adjacent(next right side value) element
// PUT LARGEST ELEMENT RIGHT SIDE OF ARRAY IN EVERY ROUND

// DRY RUN
// [6 2 5 3]

// CONDITION :  (i=0 to i<n-1) and for j (loop j=0 j<n-i-1) b/c there are no element after last element
// here j only run less than i b/c last element of array is already larget element so we no need to compare that element.

// Round 1 :
// i = 0 and j > j+1
// 2 6 5 3
// 2 5 6 3
// 2 5 3 6 // here the largest element in first round

// Round 2 :
// i = 1
// 2 3 5 6

//NOTE : The i loop continue after sorting array n-1 time. That is why we must have to use some condtion (isSwap = false)
//       so we can terminate the loop if array is sorted.



public class BubbleSort{

    public  static void bubbleSort(int[] arr){

        int n = arr.length;
        boolean isSwap = false;
        int count = 0;
        for (int i=0;i<n-1;i++){

            isSwap = false;
            count++;

            //j<n-i-1 : means we only compare less than previous value b/c large element already present in last index in every round so no need to compre that
            for(int j=0;j<n-i-1;j++){

                //compare to its adjacent element (just next right side element)
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

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

        //calling bubbleSort method
        bubbleSort(arr);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

    }
}