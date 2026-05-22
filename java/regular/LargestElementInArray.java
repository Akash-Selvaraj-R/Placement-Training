//Q2. how to find the largest element in an array in java?

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 2, 7};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}

//Q3. how to find the largest element in an array in java without importing packages or creating any class?
/*
import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 2, 7};
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        System.out.println("The largest element in the array is: " + largest);
    }
}
*/