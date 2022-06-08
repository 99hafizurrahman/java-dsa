package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    //roate by love babber
    public  static  void  rotate(int arr[], int d ,int n){
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[(i+d)%n] = arr[i];
        }
        System.out.println(Arrays.toString(temp));

    }

    //rotate anticlockwise
    public static void rotateAntiClockwise(int[] arr, int d, int n)
    {
        // add your code here
        //store first d element in
        // shift remains element from start index
        // now put temp element in left side of array
        if(d>n)
            d= d%n;

        int[] temp = new int[d];
        for(int i=0;i<d;i++)
            temp[i] = arr[i];

        //put remaking element to first index
        for(int i=0;i<n-d;i++)
            arr[i] = arr[i+d];

        //put temp array to last index
        for(int i=0;i<d;i++)
            arr[n-d+i] = temp[i];

        System.out.println(Arrays.toString(arr));
    }



// rotate clock wise
    public static  void rotateClockwise(int[] nums, int k) {

        if(k>nums.length)
            k = k%nums.length;


        int[] temp = new int[k];
        int j = 0;

        //store k element into temp array
        for(int i=nums.length -k; i<nums.length; i++){
            temp[j] = nums[i];
            j++;
        }



        //shift element to right side
        j=0;
        for(int i=nums.length-k-1 ; i>=0;i--){
            nums[nums.length-j-1] = nums[i];
            j++;
        }

        //fill temp array with nums[]

        for(int i=0;i<k;i++)
            nums[i] = temp[i];

        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

//        rotateClockwise(arr,k);
//        rotateAntiClockwise(arr,k,n);
        // rotate by love babbar
        rotate(arr,k,n);
    }
}
