import java.util.Scanner;

/**
 * Created by helloqiu on 16/3/7.
 * Description: Calculate the day of the week.
 */
public class MainClass {
    static public void main(String[] args) {
        int year,month,day;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter year: (e.g. , 2008): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            year = scanner.nextInt();
            System.out.print("Enter month: 1-12: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            month = scanner.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            System.out.print("Enter the day of the month: 1-31: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            day = scanner.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Error! Please check your enter!");
                continue;
            }
            break;
        }
        DayWorker dayWorker = new DayWorker(year,month,day);
        switch (dayWorker.work()) {
            case 0:
                System.out.println("Day of the week is Saturday");
                return;
            case 1:
                System.out.println("Day of the week is Sunday");
                return;
            case 2:
                System.out.println("Day of the week is Monday");
                return;
            case 3:
                System.out.println("Day of the week is Tuesday");
                return;
            case 4:
                System.out.println("Day of the week is Wednesday");
                return;
            case 5:
                System.out.println("Day of the week is Thursday");
                return;
            case 6:
                System.out.println("Day of the week is Friday");
                return;
        }
    }
}
