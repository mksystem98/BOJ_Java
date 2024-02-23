import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];

        for (int i=0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int searchNumber = sc.nextInt();

        for (int i=0; i < arrLength; i++) {
            if (searchNumber == arr[i]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
