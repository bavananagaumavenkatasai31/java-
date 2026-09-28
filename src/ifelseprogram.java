import java.util.*;
public class ifelseprogram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if(age > 21)
        {
            System.out.printf("true");
        }
        else {
            System.out.printf("false");
        }
    }
}
