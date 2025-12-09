public class StringMethods {
    
    public static void main(String[] args) {
        String str1 = new String("String Example");
        
        String str2 = toUpperCase(str1);
        String str3 = toLowerCase(str1);
        String str4 = str1.replace("g", "c");           // built-in works fine
        String str5 = str1.substring(1, 3);             // built-in works fine
        String str6 = replaceAll(str1, "String", "String Example");
        String str8 = insert(str1, "H", 1);
        String str7 = charAt(str1, 1);                  // returns char, but we convert to String for printing
        String str9 = indexOf(str1, "g");
        String str10 = String.valueOf(length(str1));    // length returns int → convert to String
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str8);
        System.out.println(str7);
        System.out.println(str9);
        System.out.println(str10);
    }

    // 1. Custom toUpperCase
    public static String toUpperCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // 2. Custom toLowerCase
    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // 3. Custom replaceAll (replaces all occurrences of substring)
    public static String replaceAll(String original, String target, String replacement) {
        return original.replace(target, replacement); // using built-in for simplicity
        // You could implement it manually with loops if required by the exercise
    }

    // 4. Insert a string at a specific position
    public static String insert(String original, String toInsert, int position) {
        if (position < 0) position = 0;
        if (position > original.length()) position = original.length();
        
        return original.substring(0, position) + toInsert + original.substring(position);
    }

    // 5. Custom charAt (returns String instead of char so we can assign to String variable)
    public static String charAt(String s, int index) {
        if (index < 0 || index >= s.length()) {
            return "Index out of bounds";
        }
        return String.valueOf(s.charAt(index));
    }

    // 6. Custom indexOf for a substring
    public static String indexOf(String s, String target) {
        int index = s.indexOf(target);
        return (index != -1) ? String.valueOf(index) : "Not found";
    }

    // 7. Custom length
    public static int length(String s) {
        return s.length();
    }
}