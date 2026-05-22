//basic operations of 1d array in java with operations of update , traversal and declaration

import java.util.Scanner;
public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the index to update:");
        int index = sc.nextInt();
        System.out.println("Enter the new value:");
        int newValue = sc.nextInt();
        if (index >= 0 && index < n) {
            arr[index] = newValue;
            System.out.println("Updated array elements are:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Index out of bounds.");
        }
        sc.close();
    }
}
