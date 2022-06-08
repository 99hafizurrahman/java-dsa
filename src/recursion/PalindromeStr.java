package recursion;

import java.util.Scanner;

public class PalindromeStr {
    static boolean check_Palindrome(String str,int s, int e)
    {

//enter your code here

        //I missed this corner case condition now its working
        if(str.length() == 1){
            return true;
        }
        if(e==s)
            return false;

        if(str.charAt(s) == str.charAt(e)){

            str = str.substring(1, str.length()-1);

            if(str.length()<=1){
                return  true;
            }
        }else{
            return false;
        }

        return check_Palindrome(str,0,str.length()-1);


    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check_Palindrome(str,0,str.length()-1));

    }
}
