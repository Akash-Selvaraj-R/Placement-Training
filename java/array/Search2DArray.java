//Q2. Write a simple java program to search for an element for 2d array

import java.util.Scanner;
public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == search) {
                    System.out.println("Element found at index: " + i + "," + j);
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}