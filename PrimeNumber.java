import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.println(" enter the number to check prime or not");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }

        }

        if (n == 0 ||n==1) {

            System.out.println(n + " is neither prime nor prime number");
        }
        else if (count == 2) {
            System.out.println(n + " is prime number");
        }

        else {
            System.out.println(n + " is not a prime  number");

        }
    }

}
