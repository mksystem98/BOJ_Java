import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String str  = "";
            int num = scanner.nextInt();
            String word = scanner.nextLine();

            for (int k = 0; k < word.length(); k++) {
                str += ("" + word.charAt(k)).repeat(num);
                str = str.trim();
            }
            System.out.println(str);
        }

    }
}
