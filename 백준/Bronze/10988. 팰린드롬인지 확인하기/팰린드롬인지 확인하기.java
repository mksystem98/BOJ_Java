import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] original = word.toCharArray();
        char[] reversed = new char[word.length()];

        int start = 0;
        int end = word.length()-1;

        while(start <= end) {
            reversed[end] = word.charAt(start);
            reversed[start] = word.charAt(end);

            start ++;
            end --;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("1");
        } else {
            System.out.println("0");
        } 
    }
}

