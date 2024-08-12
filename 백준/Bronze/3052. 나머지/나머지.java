import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();

            boolean hasEqualNumber = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num % 42) {
                    hasEqualNumber = true;
                }
            }

            if (hasEqualNumber == false) {
                arr[i] = num % 42;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
