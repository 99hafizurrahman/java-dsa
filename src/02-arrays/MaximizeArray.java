package array;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class MaximizeArray {


    public static void maximizeTheArray(int[] arr1, int[] arr2, int n) {

        ArrayList<Integer> list = new  ArrayList<>();
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashMap<Integer,Integer> map = new HashMap<>();

        int i = n-1;
        int j = n-1;
        while(i>=0 && j>=0 && list.size() != 5){

            if(arr1[i] >= arr2[i] && !map.containsKey(arr1[i])){
                map.put(arr1[i],i);
                list.add(arr1[i]);
                i--;
            }else if(arr2[j] >= arr1[i] && !map.containsKey(arr2[i])){
                map.put(arr2[i],i);
                list.add(arr2[i]);
                j--;
            }

        }



        for(int k=0;i<n;k++){
            System.out.print(list.get(k) + " ");
        }

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int arr1[] = new int[N];
        int arr2[] = new int[N];


        for(int i=0;i<N;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            arr2[i] = sc.nextInt();
        }

        maximizeTheArray(arr1,arr2,N);
    }
}