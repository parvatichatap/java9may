package controlflowstatement;

public class DivisibleDemo {
    public static void main(String[] args) {


        int n = 15;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n  + "is Divisible by both");
        }
        else if (n % 3 == 0) {
            System.out.println( n + "is Divisible by 3 only");
        } else if ( n % 5 == 0) {
            System.out.println(n + "is Divisible by 5 only");

        }
    }
}
