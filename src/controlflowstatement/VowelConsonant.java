package controlflowstatement;

import java.util.Scanner;

public class VowelConsonant {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter any letter");
//        char c =sc.next().charAt(0);
//
//        if (c == 'a' || c=='e'|| c=='i' || c=='o' || c== 'u') {
//            System.out.println(c +  "  :- is vowel");
//        }
//            else
//            {
//                System.out.println(c  + "  :-is consonant");
//            }
//
//    }

    public static void main(String[] args) {
//        char ch = 'a'; // character to check
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any letter");
        char c =sc.next().charAt(0);
//
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is  vowel.");
                break;
            default:
                System.out.println(c + " is  consonant.");
        }

    }
}



