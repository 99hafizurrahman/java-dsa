package hashing;

import java.util.HashMap;
import java.util.Scanner;

//Time Complexity : O(N Log N)
//Space Complexity : O(N)


public class MaxSubArrSumZero {
    public static int  maxLen(int[] arr, int n)
    {
        // Your code here
        int maxi = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){

            sum = sum + arr[i];

            //to handle if we get sum is 0 from  at index 0 to 1
            if(sum == 0){
                maxi = i+1;
            }else{
                //check sum is present or not in hashmap
                if(hm.get(sum) != null){
                    maxi = Math.max(maxi, i - hm.get(sum));
                }else{
                    hm.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input array element
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(maxLen(arr,n));
    }
}
