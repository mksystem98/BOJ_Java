import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();

        for (int i = 1; i <= repeatCount; i++) {
            int num_A = sc.nextInt();
            int num_B = sc.nextInt();

            System.out.println(num_A + num_B);
        }
    }
}