import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        int maxIndex = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i+1;
            }
        }
        if (maxIndex == 0) {
            maxIndex = 1;
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
