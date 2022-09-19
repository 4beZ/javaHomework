import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        float avg = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        avg = sum/a.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}