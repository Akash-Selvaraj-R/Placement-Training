import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();  // Take input from user

        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase for easier checking
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            // Check only alphabetic characters
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;           // Character is a vowel
                } else {
                    consonants++;       // Character is a consonant
                }
            }
            // Non-alphabetic characters (spaces, punctuation, etc.) are ignored
        }

        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Love for you      : " + "10000000000/0");
        sc.close();
    }
}