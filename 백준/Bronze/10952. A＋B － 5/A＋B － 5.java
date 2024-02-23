import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();

            if ((numA == 0) && (numB == 0)) {
                break;
            }

            System.out.println(numA+numB);
        }
    }
}
