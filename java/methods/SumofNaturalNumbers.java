//simple java program to find the sum of n natural numbers using recursion method

import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(); 
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of is " + sum);
        sc.close();
    }
    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}
//Input: 5
//Output: The sum of first 5 natural numbers is: 15
//Explanation: 1 + 2 + 3 + 4 + 5 = 15