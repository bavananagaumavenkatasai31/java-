import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a =sc.nextInt();
        System.out.println("enter b value");
        int b =sc.nextInt();

        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(a+"");
           int  c = a +b;
            a = b;
            b = c;
        }

    }
}
