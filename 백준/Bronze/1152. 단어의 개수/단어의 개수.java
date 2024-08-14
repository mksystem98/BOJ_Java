import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        if (str.charAt(str.length() - 1) != ' ') {
            str += " ";
        }
        if (str.charAt(0) == ' ') {
            str = 'Z' + str.substring(1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
