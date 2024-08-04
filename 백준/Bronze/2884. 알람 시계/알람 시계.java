import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int totalMinutes = (hour*60) + minute;

        if (totalMinutes < 45) {
            totalMinutes += 1440;
            totalMinutes -= 45;
        } else {
            totalMinutes -= 45;
        }

        hour = totalMinutes / 60;
        minute = totalMinutes % 60;

        System.out.println(hour + " " + minute);
    }
}