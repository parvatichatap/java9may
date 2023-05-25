package controlflowstatement;

import java.util.Scanner;

public class ForLoopSumDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++){
            sum=+i;
        }
        System.out.println("Sum " + sum);
    }
}
