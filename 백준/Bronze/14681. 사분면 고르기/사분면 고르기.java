//예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

// 1사분면: x - 양수, y - 양수
// 2사분면: x - 음수, y - 양수
// 3사분면: x - 음수, y - 음수
// 4사분면: x - 양수, y - 음수
// '0'은 입력하지 않는 것으로 한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_A = sc.nextInt();
        int number_B = sc.nextInt();

        if (number_A > 0 && number_B > 0) {
            System.out.println("1");
        }

        if (number_A < 0 && number_B > 0) {
            System.out.println("2");
        }

        if (number_A < 0 && number_B < 0) {
            System.out.println("3");
        }

        if (number_A > 0 && number_B < 0) {
            System.out.println("4");
        }


    }
}
