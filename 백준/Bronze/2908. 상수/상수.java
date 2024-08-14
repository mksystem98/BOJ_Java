import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String number2 = scanner.next();

        StringBuilder sb = new StringBuilder(number);
        StringBuilder sb2 = new StringBuilder(number2);

        int reversed = Integer.parseInt(sb.reverse().toString());
        int reversed2 = Integer.parseInt(sb2.reverse().toString());

        if (reversed > reversed2) {
            System.out.println(reversed);
        } else {
            System.out.println(reversed2);
        }
    }
}
