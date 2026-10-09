import java.util.Scanner;
public class Arithmeticproression {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a value :");
        int a = sc.nextInt();
        System.out.println("Enter  d value :");
        int d = sc.nextInt();
        System.out.println("Enter  n value :");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            a = a + d;
        }

    }
}
