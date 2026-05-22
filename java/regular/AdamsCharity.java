//Adam deceided to be generous and do some charity, starting today, from day 1until day n,he gives i^2 coins to charity on day "1" (1<=i<=n). Write a program to calculate the total number of coins he will give to charity after n days
//input: consists of one integer
//constraints: N/A
//output: one integer

import java.util.Scanner;

class AdamsCharity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCoins = 0;
        for (int i = 1; i <= n; i++) {
            totalCoins += i * i;
        }
        System.out.println(totalCoins);
    }
}