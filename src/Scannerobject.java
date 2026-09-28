import java.util.Scanner;
public class Scannerobject {
    public static void main(String[] args)
    {
        Scanner  sc =new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();
        System.out.println("age :" + age);
        System.out.print("Enter CGPA: ");

        double cgpa = sc.nextDouble();

        System.out.println("CGPA = " + cgpa);
        float  price = sc.nextFloat();
        System.out.println("price :" + price);
        long population = sc.nextLong();
        System.out.println("population:" + population);


        sc.close();
    }
}
