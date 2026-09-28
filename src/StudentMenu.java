import java.util.Scanner;

public class StudentMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Adding student...");
                break;

            case 2:
                System.out.println("Viewing student...");
                break;

            case 3:
                System.out.println("Updating student...");
                break;

            case 4:
                System.out.println("Deleting student...");
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}