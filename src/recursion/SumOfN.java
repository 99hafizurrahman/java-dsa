package recursion;

import java.util.Scanner;

public class SumOfN {
    //sum of N natural number
    public  static  long sumOfN(long n){
        if(n<0)
            return 0;
        return  n+sumOfN(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = sumOfN(n);
        System.out.println(ans);
    }
}
