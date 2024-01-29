
// '시간 분' 형식의 시각을 입력하고, 분 단위로 변경한다.
// 필요한 시간을 '분' 단위로 입력한다.
// 처음에 입력한 시간에 필요한 시간을 더하여 출력한다.
// 24시간이 넘어가면 다음 날이 되도록 한다. (1440분을 뺀다.)
// 더한 시간을 '시간 분' 형식으로 변경하여 출력한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int requestMinute = sc.nextInt();

        int time_To_Minutes = (hour * 60) + minute;
        int totalMinutes = time_To_Minutes + requestMinute;

        if (totalMinutes >= 1440) {
            totalMinutes -= 1440;
        }

        int finalHour = totalMinutes / 60;
        int finalMinute = totalMinutes % 60;

        System.out.println(finalHour + " " + finalMinute);

    }
}



