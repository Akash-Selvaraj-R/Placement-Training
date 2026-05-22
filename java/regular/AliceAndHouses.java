/*Alice has a pair of magical shoes that allows her to climb 3 stairs at once,in the city, 
there aew N houses whose roofs Alice wants to reach. the number of stairs to the roof of each house is given in an array a
Alice can reach the roof of only those roofs whose number of stairs is not a multiple of 3. ur task is to find
and return an integer value representing the count of numbers of houses whose roof she can reach.

Input Format:
-------------
Line-1: An integer N, number of houses
Line-2: N space separated integers, number of stairs to the roof of each house.

Output Format:
--------------
Print an integer value, count of houses Alice can reach.
*/

import java.util.Scanner;
public class AliceAndHouses{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int stairs = sc.nextInt();
            if (stairs % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//explanation:
/*The program reads the number of houses and the number of stairs for each house.
It checks if the number of stairs is a multiple of 3 using the modulus operator (%).
If it is, it increments the count.
Finally, it prints the count of houses whose roofs Alice can reach.*/
