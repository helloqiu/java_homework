import java.util.Scanner;

/**
 * Created by helloqiu on 16/3/7.
 * Description: Test num.
 */
public class MainClass {
    static public void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter an integer : ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            num = scanner.nextInt();
            break;
        }
        NumberChecker numberChecker = new NumberChecker(num);
        switch (numberChecker.check()) {
            case 0:
                System.out.println(num + " is divisible by both 5 and 6");
                return;
            case 1:
                System.out.println(num + " is divisible by 5 or 6, but not both");
                return;
            case 2:
                System.out.println(num + " is not divisible by either 5 or 6");
                return;
        }
    }
}
