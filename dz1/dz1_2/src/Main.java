import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        int max = 0;
        int min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте элементы масиива: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + ":");
            a[i] = scan.nextInt();
            sum += a[i];
            if (i == 0) {
                min = a[i];
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}