package recursion;

import sun.awt.windows.WPrinterJob;

public class FactorialOfNum {
    public  static  int calculateFactorial(int n){
        if(n==0){

            return 1;
        }

        int fact_numOne = calculateFactorial(n-1);
        int fact_n = n * fact_numOne;
        return  fact_n;


    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calculateFactorial(n);
        System.out.println(ans);
    }
}
