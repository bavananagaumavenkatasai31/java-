import java.util.Scanner;
public class maximumofarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();

        int max =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if( max < arr[i] )
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
