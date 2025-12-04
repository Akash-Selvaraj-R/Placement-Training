import java.util.Scanner;

class RPC {
    public static String decision(String M) {
        switch (M) {
            case "rock":
                return "paper";
            case "paper":
                return "scissors";
            case "scissors":
                return "rock";
            default:
                return "Invalid move";
        }
    }
}