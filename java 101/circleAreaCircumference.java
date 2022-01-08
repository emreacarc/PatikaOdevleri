import java.util.Scanner;

public class circleAreaCircumference {
    public static void main(String[] args) {
        double radius, area, circum, pinum=3.1416;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();
        area = pinum * radius * radius;
        circum = 2 * pinum * radius;
        System.out.println("Area of the circle with given radius: " + area);
        System.out.println("Circumference of the circle with given radius: " + circum);
    }
}
