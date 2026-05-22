
//university allows u a presitage, after evaluating the 
//who secured second highest one in the exam
//score of 3 student
//find 2nd highest score
//first = take input
//second = find second highest score
//three integers! 
//score1 score2 score3

import java.util.Scanner;

class secondHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter score 2: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter score 3: ");
        int score3 = scanner.nextInt();

        int secondHighest;

        if ((score1 >= score2 && score1 <= score3) || (score1 <= score2 && score1 >= score3)) {
            secondHighest = score1;
        } else if ((score2 >= score1 && score2 <= score3) || (score2 <= score1 && score2 >= score3)) {
            secondHighest = score2;
        } else {
            secondHighest = score3;
        }

        System.out.println("The second highest score is: " + secondHighest);
    }
}