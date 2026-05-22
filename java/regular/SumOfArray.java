//write a program to print the sum of all elements in an array.

import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        sc.close();
    }
}

//basic simple sum of array with provided elements as int arr1 = {1,2,3,4,5}

/*import java.util.Scanner;
public class SumOfArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr1 = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr1[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        sc.close();
    }
    */