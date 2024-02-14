import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int categoryCount = sc.nextInt();
        int calculatedTotal = 0;

        for (int i = 1; i <= categoryCount; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            calculatedTotal += (price * count);
        }

        if (totalPrice == calculatedTotal) {
            System.out.println("Yes");
        }

        if (totalPrice != calculatedTotal) {
            System.out.println("No");
        }

    }
}
