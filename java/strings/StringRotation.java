/*
get two strings from user as s, goal and if s can become g after some shifts, 
return true or else return false
*/

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        
        // Check if lengths are same and s+s contains goal
        if (s.length() == goal.length() && (s + s).contains(goal)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}