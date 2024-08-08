import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int find_Number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find_Number) {
                count ++;
            }
        }

        System.out.println(count);
    }
}