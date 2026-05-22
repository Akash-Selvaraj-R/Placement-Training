import java.util.*;

public class UniqueWordsInParagraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Split the paragraph into words using non-word characters as delimiters
        // This removes punctuation and handles multiple spaces, commas, etc.
        String[] words = paragraph.split("\\W+");

        // Use TreeSet to store unique words and automatically sort them alphabetically
        Set<String> uniqueWords = new TreeSet<>();

        // Add each word (convert to lowercase to make comparison case-insensitive)
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word.toLowerCase());
            }
        }

        // Display the result
        System.out.println("\nUnique words in alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Optional: Show count
        System.out.println("\nTotal unique words: " + uniqueWords.size());

        sc.close();
    }
}