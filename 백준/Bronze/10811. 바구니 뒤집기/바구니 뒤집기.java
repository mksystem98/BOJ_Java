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
            int start = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;

            while (start < end) {
             int tmp = basket[end];
             basket[end] = basket[start];
             basket[start] = tmp;
             start++;
             end--;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
