package controlflowstatement;

import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num =sc.nextInt();

        if (num%2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }



    }
}
