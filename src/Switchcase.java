import java.util.*;
public class Switchcase {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
       int number = sc.nextInt();
       switch(number)
       {
           case 1 :
               System.out.println("Monday");
                    break;
           case 2 :
               System.out.println("Tuesday");
               break;
           case 3 :
               System.out.println("wednesday");
               break;
           case 4 :
               System.out.println("Thursday");
               break;
           case 5 :
               System.out.println("friay");
               break;
           case 6 :
               System.out.println("saturday");
               break;
           case 7 :
               System.out.println("Sunday");
               break;
           case 8 :
               System.out.println("exit");
               break;
       }
    }
}
