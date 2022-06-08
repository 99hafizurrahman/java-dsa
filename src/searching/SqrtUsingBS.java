package searching;


//In this we can find binary search apply and get square root of any number

import java.util.Scanner;

public class SqrtUsingBS {
    public  static  int squareRoot(int n){
        int s = 0,  e = n , mid = 0;
        int ans= 0;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid>n){
                e = mid-1;
            }else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(squareRoot(n));
    }
}
