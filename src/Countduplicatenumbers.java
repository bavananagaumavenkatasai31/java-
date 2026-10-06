
import java.util.*;

public class Countduplicatenumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicateCount = 0;

        for (int i = 0; i < n; i++) {

            boolean alreadyChecked = false;

            // Check if this number appeared before
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Check if this number appears again
            boolean duplicate = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                duplicateCount++;
            }
        }

        System.out.println("Duplicate elements = " + duplicateCount);
    }
}
