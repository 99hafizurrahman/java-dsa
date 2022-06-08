package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueNumOfChar {

    public static int uniqueNumOfChar(String s){

        HashMap<Character,Character> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),s.charAt(i));
                count++;
            }

        }
        return count;
    }

    //main method
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = uniqueNumOfChar(s);
        System.out.println(n);
    }
}
