package sorting;

import java.util.HashMap;
import java.util.Scanner;

public class CountUniqueElement {

    public  static int countUniqueElement(int[] arr,int n) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],arr[i]);
            }
            else{
                hm.put(arr[i],arr[i]);
                count++;

            }


        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];

        //input array
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //calling mergeSort method
       int size =  countUniqueElement(arr,n);


            System.out.println(size);

    }
}
