/* 
make a simple java code to implement Array Twins: Are They Equal?

20 marks
Medium
coding
system error
Problem Description
You're given two integer arrays a and b of the same length. Determine if they are equal based on the following conditions:
● Both arrays must contain the same set of elements.
● The order does not matter.
● If an element is repeated, the count of that element must be the same in both arrays.
Return "Yes" if the arrays are equal, otherwise return "No".

Constraints
Input Constraints:
● 1 ≤ len(a), len(b) ≤ 10⁵
● -10⁶ ≤ a[i], b[i] ≤ 10⁶
Output Constraints:
Return "Yes" if arrays are equal, otherwise "No"

All Test Cases
Test Case 1
Private
system_error
Input:
{"a": [3, 3, 3, 2, 1], "b": [1, 2, 3, 3, 3]}
Expected Output:
"Yes"
Test Case 2
Private
system_error
Input:
{"a": [5, 6, 7], "b": [7, 6, 5]}
Expected Output:
"Yes"
Test Case 3
Private
system_error
Input:
{"a": [10, 20, 30, 40, 50], "b": [10, 20, 30, 40, 60]}
Expected Output:
"No"
Test Case 4
Private
system_error
Input:
{"a": [1], "b": [2]}
Expected Output:
"No"
Test Case 5
Private
system_error
Input:
"{'a':[-1, -2, -3, -1, -2], \"b\":[-2, -1, -1, -2, -3]'}"
Expected Output:
"Yes"
Test Case 6
Private
system_error
Input:
"{'a':[100000, -100000], \"b\":[-100000, 100000]'}"
Expected Output:
"Yes"
*/

//solution:
import java.util.HashMap;

import java.util.*;

class ArrayTwins {
    
    public String areEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return "No";
        }

        HashMap<Integer, Integer> count = new HashMap<>();
        
        // Count frequencies in array a
        for (int num : a) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // Decrease counts using array b
        for (int num : b) {
            if (!count.containsKey(num)) {
                return "No";
            }
            count.put(num, count.get(num) - 1);
            if (count.get(num) == 0) {
                count.remove(num);
            }
        }
        
        return count.isEmpty() ? "Yes" : "No";
    }

    // Main method to test with runtime input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ArrayTwins obj = new ArrayTwins();
        String result = obj.areEqual(a, b);

        System.out.println(result);

        sc.close();
    }
}