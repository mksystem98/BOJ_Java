import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] basket = new int[length];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int tmp = 0;
            int dif = end-start;

            for (int j = 0; j < (dif+1)/2; j++) {
                tmp = basket[end-1-j];
                basket[end-1-j] = basket[start-1+j];
                basket[start-1+j] = tmp;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
