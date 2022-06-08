package array;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOftwoArr {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();

        for(int element : a)
            set.add(element);

        for(int element : b)
            set.add(element);

        System.out.println(set.toString() + " ");

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();


        int arr2[] = new int[m];
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();

        System.out.println(doUnion(arr1,n,arr2,m));
    }
}
