import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int basketCount = sc.nextInt();

        int[][] arr = new int[basketCount][1];

        for (int i = 0; i < basketCount; i++) {
            arr[i][0] = i+1;
        }

        int changeCount = sc.nextInt();

        int tmp = 0;

        for (int i = 0; i < changeCount; i++) {
            int changeArr_1 = sc.nextInt();
            int changeArr_2 = sc.nextInt();

            tmp = arr[changeArr_2-1][0];
            arr[changeArr_2-1][0] = arr[changeArr_1-1][0];
            arr[changeArr_1-1][0] = tmp;
        }

        for (int i = 0; i < basketCount; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
