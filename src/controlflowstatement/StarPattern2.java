package controlflowstatement;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no you want ");
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}



