import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n + " is a positive number.");
        } else if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(n + " is zero.");
        }
    }
}


