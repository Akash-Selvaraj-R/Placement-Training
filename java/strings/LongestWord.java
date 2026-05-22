/* 
find out the longest word in a string and get string from user and print the longest word in java

*/
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is " + longestWord);
    }
}