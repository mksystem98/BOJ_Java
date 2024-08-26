import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String word = next.toUpperCase();

        int[] count = new int[26];
        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A'+i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (arr[i] == word.charAt(j)) {
                    count[i]++;
                }
            }
        }

        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }

        int isDuplicate = 0;
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                isDuplicate++;
            }
        }

        if (isDuplicate > 1) {
            System.out.println("?");
        } else {
            System.out.println(arr[maxIndex]);
        }

    }
}
