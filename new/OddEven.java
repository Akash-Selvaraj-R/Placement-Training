import java.util.Scanner;
public class OddEven{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = scanner.nextInt();
        if (n / 2 * 2 == n){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    } 
}