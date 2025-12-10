//find the missing number from 1 to 10 using HASHSET in simple java

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Finding missing number from 1 to 10...");

        for (int i = 1; i <= 10; i++) {
            if (!set.contains(i)) {
                System.out.println("The missing number is: " + i);
                break;
            }
        }
    }
}