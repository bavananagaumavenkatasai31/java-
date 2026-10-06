import java.util.Scanner;
public class RightRotateArraybyK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Numbers :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k Elements :");
        int k =sc.nextInt();
        for(int r =0;r<k;r++)
        {
            int first = arr[0];
            for(int i=0;i<n-1;i++)
            {
                arr[i] =arr[i + 1];
            }
            arr[n-1] = first;

        }
        System.out.println("Array after left rotataion");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + "");
        }

    }
}
