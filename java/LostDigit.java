/*Q. Lost digit 

u r working on a number sequence puzzle, you have a array, that supposed to contain all the numbers from 1 to n, but one number is missing. Your task is to find the missing number
input format : 
An integer n, representing the length of the array.
An integer array a
Output format :
An integer representing the missing number.
Sample Input 1 :
5
1 2 3 5
Sample Output 1 :
4
Sample Input 2 :
10
1 2 3 4 5 6 7 8 10 9

import java.util.Scanner;
public class LostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = n*(n+1)/2;
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        int missingNumber = total - sum;
        System.out.println(missingNumber);
        sc.close();
    }
}
*/
//explanation:
/*The program calculates the expected sum of the first n natural numbers using the formula n*(n+1)/2
It then computes the actual sum of the numbers present in the array. 
The difference between the expected sum and the actual sum gives the missing number, 
which is then printed as output.import java.util.Scanner;
}*/

//make the code above even more simple and optimized
import java.util.Scanner;
public class LostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++) {
            sum -= sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}