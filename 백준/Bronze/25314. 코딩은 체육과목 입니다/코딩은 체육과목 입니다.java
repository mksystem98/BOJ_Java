import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int quotient = number/4;

        String str= "";

        for (int i = 1; i <= quotient; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
