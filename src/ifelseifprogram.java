import java.util.Scanner;

public class ifelseifprogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Distinction");
        }
        else if (marks >= 60) {
            System.out.println("First Class");
        }
        else if (marks >= 50) {
            System.out.println("Second Class");
        }
        else if (marks >= 40) {
            System.out.println("Third Class");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}