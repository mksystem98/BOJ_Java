import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 첫 번째 입력값을 기준을 배열의 길이로 삼아 배열을 생성함.
        int arr_length = scanner.nextInt();

        int[] basket = new int[arr_length];

        // 총 몇 번 공을 넣을 것인지 입력값을 받는다.
        int ballCount = scanner.nextInt();

        // 몇번 바구니부터 몇번 바구니까지 몇번 번호가 적인 공을 넣은 것인지 입력받음.

        for (int i = 0; i < ballCount; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int ballNumber = scanner.nextInt();

            for (int j = 0; j < to-from+1; j++) {
                basket[j+from-1] = ballNumber;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i]);
            if (i < basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
