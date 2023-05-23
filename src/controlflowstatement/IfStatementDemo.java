package controlflowstatement;

public class IfStatementDemo {
    public static void main(String[] args) {

        int x=10;
        int y = 15;
        if (x < y){
            System.out.println("Y is greater");

            //if else

            if (x>y)
            {
                System.out.println("X is greater");
            }
            else {
                System.out.println("Y is greater");
            }
        }

        //if else -if-ladder
        String city ="pune";
        if (city.equals("pune"))
        System.out.println("you are in pune");
else  if(city.equals("Mumbaii")){
            System.out.println("ypu are in mumbaii");

        }
else {
            System.out.println("you are in latur");
        }
//nested if

        String state ="maharashtra";
if(state.equals("maharashtra")){
    if (city.equals("pume")){
        System.out.println("you are from maharashtra");
    }
    else {
        System.out.println("you are in up");
    }
}
    }
}
