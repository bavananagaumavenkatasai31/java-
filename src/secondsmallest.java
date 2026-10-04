import java.util.*;
public class secondsmallest {
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter Numbers :");
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
      int smallest = Integer.MAX_VALUE;
      int secondsmallest = Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
          if(arr[i] < smallest)
          {
              smallest = secondsmallest;
              smallest = arr[i];
          }
          else if(arr[i] < secondsmallest  && smallest != arr[i])
          {
              secondsmallest = arr[i];
          }
      }
      System.out.println(smallest);
      System.out.println(secondsmallest);

    }
}
