import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
