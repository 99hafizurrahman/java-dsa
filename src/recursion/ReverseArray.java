package recursion;

import java.util.Arrays;

public class ReverseArray {
  public  static  void   reverseArray(int arr[],int i){
        if(i>=arr.length/2)
            return;
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverseArray(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
