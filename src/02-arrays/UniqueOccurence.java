package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Input: arr = [1,2,2,1,1,3]
//        Output: true
//        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
public class UniqueOccurence {
    public  static  boolean isUniqueOuccurence(int [] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]))
                    hm.put(arr[i], hm.get(arr[i])+1);
            else
                    hm.put(arr[i],1);
        }

        for(int n : hm.keySet()){
            if(hs.contains(hm.get(n)))
                    return  false;
            else
             hs.add(hm.get(n));
        }
        return true;
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
        System.out.println(isUniqueOuccurence(arr));
    }
}
