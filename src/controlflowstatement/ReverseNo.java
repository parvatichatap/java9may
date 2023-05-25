package controlflowstatement;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int no = sc.nextInt();
        for (int i=no;i>0;i--){
            System.out.println(i);
        }
    }
}
