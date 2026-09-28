import java.util.*;
public class Nestedif {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if(age > 18)
        {
            if(age > 21)
            {
                System.out.println("eligible for marraige for men");
            }
            else if(age > 18)
            {
                System.out.println("eligible for marraige for women");
            }
        }
        else {
            System.out.println(" not eligible ");
        }
        sc.close();
    }

}
