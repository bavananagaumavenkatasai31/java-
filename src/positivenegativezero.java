import java.util.Scanner;
public class positivenegativezero {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if( n > 0)
        {
            System.out.println("positive number");
        }
        else if(n < 0)
        {
            System.out.println("Negative number");

        }
        else {
            System.out.println("  zero number");

        }
    }
}
