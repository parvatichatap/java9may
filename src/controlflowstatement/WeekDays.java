package controlflowstatement;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any week days");
        String weekday =sc.next();

        switch (weekday){
            case "mon":
                System.out.println("Today is monday");
                break;
            case "TUES" :
                System.out.println("Today is Tuesday");
                break;
            case "Wed" :
                System.out.println("Today is Wednesday");
                break;
            case "Thur" :
                System.out.println("Today is Thursday");
                break;
            case "Fri" :
                System.out.println("Today is Friday");
                break;
            case "Sat" :
                System.out.println("Today is Saturday");
                break;
            case "sun" :
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Wrong choice");



        }
    }
}
