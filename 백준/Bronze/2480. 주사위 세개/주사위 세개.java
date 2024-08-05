
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first_dice = scanner.nextInt();
        int second_dice = scanner.nextInt();
        int third_dice = scanner.nextInt();

        int price = 0;

        if ( first_dice == second_dice && first_dice == third_dice) {
            price = 10000 + (first_dice)*1000;
        }

        if ( ((first_dice == second_dice) && (first_dice != third_dice)) ) {
            price = 1000 + first_dice*100;
        }

        if ((first_dice == third_dice) && (first_dice != second_dice)) {
            price = 1000 + first_dice*100;
        }

        if ((second_dice == third_dice) && (first_dice != second_dice)) {
            price = 1000 + second_dice*100;
        }

        if ((first_dice != second_dice) && (first_dice != third_dice) && (second_dice != third_dice)) {
            if ( (first_dice > second_dice) && (first_dice > third_dice)) {
                price = first_dice*100;
            }
            if ( (second_dice > first_dice) && (second_dice > third_dice)) {
                price = second_dice*100;
            }
            if ( (third_dice > first_dice) && (third_dice > second_dice)) {
                price = third_dice*100;
            }
        }

        System.out.println(price);
    }
}
