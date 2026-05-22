import java.util.Stack;

public class Brwser {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    // Constructor
    public Brwser(String homepage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = homepage;
    }

    // Visit a new webpage
    public void visit(String url) {
        backStack.push(currentPage);     // move current to back history
        currentPage = url;               // update new page
        forwardStack.clear();            // clear forward history
    }

    // Go back to the previous webpage
    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);      // move current to forward stack
            currentPage = backStack.pop();      // pop from back stack
        } else {
            System.out.println("No previous page available.");
        }
    }

    // Optional: You can also add a forward() method if needed
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        } else {
            System.out.println("No next page available.");
        }
    }

    // Getter for current page (useful for testing)
    public String getCurrentPage() {
        return currentPage;
    }
}