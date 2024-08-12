import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            int score = scanner.nextInt();
            arr[i] = score;
        }
        Arrays.sort(arr);
        int maxScore = arr[arr.length-1];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += (arr[i]/(double)maxScore) * 100;
        }

        double average = total/arr.length;
        System.out.println(average);
    }
}
