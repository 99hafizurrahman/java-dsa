//package string;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Flames {
//
//    public static void getFlames(String s1, String s2){
//
//
//        if(s1.length()<=s2.length()){
//            //if s1<s2
//            for(int i=0;i<s1.length();i++){
//                // String c1 = Character.toString(s1.charAt(i));
//                if(s2.contains(Character.toString(s1.charAt(i)))){
//                    int a = s1.indexOf(Character.toString(s1.charAt(i)));
//                    int b = s2.indexOf(Character.toString(s1.charAt(i)));
//
//
//
//                    if(a<=s1.length())
//                        s1 = s1.substring(0,a) +  s1.substring(a+1);
//                    else
//                        s1 = s1.substring(0,a);
//
//
//                    if(b<=s2.length())
//                        s2 = s2.substring(0,b) +  s2.substring(b+1);
//                    else
//                        s2 = s2.substring(0,b);
//
//
//                }
//            }
//
//        }else{
//            for(int i=0;i<s2.length();i++){
//
//
//                if(s1.contains(Character.toString(s2.charAt(i)))){
//                    int a = s1.indexOf(Character.toString(s2.charAt(i)));
//                    int b = s2.indexOf(Character.toString(s2.charAt(i)));
//
//
//                    if(a<=s1.length())
//                        s1 = s1.substring(0,a) +  s1.substring(a+1);
//                    else
//                        s1 = s1.substring(0,a);
//
//
//                    if(b<=s2.length())
//                        s2 = s2.substring(0,b) +  s2.substring(b+1);
//                    else
//                        s2 = s2.substring(0,b);
//
//
//                }
//            }
//
//        }
//
//        int sum = s1.length() + s2.length();
//        sum = sum%6;
//
//        switch(sum){
//            case 1  : System.out.println("Friends");
//                break;
//            case 2  : System.out.println("Love");
//                break;
//            case 3  : System.out.println("Affection");
//                break;
//            case 4  : System.out.println("Marriage");
//                break;
//            case 5  : System.out.println("Enemy");
//                break;
//            case 0  : System.out.println("Siblings");
//                break;
//        }
//
//
//        //check is char is availabe or not
//
//    }
//
//    public static void main (String[] args) throws IOException {
//        // Your code here
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s1 = br.readLine();
//        String s2 = br.readLine();
//
//        getFlames(s1,s2);
//
//    }
//}

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flames {

    public static void getFlames(String s1, String s2){


        if(s1.length()<=s2.length()){
            //if s1<s2
            for(int i=0;i<s1.length();i++){
                 String c = Character.toString(s1.charAt(i));
                if(s2.contains(c)){
                    int a = s1.indexOf(c);
                    int b = s2.indexOf(c);


                    s1 = s1.substring(0,a) +  s1.substring(a+1);
                    s2 = s2.substring(0,b) +  s2.substring(b+1);


                }
            }

        }else{
            for(int i=0;i<s2.length();i++){

                String c = Character.toString(s2.charAt(i));

                if(s1.contains(c)){
                    int a = s1.indexOf(c);
                    int b = s2.indexOf(c);


                    s1 = s1.substring(0,a) +  s1.substring(a+1);


                    s2 = s2.substring(0,b) +  s2.substring(b+1);


                }
            }

        }
        System.out.println(s1);
        System.out.println(s2);
        int sum = s1.length() + s2.length();
        sum = sum%6;

        switch(sum){
            case 1  : System.out.println("Friends");
                break;
            case 2  : System.out.println("Love");
                break;
            case 3  : System.out.println("Affection");
                break;
            case 4  : System.out.println("Marriage");
                break;
            case 5  : System.out.println("Enemy");
                break;
            case 0  : System.out.println("Siblings");
                break;
        }


        //check is char is available or not

    }

    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
//        String str = br.readLine();
//        int a = 0;
//        System.out.println(str.substring(0,a));
        getFlames(s1,s2);

    }
}
