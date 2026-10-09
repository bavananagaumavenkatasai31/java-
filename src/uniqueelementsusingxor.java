import java.util.Scanner;
public class uniqueelementsusingxor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int unique = 0;
        for(int i=0;i<n;i++)
        {
            unique = unique ^ arr[i];
        }
        System.out.println(unique);
    }
}
