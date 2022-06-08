package math;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAlgo {
    public  static  boolean[]  sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i<=Math.sqrt(n);i++){
            for(int j=2*i; j<=n; j=j+i){
                isPrime[j] = false;
            }
        }

      return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         boolean[] isPrime =  sieveOfEratosthenes(n);
        for(int i=2;i<=n;i++){
            if(isPrime[i])
                System.out.print(i +  " ");
        }
    }
}
