package array;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoArr {


   public static void findSum(int a[], int b[]) {
        // code herei
        ArrayList<Integer> ans = new ArrayList<>();
       ArrayList<Integer> reverse = new ArrayList<>();

        int m = a.length - 1;
        int n = b.length - 1;
        int carry = 0;


        while(m>=0 && n>=0){

           int sum = a[m] + b[n];
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);

            m--;
            n--;
        }

        //case one
        while(m>=0){
           int sum = carry + a[m];
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            m--;
        }

        //case two
        while(n>=0){
           int sum = carry + b[n];
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            n--;
        }
        //third case
        while(carry != 0){
           int sum = carry;
            carry = sum / 10;
            sum = sum %10;
            ans.add(sum);
        }

       for(int i=ans.size()-1;i>=0;i--){
           reverse.add(ans.get(i));
       }


       System.out.println(reverse);
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

        findSum(arr1,arr2);
    }
}
