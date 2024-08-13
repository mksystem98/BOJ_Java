import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        char[] array = word.toCharArray();

        System.out.println((int)array[0]);
    }
}
