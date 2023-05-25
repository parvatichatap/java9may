package controlflowstatement;

public class Swapno {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp =a;
        System.out.println("Before swapping a="+a+"b="+b);
        a=b;
        b=temp;
        System.out.println("After swapping a="+a+"b="+b);

    }

}
