/*
//simple java program to print palindrome of numbers using for loop

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        int originalNum = num;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
//output
//Enter a number: 121
//121 is a palindrome


//Qn Write the program for palindrome or not using while loop

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        int originalNum = num;
        while (num!=0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num/=10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

    }
}
//output
//Enter a number: 121
//121 is a palindrome
*/

//write a simple basic program to get input from user with any set of values and string and check a string is palindrome or not

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); 
        }

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
//output
//Enter a string: madam
//madam is a palindrome

