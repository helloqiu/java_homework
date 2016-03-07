import java.util.Scanner;

/**
 * Created by helloqiu on 16/3/7.
 * Description: check a point whether is in a rectangle(10,5).
 */
public class MainClass {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y;
        while (true){
            System.out.print("Enter a point with coordinates : ");
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
        if (((x < 5f && x > 0f) || (x > -5f && x < 0f))
                && ((y < 2.5f && y > 0f) || (y > -2.5f && y < 0f))) {
            System.out.println("Point (" + x + " , " + y + ") is in the rectangle");
            return;
        }else {
            System.out.println("Point (" + x + " , " + y + ") is not in the rectangle");
            return;
        }
    }
}
