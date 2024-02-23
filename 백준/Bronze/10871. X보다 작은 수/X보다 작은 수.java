import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int compareNumber = sc.nextInt();

        int arr[] = new int[arrLength];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int lessCount = 0;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < compareNumber) {
                lessCount++;
               }
        }

        int lessArr[] = new int[lessCount];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < compareNumber) {
                lessArr[index++] = arr[i];
            }
        }

        for (int i = 0; i < lessArr.length; i++) {
            System.out.print(lessArr[i] + " ");
        }

    }
}
