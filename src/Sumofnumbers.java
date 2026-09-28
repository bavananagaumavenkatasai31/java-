import java.util.Scanner;
public class Sumofnumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter n value");
        int n = sc.nextInt();
        int i = 0;
        while(i < n)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
