import java.util.Scanner;

/**
 * Created by helloqiu on 16/2/29.
 */
public class Main {
    public static void main(String args[]) {
        System.out.print("Enter the radius and length of a cylinder:");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        float height = scanner.nextFloat();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The area is " + cylinder.getArea());
        System.out.println("The volume is " + cylinder.getVolume());
    }
}
