import java.util.*;
public class Multiplicationtable {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            int z = n * i;
            System.out.println(z);
        }

    }
}
