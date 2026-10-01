import java.util.Scanner;
public class MenuExamplefordowhile {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("1. Add Student");
                System.out.println("2. View Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Add Student");
                        break;

                    case 2:
                        System.out.println("View Student");
                        break;

                    case 3:
                        System.out.println("Delete Student");
                        break;

                    case 4:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);

        }
    }
