package pattern;

import java.util.Scanner;

public class Rectangle {
    //using for loop
    public  static  int forLoop(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            count++;
            for(int j=1;j<=n;j++){
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }
        return  count;
    }
    public  static  int  printRectangle(int n){
        int count = 0;
        int total = n*n;
        int i = 1;
        while (i<=total){
            System.out.print("* ");

            //check for newline condition
            if(i%n==0)
                System.out.println();

            i++;
            count++;
        }
        return  count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println();

        int count1 = printRectangle(N);
        System.out.println("while loop : " + count1);

        int count2 =  forLoop(N);
        System.out.println("for loop : " + count2);

    }
}
