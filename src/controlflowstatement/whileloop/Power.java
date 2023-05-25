package controlflowstatement.whileloop;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int power=3;

        int res=1;
        while (power >0){
            res=res*n;
            power--;
        }
        System.out.println(res);
    }
}
