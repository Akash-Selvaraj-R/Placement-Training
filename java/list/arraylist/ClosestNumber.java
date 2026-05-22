/*
given a sorted array and a target value find the element that has minimum absolute difference with the target value

import java.util.Scanner;
public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int closest = arr[0];
        long minDiff = (long)(target - arr[0]) * (target - arr[0]);

        for (int i = 1; i < n; i++) {
            long currentDiff = (long)(target - arr[i]) * (target - arr[i]);

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closest = arr[i];
            }
        }

        System.out.println("The closest number to " + target + " is: " + closest);
    }
}

public class ClosestNumber {
    public static int findClosest(int[] arr, int target) {
        /* 
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
            
        int closest = arr[0];
        int minDiff = Math.abs(target - arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(target - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                closest = arr[i];
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 20, 30};
        int target = 7;

        int closest = findClosest(arr, target);
        System.out.println("The closest number to " + target + " is: " + closest);
    }
}
    */

import java.util.*;
public class ClosestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int closest = findClosest(arr, target);
        System.out.println("The closest number to " + target + " is: " + closest);
        sc.close();
    }
    public static int findClosest(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int closest = arr[0];
        int minDiff = Math.abs(target - arr[0]);
        for (int num : arr) {
            int diff = Math.abs(target - num);
            if (diff < minDiff || (diff == minDiff && num > closest)) {
                minDiff = diff;
                closest = num;
            }
        }
        return closest;
    }
}