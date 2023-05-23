package controlflowstatement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
//       int n =6;
//        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=s.nextInt();
        switch (n){

           case 1:
               System.out.println("1");
               break;
           case  2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;

           case  4:
               System.out.println("4");
               break;
           default:
               System.out.println("no case");
       }

    }
}
