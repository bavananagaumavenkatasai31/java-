import java.util.*;
public class mISSINGNUMBER {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int  expectedsum = n *(n+1) /2;
        for(int i=0;i<n-1;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum =0;

        for(int i=0;i<n-1;i++)
        {
            sum = sum + arr[i];
        }
         int missing = expectedsum - sum;
        System.out.println(missing);
    }
}



