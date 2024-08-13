import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String word = scanner.next();
            System.out.print("" + word.charAt(0) + word.charAt(word.length()-1) + "\n");
        }
    }
}
