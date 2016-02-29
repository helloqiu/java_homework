import java.util.Scanner;

/**
 * Created by helloqiu on 16/2/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            System.out.print("Enter a number between 0 and 1000: ");
            num = scanner.nextInt();
            if (num <= 1000 && num >= 0) {
                break;
            }
            System.out.println("The number is invalid.Please tye again.");
        }
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
