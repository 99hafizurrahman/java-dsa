package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatCharInString {
    public  static  int firstNonRepeatCharInStr(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),Integer.MAX_VALUE);
            }
        }

        return  1;
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = firstNonRepeatCharInStr(s);
        System.out.println(n);
    }
}
