// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던지는 게임
// 같은 눈이 3개 나오면 10,000원 + (같은 눈)x1,000원 의 상금
// 같은 눈이 2개 나오면 1,000원 + (같은 눈)x100원 의 상금
// 모두 다른 눈이 나오는 경우 (가장 큰 눈)x100원 의 상금

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first_dice = sc.nextInt();
        int second_dice = sc.nextInt();
        int third_dice = sc.nextInt();


        if ( (first_dice == second_dice) && (first_dice == third_dice) ) {
            System.out.println(10000 + (first_dice)*1000);
        }

        if ((first_dice == second_dice) && (first_dice != third_dice)) {
            System.out.println(1000 + (first_dice)*100);
        }
        if ((first_dice == third_dice) && (first_dice != second_dice)) {
            System.out.println(1000 + (first_dice)*100);
        }
        if ((second_dice == third_dice) && (first_dice != second_dice)) {
            System.out.println(1000 + (second_dice)*100);
        }

        if ( (first_dice != second_dice) && (first_dice != third_dice) && (second_dice!= third_dice)) {
            int biggest_dice = first_dice;
            if (biggest_dice < second_dice) {
                biggest_dice = second_dice;
            }
            if (biggest_dice < third_dice) {
                biggest_dice = third_dice;
            }
            System.out.println(biggest_dice * 100);
        }
    }
}
