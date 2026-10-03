import java.util.*;
public class evenoroddnumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
        int even = 0;
        int odd =0;
        if( n % 2 == 0 )
        {
            even++;
        }
        else{
            odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
