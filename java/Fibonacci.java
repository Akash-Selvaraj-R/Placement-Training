//Java simple prorgram for fibonacci using recursion method

import java.util.Scanner;
public class Fibonacci() {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printLn("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci : " + fibonacci(n));
        sc.close();
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

/*
output
Enter the number:
5
Fibonacci : 
*/