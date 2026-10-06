import java.util.*;
public class Differencewithmaxandmin {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int diff =0;
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        if( arr[i] > max)
        {
            max = arr[i];
        }
        if(arr[i] < min)
        {
            min = arr[i];
        }

         diff  = max -min;

        }
    System.out.println(diff);
    }
}

