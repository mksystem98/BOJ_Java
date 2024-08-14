import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] arr = word.toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    alphabet[(int)i-97] = (char)j;
                    break;
                }
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
