package basic;

public class MathOperation {


    public static void main(String[] args) {
        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        System.out.println("X :" +x);
        System.out.println("Y :" +y);

        System.out.println("msg" +args[2]);



        int res =0;
        res=x+y;
        System.out.println( "Addition :- " + res);
        res=x-y;
        System.out.println( "subtraction :-" + res);
        res=x*y;
        System.out.println( "multiplication :-" + res);
        res=x/y;
        System.out.println( "division  :-" + res);
        res=x%y;
        System.out.println( "mod :- " + res);

    }
}
