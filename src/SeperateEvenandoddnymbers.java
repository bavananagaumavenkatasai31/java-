import java.util.Scanner;
public class SeperateEvenandoddnymbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int result[]  = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int index =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 ==0)
            {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 != 0)
            {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(result[i] + " ");
        }
    }
}
