package recursion;

public class SumOfNNumbers {
    public  static  void  printSum(int i, int n, int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        int n = 5;
        printSum(1,n,0);
    }
}
