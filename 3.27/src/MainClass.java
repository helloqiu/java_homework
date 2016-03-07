import java.util.Scanner;

/**
 * Created by helloqiu on 16/3/7.
 */
public class MainClass {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y;
        while (true) {
            System.out.print("Enter a point's x- and y-coordinates: ");
            if (!scanner.hasNextFloat()) {
                System.out.println("Error!Please check enter!");
                continue;
            }
            x = scanner.nextFloat();
            if (!scanner.hasNextFloat()) {
                System.out.println("Error!Please check enter!");
                continue;
            }
            y = scanner.nextFloat();
            break;
        }
        float tmp = 100.f - x * 0.5f;
        if (y < tmp && y > 0) {
            System.out.println("The point is in the triangle.");
            return;
        }else {
            System.out.println("The point is not in the triangle.");
            return;
        }
    }
}
