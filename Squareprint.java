import java.util.Scanner;

public class Squareprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the square's side: ");
        int sideLength = scanner.nextInt();
        
        // Calculate perimeter
        int perimeter = 4 * sideLength;
        
        // Calculate area
        int area = sideLength * sideLength;
        
        // Print results
        System.out.println("Square's Perimeter: " + perimeter);
        System.out.println("Square's Area: " + area);
        
        scanner.close();
    }
}
