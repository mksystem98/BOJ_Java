import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String number = scanner.next();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
