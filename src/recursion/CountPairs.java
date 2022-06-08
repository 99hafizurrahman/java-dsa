//package recursion;
//
//import java.util.Scanner;
//
//public class CountPairs {
//    public  static int countPairs(String str){
//        int i=0;
//        int count = 0;
//        if(str.length()<3) {
//            return 0;
//        }else{
//            if(str.charAt(i)==str.charAt(i+2)){
//                count++;
//            }
//
//            return  countPairs(str);
//        }
//        return  count;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str= sc.nextLine();
//        long ans = countPairs(str);
//        System.out.println(ans);
//    }
//}
