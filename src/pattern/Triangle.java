package pattern;

import java.util.Scanner;

public class Triangle {

    //Print same triangle with two for loop
    public static  int forLoop(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            count++;
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }
        return  count;
    }

    //Print Triangle with single while loop :>) Amazing
    public  static  int printTriangle(int n){
        //count to check time complexity
        int count =0;
        int total = n*n;
        int i=1;
        int t=1;
        int j = n-1;
        while(i<=total){
//            System.out.print(n+ " ");
            System.out.print("* ");

            if(t==i){
                System.out.println();
                t = i+n+1;
                i = i+j;
                j--;
            }

            i++;
            count++;

        }
        return  count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println();

        int count1 =  printTriangle(N);
        System.out.println("while loop : " + count1);

        int count2 =  forLoop(N);
        System.out.println("for loop : " + count2);
    }

}


