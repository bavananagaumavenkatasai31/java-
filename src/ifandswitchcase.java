import java.util.Scanner;
public class ifandswitchcase {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Java");
                break;

            case 2:
                System.out.println("Python");
                break;

            case 3:
                System.out.println("SQL");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}