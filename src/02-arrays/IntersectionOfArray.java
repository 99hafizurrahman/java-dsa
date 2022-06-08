package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArray {

    public static void intersectionOfArray(int a[], int b[], int n, int m) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0 , j = 0;


        while(i<n && j<m){

            if(a[i] == b[j]){
                list.add(a[i]);
                count++;
                i++;
                j++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(count);
        System.out.println(list);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0;i<n;i++)
                a[i] = sc.nextInt();

        for(int i=0;i<m;i++)
            b[i] = sc.nextInt();

        intersectionOfArray(a,b,n,m);
    }

}
