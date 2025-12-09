//factorial code in java using private access modifier in recurision method

import java.util.Scanner;

public class pvtFactorial {
    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        pvtFactorial obj = new pvtFactorial();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int number = scanner.nextInt();
        int result = obj.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
    }
}
/* 
output example:
Enter a number to compute its factorial: 5
Factorial of 5 is: 120
*/