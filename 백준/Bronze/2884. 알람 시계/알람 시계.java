// 시간을 입력하면 45분을 빠르게 설정하여 출력한다.
// 24시간 표현을 사용한다. (9 25, 23 45)
// 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

// 입력한 시간을 분 단위로 변경하고, 45분을 뺀 다음 시간 분 단위로 변경한다.
// 0시 45분 보다 빠른 시간이면 24시간(1440분)을 더한 후 45분을 뺀다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int totalMinutes = (hour * 60) + minute;
        int minus45Minutes = totalMinutes - 45;

        if (minus45Minutes < 0) {
            minus45Minutes += 1440;
        }

        int finalHour = minus45Minutes / 60;
        int finalMinute = minus45Minutes % 60;

        System.out.println(finalHour + " " + finalMinute);

    }
}


