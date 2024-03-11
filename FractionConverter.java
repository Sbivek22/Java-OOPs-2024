import java.util.Scanner;

public class FractionConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        // Check if the denominator is zero
        if (denominator == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            return;
        }
        
        // Calculate the decimal equivalent
        double decimalEquivalent = (double) numerator / denominator;
        
        // Print the result
        System.out.println("Decimal equivalent: " + decimalEquivalent);
        
        scanner.close();
    }
}
