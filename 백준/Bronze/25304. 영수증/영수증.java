import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total_Price = scanner.nextInt();
        int total_Item = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= total_Item; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();

            sum += price*quantity;
        }

        if (sum == total_Price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}