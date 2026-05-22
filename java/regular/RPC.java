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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter : ");
        String move = sc.nextLine();
        System.out.println(" PC : " + decision(move));
    }
}

 