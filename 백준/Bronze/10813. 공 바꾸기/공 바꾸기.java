import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalBasket = scanner.nextInt();

        int[] basket = new int[totalBasket];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }

        int changeCount = scanner.nextInt();

        for (int i = 0; i < changeCount; i++) {
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();

            int tmp = 0;

            tmp = basket[index2-1];
            basket[index2-1] = basket[index1-1];
            basket[index1-1] = tmp;
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
