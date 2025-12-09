//java simple program to reverse a 1D array

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        reverseArray(array);
        
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}

/* 
Output:
Original Array: [1, 2, 3, 4, 5]
Reversed Array: [5, 4, 3, 2, 1]

The program defines a method reverseArray that takes an integer array as input
and reverses its elements in place using a two-pointer approach.
The main method demonstrates the functionality by reversing a sample array
and printing the results before and after the reversal
*/