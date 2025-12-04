import java.util.Scanner;

class DG4{
    public static String decision(String[] M){
        switch(n){
            case "rock": return "paper";
            case "paper": return "scissors";
            case "scissors": return "rock";
            default: return "Invalid output";
        }
    }
      public static void main(String[] args){
            Scanner sc = new scanner();
            System.out.print("Enter : ");
            String move = nextLine();
            System.out.println("PC : " + decision(move));
    }
}