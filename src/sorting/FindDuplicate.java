package sorting;

// Problem : Find duplicate in array using hashmap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicate {

    public  static  void findDuplicates(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        for (int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }else{
                map.put(arr[i],1);
            }
        }

        //output
        for(Map.Entry<Integer,Integer> s:map.entrySet()){
            if(s.getValue()>1){

                System.out.println(s.getKey()+ " ");
            }
        }
    }



    //main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        //findDuplicates() mehthod
        findDuplicates(arr,n);

    }
}
