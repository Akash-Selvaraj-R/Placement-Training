import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if the popped opening bracket matches the current closing one
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
            // Ignore other characters (optional, depending on requirements)
        }

        // Balanced only if stack is empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));    // true
        System.out.println(isBalanced("([)]"));      // false
        System.out.println(isBalanced("((()))"));    // true
        System.out.println(isBalanced("") );         // true (empty string is balanced)
        System.out.println(isBalanced("{(])"));      // false
    }
}