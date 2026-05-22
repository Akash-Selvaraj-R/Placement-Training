import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  // Player A's move
        
        if (a.equals("rock")) {
            System.out.println("paper");
        }
        else if (a.equals("paper")) {
            System.out.println("scissors");
        }
        else if (a.equals("scissors")) {
            System.out.println("rock");
        }
        
        sc.close();
    }
}