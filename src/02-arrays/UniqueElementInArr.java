package array;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueElementInArr {
    public  static  int uniqueElementInArr(int [] arr){
        //Approach 2 :
        //HashMap is best solution for this problem but it gives O(N) time complexity
        HashMap<Integer,Integer> map = new HashMap<>();

//        for(int i=0;i<arr.length;i++)
//            if(map.containsKey(arr[i]))
//                map.put(arr[i],map.get(arr[i]) + 1);
//            else
//                map.put(arr[i],1);

            //now return the element which have 1 frequency in hashmap
//        for(int i=0;i<arr.length;i++)
//            if(map.get(arr[i]) == 1)
//                return  arr[i];

        //if no unique found then return -1;
//        return  -1;

        //Approach 1 :

        int ans = 0;
        for (int j : arr) ans = ans ^ j;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //check always with odd and even array
        // [1 2 3 4 5 6]
        // [1 2 3 4 5]
       System.out.println(uniqueElementInArr(arr));
    }
}
