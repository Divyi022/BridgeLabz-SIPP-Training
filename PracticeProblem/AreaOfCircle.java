import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        
        int area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        
        scanner.close();
    }
}
