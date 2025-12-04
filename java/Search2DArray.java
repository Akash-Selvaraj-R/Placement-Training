//Q2. Write a simple java program to search for an element in an 2D array

import java.util.Scanner;
public class Search2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == search) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Element found at position (" + i + ", " + j + ")");
        } else {
            System.out.println("Element not found");
        }
    }
}