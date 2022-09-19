import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int factorial (int a) {
        int fact = 1;
        while (a > 1) {
            fact *= a;
            a--;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Введите число:");
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(scan.nextInt()));
    }
}