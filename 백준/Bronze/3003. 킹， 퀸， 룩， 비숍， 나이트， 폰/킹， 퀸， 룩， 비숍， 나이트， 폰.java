import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] pieces = {1, 1, 2, 2, 2, 8} ;
        int[] inputPieces = new int[6];
        int[] outputPieces = new int[6];

        for (int i = 0; i < inputPieces.length; i++) {
            inputPieces[i] = scanner.nextInt();
        }

        for (int i = 0; i < outputPieces.length; i++) {
            outputPieces[i] = (pieces[i] - inputPieces[i]);
        }

        for (int i = 0; i < outputPieces.length; i++) {
            System.out.print(outputPieces[i] + " ");
        }


    }
}
