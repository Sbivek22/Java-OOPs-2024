import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse characters in each word and construct the modified sentence
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            modifiedSentence.append(reversedWord).append(" ");
        }

        // Remove the extra space at the end and print the modified sentence
        System.out.println("Modified sentence: " + modifiedSentence.toString().trim());

        scanner.close();
    }
}
