//write a java program for rock paper scissor game using simple switch case
//input format : Rock
//output format : paper


import java.util.Scanner;
public class DG4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String choice=sc.nextLine();
        switch (choice){
            case "Rock":
                System.out.println("Paper");
                break;
            case "Paper":
                System.out.println("Scissor");
                break;
            case "Scissor":
                System.out.println("Rock");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }   
}

/*OUTPUT
Enter your choice: 
Rock
Paper

Enter your choice: 
Paper
Scissor

Enter your choice: 
Scissor
Rock

Enter your choice: 
Invalid Input
*/
