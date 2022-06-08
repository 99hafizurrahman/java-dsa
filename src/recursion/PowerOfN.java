//package recursion;
// 1 : my own method to solve x^n
//
//public class PowerOfN {
//    public  static  int calcPower(int x, int n, int pow){
//        if(n==0)
//            return pow;
//        if(x==0)
//            return 0;
//        pow *=x;
//        return calcPower(x,n-1,pow);
//    }
//    public static void main(String[] args) {
//        int x = 2, n = 5, pow = 1;
//        int ans = calcPower(x,n,pow);
//        System.out.println(ans);
//    }
//}



// 2 : type convertions in power by apna college
//package recursion;
//
//public class PowerOfN {
//    public  static  int calcPower2(int x, int n){
//        if(n==0)
//            return 1;
//        if(x==0)
//            return 0;
//
//        int xPowNum1 = calcPower2(x,n-1);
//        int xPown = x * xPowNum1;
//        return  xPown;
//
//    }
//    public static void main(String[] args) {
//        int x = 2, n = 5, pow = 1;
//        int ans = calcPower2(x,n);
//        System.out.println(ans);
//    }
//}

// 3 : newton school
package recursion;

public class PowerOfN {
    public  static  int calcPower2(int x, int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;

        return  n*(calcPower2(x,n-1));

    }
    public static void main(String[] args) {
        int x = 2, n = 5, pow = 1;
        int ans = calcPower2(x,n);
        System.out.println(ans);
    }
}
