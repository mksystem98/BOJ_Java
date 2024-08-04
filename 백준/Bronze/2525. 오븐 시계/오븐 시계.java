import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();

        int totalEndMinutes = (hour*60) + minute + time;

        if (totalEndMinutes >= 1440) {
            totalEndMinutes -= 1440;
        }

        System.out.println( (totalEndMinutes/60) + " " + (totalEndMinutes%60) );
    }
}