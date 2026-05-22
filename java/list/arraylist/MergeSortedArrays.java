import java.util.Scanner;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        
        int i = 0;
        int j = 0; 
        int k = 0; 
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] merged = mergeSortedArrays(arr1, arr2);
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i < merged.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}