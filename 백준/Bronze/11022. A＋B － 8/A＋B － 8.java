import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();

    for (int i=1; i<=count; i++) {
      int numA = sc.nextInt();
      int numB = sc.nextInt();
      System.out.printf("Case #%d: %d + %d = %d\n", i, numA, numB, numA+numB);
    }
  }

  
}