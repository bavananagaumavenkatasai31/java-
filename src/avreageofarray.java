import java.util.Scanner;
public class avreageofarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        int avg = 0;
        int sum = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        avg = sum / n;
        System.out.println(avg);
    }
}
