package recursion;

public class FibonacciSeries {
    public  static  void printFibonacci(int n, int t1,int t2, int next){
//        int t1=0,t2=1,next = 0;
//        for(int i=0;i<n;i++){
        if(n==0)
            return;
        System.out.print(next + " ");
        t1 = t2;
        t2 = next;
        next = t1+t2;
        printFibonacci(n-1,t1,t2,next);
//        }
    }
    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n,0,1,0);
    }
}
