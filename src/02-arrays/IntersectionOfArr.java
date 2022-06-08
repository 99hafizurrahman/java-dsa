package array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArr {


    public  static  void  intersectionOfArray(int [] arr1, int [] arr2){
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(list);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        //input array
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        //input array
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();

        intersectionOfArray(arr1,arr2);
    }
}
