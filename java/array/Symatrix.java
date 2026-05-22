//Qn. Write a java program to find the matrix is symmetric or not

import java.util.Scanner;
public class Symatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter Elements ");
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            } 
        }
        boolean isSymmetric = true;
        for (int i =0; i<n; i++){
            for (int j=0;j<n;j++){
                if (arr[i][j] != arr[j][i]){
                    isSymmetric = false;
                    break;

                }
            }
        }
        if (isSymmetric){
            System.out.println("yes it is symmetric");
        } else {
            System.out.println("well its not symmetric");
        }
    }
}