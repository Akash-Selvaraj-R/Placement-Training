public class StringComparisonDemo {
    public static void main(String[] args) {
        
        String s1 = "hello";           // Both s1 and s2 refer to the same object in String pool
        String s2 = "hello";
        
        // This creates a new String object on the heap (not from string pool)
        String s3 = new String("hello");

        // Using == (reference comparison)
        System.out.println("s1 == s2 : " + (s1 == s2));     // true  → same reference (string pool)
        System.out.println("s1 == s3 : " + (s1 == s3));     // false → different objects

        // Using .equals() (content comparison)
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true  → same content
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true  → same content

        // Bonus: Interned version of s3
        String s4 = s3.intern();
        System.out.println("s1 == s4 (after intern): " + (s1 == s4)); // true → now points to pool
    }
}