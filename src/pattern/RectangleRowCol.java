package pattern;

import java.util.Scanner;

public class RectangleRowCol {

    //using forLoop
    public  static  int forLoop(int r, int c){
        int count = 0;
        for(int i=1;i<=r;i++){
            count++;
            for(int j=1;j<=c;j++){
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }
        return  count;
    }

    public  static  int printRectangle(int r , int c){

        int total = r*c;
        int count = 0;
        int i=1;
        while (i<=total){
            System.out.print("* ");

            if(i%c==0)
                System.out.println();
            i++;
            count++;

        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println();

        int count1 = printRectangle(N,M);
        System.out.println("while loop : " + count1);

        int count2 =  forLoop(N,M);
        System.out.println("for loop : " + count2);
    }
}
