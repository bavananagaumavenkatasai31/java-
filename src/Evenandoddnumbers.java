import java.util.Scanner;

public class Evenandoddnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int number = sc.nextInt();
        for(int i = 0; i< number;i++) {
            if (number % 2 == 0) {
                System.out.println("even");
                break;
            } else {
                System.out.println("odd");
            }
        }

    }
}

