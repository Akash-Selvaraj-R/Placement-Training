public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
/* 
// Output
// Palindrom

// Time Complexity: O(n)
// Space Complexity: O(1)


explaination line by line
In this program, we first create a string variable str and assign it the value "madam". 
We then create a new string variable rev and initialize it to an empty string.
We then use a for loop to iterate through the characters of the string str in reverse order. 
We then compare the original string str with the reversed string rev using the equals() method. 
If they are equal, we print "Palindrome", otherwise we print "Not Palindrome"

*/