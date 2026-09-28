import java.util.Scanner;
public class continuestatement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n values:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if( i <= n)
            {
                System.out.println(i);
            }
        }
          sc.close();
    }
}

