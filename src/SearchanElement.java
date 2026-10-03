import java.util.*;
public class SearchanElement {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers :");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
       arr [i] = sc.nextInt();

    }
    int target = sc.nextInt();
    boolean found = true;
    for(int i=0;i<n;i++)
    {
        if(arr[i] == target)
        {
            found = true;
            System.out.println("element at found :" + i);
            break;
        }
    }
    if(!found)
    {
        System.out.println("element not found");
    }

}
}
