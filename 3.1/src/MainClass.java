import java.util.Scanner;

/**
 * Created by helloqiu on 16/3/7.
 * Description: Solve equation.
 */
public class MainClass {
    static public void main(String[] args) {
        float a;
        float b;
        float c;
        while (true){
            System.out.print("Enter a. b, c: ");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextFloat()){
                System.out.println("Error! Please check your enter!");
                continue;
            }
            a = scanner.nextFloat();
            if (!scanner.hasNextFloat()){
                System.out.println("Error! Please check your enter!");
                continue;
            }
            b = scanner.nextFloat();
            if (!scanner.hasNextFloat()){
                System.out.println("Error! Please check your enter!");
                continue;
            }
            c = scanner.nextFloat();
            break;
        }
        CalculateWorker calculateWorker = new CalculateWorker(a , b , c);
        try {
            calculateWorker.calculate();
        }catch (Exception e) {
            System.out.println("The equation has no real roots.");
        }
    }
}
