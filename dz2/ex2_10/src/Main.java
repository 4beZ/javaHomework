import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean enteredWord = false;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !enteredWord) {
                enteredWord = true;
                counter++;
            }
            if (enteredWord) {
                if (str.charAt(i) == ' ')
                    enteredWord = false;
            }
        }
        System.out.println(counter);
    }
}