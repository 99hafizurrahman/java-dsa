package sorting;

import java.util.Arrays;

public class MergeSortApnaCollege {

    public  static  void  merge(int arr[],int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int x = 0;
        int merged[] = new int[high-low + 1];
        while (i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                merged[x] = arr[i];
                i++;
                x++;
            }else{
                merged[x] = arr[j];
                j++;
                x++;
            }
        }

        //put remaining element;
        while (i<=mid){
            merged[x] = arr[i];
            x++;
            i++;
        }

        while (j<=high){
            merged[x] = arr[j];
            x++;
            j++;
        }

        //now put this sorted array into original array
        int s = low;
        for(int k=0;k<merged.length;k++){
            arr[s] = merged[k];
            s++;
        }
    }
   public static void mergeSort(int arr[], int low , int high){
        if(low>=high)
            return;
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void main(String[] args) {

        int arr[] = {3,6,9,2,8,5};

        int n = arr.length;

        mergeSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
