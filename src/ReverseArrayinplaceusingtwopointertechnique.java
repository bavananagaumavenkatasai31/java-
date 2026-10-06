import java.util.Scanner;
public class ReverseArrayinplaceusingtwopointertechnique {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers :");
    int n = sc.nextInt();
    int left = 0;
    int right = n-1;
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    while(left < right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i] +"");
    }
  }
}
