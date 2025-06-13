import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        int radius = sc.nextInt();
        
        System.out.print("Enter the height of the cylinder: ");
        int height = sc.nextInt();
        
        int volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
        
        sc.close();
    }
}
