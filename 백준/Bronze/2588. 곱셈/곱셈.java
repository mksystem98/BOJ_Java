import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        int one_digit = numA * (numB % 10);
        int ten_digit = numA * (numB % 100 / 10);
        int hundred_digit = numA * (numB / 100);
        System.out.println(one_digit);
        System.out.println(ten_digit);
        System.out.println(hundred_digit);
        System.out.println( numA * numB);
    }
}