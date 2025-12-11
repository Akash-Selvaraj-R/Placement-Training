/* 

implement browsing history using stack

visit(String url) - add url to the stack
back() - return the previous url and remove it from the stack
forward() - return the next url and remove it from the stack
getCurrentUrl() - return the current url

*/
import java.util.Stack;
public class BrowserHistory {
    private Stack<String> forwardStack;
    private Stack<String> backStack;
    private String currentUrl;

    public BrowserHistory(String url){
        this.currentUrl = url;
        this.forwardStack = new Stack<>();
        this.backStack = new Stack<>();
    }
    public void visit(String url){
        this.backStack.push(this.currentUrl);
        this.currentUrl = url;
        this.forwardStack.clear();
    }
    public String back(){
        this.forwardStack.push(this.currentUrl);
        this.currentUrl = this.backStack.pop();
        return this.currentUrl;
    }
    public String forward(){
        this.backStack.push(this.currentUrl);
        this.currentUrl = this.forwardStack.pop();
        return this.currentUrl;
    }
    public String getCurrentUrl(){
        return this.currentUrl;
    }
    public static void main(String[] args){
        BrowserHistory history = new BrowserHistory("https://www.google.com");
        history.visit("https://www.gmail.com");
        history.visit("https://www.steam.com");
        history.visit("https://www.canva.com");
        System.out.println(history.back());
        System.out.println(history.back());
        System.out.println(history.forward());
        System.out.println(history.getCurrentUrl());
    }
}