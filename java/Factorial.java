//Java simple prorgram for factorial using recursion method

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Factorial : " + factorial(n));
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return num * factorial(num - 1); // Recursive case
        }
    }
}

/*
output
Enter the number:
5
Factorial of 5 is 120
*/