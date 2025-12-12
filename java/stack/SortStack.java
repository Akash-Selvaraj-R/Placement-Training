import java.util.Stack;
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        System.out.println("orginal: " + input);
        sortStack(input);
        System.out.println("sorted: " + input);
    }
    public static void sortStack(Stack<Integer> input) {
        Stack<Integer> s = new Stack<>(); 
        while (!input.isEmpty()) {
            int current = input.pop();
            while (!s.isEmpty() && s.peek() > current) {
                input.push(s.pop());
            }
            s.push(current);
        }
        while (!s.isEmpty()) {
            input.push(s.pop());
        }
    }
}
 