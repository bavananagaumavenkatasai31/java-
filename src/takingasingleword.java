import java.util.Scanner;
public class takingasingleword {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = sc.next();

        System.out.println("Hello " + name);
        System.out.print("Enter your name: ");

        String name1 = sc.next();

        System.out.println("Hello " + name1);
    }
}
