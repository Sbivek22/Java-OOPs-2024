// Main class
public class Daimond
{

    // Main driver method
    public static void main(String[] args)
    {
 
        // Declaring and initializing variables
 
        // Variable initialized to the row where max star
        // give diamond pattern
        int number = 4;
 
        int a, b;
 
        // Outer loop 1
        // prints the first half diamond
        for (a = 1; a <= number; a++) {
 
            // Inner loop 1 print whitespaces inbetween
            for (b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 prints star
            for (b = 1; b <= a * 2 - 1; b++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
 
        // Outer loop 2
        // Prints the second half diamond
        for (a = number - 1; a > 0; a--) {
 
            // Inner loop 1 print whitespaces inbetween
            for (b = 1; b <= number - a; b++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 print star
            for (b = 1; b <= a * 2 - 1; b++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
    }
}