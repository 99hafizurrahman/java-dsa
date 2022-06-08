package sorting;
import java.util.Scanner;

// APPROACH
// REMEMBER : Use card example to remember the algorithm
// Example : If someone gives me random number 5, I put it in my  hand ==> 5
// If you give another one 2 then I check 2<5, so I put on the left ==> 2 5
// another 4 , so 4 is less than 5 but greater than 2 so put between both 2 and 5 ==> 2 4 5
// another 6 , it is greater than 5, so I put on right side/top side on my hand ==> 2 4 5 6

// Insertion sorting everytime loop will continue until the condition is not satisfied.

// DRY RUN
// [5 4 3 2 1]

// CONDITION :
// i = 1 to i<n and j=i-1 to j>=0 && while j+1 > k (where k is arr[i])

// Round 1 :
// 4<5 left shift => [4 5 3 2 1]
// Round 2 :
// 3<5 left shift => [3 4 5 2 1]
// Round 3 :
// 2<5 left shift => [2 3 4 5 1]
// Round 4 :
// 1<5 left shift => [1 2 3 4 5]

//TIME COMPLEXITY ==>
// Best case : Arrays is already sorted O(n)
// worst case : O(n^2)
//SPACE COMPLEXITY ==> 0(1)

public class InsertionSort {

    public  static void insertionSort(int[] arr){

        int n = arr.length;
        boolean isSwap = false;
        int count = 0;
        for (int i=1;i<n;i++){

            isSwap = false;
            count++;
            int k = arr[i];

            // j is always start with 1
            int j = i-1;
            while(j>=0 && arr[j]>k){
//             while(arr[j]> k && j>=0){   // Gives error WHY??? Array out of bound but both line are same
                //compare to its left elements
                    arr[j+1] = arr[j];
                    j--;

//                    isSwap = true;

            }
            //put arr[i] value in right place
            arr[j+1] = k;
            //if array is sorted before round n-1 then terminate the loop
//            if(!isSwap)
//                break;
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

        //calling insertionSort method
        insertionSort(arr);

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");

    }
}
