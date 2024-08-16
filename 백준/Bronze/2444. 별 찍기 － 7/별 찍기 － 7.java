import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = i; j < count-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i*2+3; j < count*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
