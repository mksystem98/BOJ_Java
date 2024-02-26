import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrCount = sc.nextInt();
        int M = sc.nextInt();

        int [][]arr = new int[arrCount][1];


        for (int i = 0; i < M; i++) {
            int first = sc.nextInt();
            int last = sc.nextInt();
            int ballNumber = sc.nextInt();

            for (int j=first-1; j<=last-1; j++) {
                arr[j][0] = ballNumber;
            }
        }

        for (int i = 0; i < arrCount; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
