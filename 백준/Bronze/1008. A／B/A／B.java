import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        double sum = (double)numA / numB;
        System.out.println(sum);
    }
}
