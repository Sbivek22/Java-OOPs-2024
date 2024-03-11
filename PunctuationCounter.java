import java.util.HashMap;
import java.util.Map;

public class PunctuationCounter {
    public static void main(String[] args) {
        String poem = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n"
                + "-that was a nice poem-\n"
                + "the end.";

        // Create a map to store the count of each punctuation mark
        Map<Character, Integer> punctuationCount = new HashMap<>();

        // Iterate through each character in the poem
        for (char c : poem.toCharArray()) {
            // Check if the character is a punctuation mark
            if (Character.isLetterOrDigit(c)) {
                continue; // Skip letters and digits
            }

            // Increment the count for this punctuation mark
            punctuationCount.put(c, punctuationCount.getOrDefault(c, 0) + 1);
        }

        // Print the table
        System.out.println("Punctuation Marks Counts:");
        System.out.println("------------------------");
        for (Map.Entry<Character, Integer> entry : punctuationCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
