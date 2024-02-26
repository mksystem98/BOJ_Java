import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();

        int arr[] = new int[arrLength];

        for (int i=0; i<arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 1000000;
        int max = -1000000;
        for (int i=0; i<arrLength; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
