package array;

import java.util.Scanner;

// Algorithm  :
// 1 : check if first index is greater than next return first index
// 2 : check last index is greater than or equal to its previous index return last index (n-1)
// 3 : traverse each array element and compare previous element and next element arr[i] > = ar[i+1] && arr[i] >=arr[i-1]


public class PeakElement {
    public static int peakElement(int[] nums)
    {
        //add code here.
       int n = nums.length;

        //corner case
        if(n==1)
            return 0;

        if(nums[0]>=nums[1])
            return 0;

        if(nums[n-1]>=nums[n-2])
            return n-1;

        for(int i=1;i<n-1;i++){
            if(nums[i]>=nums[i-1] && nums[i] >= nums[i+1])
                return i;
        }

        return 0;
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(peakElement(arr));
    }
}
