package searching;

import java.util.Scanner;

public class SearchInSortedRotatedArr {
    public static int getPivot(int nums[]){
        int s = 0,mid = 0, e = nums.length-1;
        while(s<e){
            mid = s+(e-s)/2;
            if(nums[mid]>=nums[0])
                s = mid+1;
            else
                e = mid;

        }
        return s;
    }

    //binary search
    public static int binarySearch(int nums[] , int start , int end , int target){
        int mid = 0, s = start , e = end;
        while(s<=e){
            mid = s+(e-s)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                s = mid+1;
            else
                e = mid -1;

        }
        return -1;
    }

    public static int search(int[] nums, int target) {

        // 1 : find pivot element
        int pivot = getPivot(nums);

        if(target>=nums[pivot] && target<=nums[nums.length-1])
            return binarySearch(nums,pivot,nums.length-1,target);
        else
            return binarySearch(nums,0,pivot-1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();

        System.out.println(search(arr,target));
    }

}

