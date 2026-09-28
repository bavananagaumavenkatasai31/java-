import java.util.Scanner;

public class checkequalarrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter 1st array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 2nd array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        boolean equal = true;

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Equal arrays");
        } else {
            System.out.println("Not equal arrays");
        }

        sc.close();
    }
}