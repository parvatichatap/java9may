package basic;

/** Types of variable
 * 1.Local variable -->variables declared inside method body.
 * 2.instance variable -->variables declared inside class but outside method body.
 * 3.static variable -->cannot be local,share among all the instance of class,memory allocation
 * happens only once when the class loaded in memory.
 */
public class Variables {
    int n=50; //instance variable
    int n1=10; //instance variable
    static int s=7; //static variable

    public static void main(String[] args) {

//        Static int x; //compile time error
        int a=5; //local variable
        int n=10; //local variable
        System.out.println(n);
        System.out.println(s);
    }

}
