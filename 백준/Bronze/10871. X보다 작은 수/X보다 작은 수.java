import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int input_Number = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < input_Number) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
