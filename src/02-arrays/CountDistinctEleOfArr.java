package array;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctEleOfArr {

    public  static  int countDistinctElement(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
            set.add(arr[i]);

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(countDistinctElement(arr));
    }
}
