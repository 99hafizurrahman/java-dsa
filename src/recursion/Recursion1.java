package recursion;

public class Recursion1 {
    public  static  void  printNum(int n){
        if(n==0)
            return;

        System.out.print(n + " ");
        printNum(n-1);
        System.out.println("After recuresion : " + n);
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}
