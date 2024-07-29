import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if( (-10000 <= numA && numA <=10000) && (-10000 <= numB && numB <=10000) ) {
            if (numA < numB) {
                System.out.println("<");
            }
            if (numA > numB) {
                System.out.println(">");
            }
            if (numA == numB) {
                System.out.println("==");
            }
        }
    }
}