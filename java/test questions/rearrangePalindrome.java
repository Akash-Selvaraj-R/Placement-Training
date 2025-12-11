import java.util.*;

public class rearrangePalindrome {
    public static String canFormPalindrome(String s) {

        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }
        
        return (oddCount <= 1) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(canFormPalindrome(s));
        
        sc.close();
    }
}