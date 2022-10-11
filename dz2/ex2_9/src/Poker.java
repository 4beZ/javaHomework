import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] D = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "Q", "K", "A"};
        String[] H = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "Q", "K", "A"};
        String[] S = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "Q", "K", "A"};
        String[] C = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "Q", "K", "A"};
        String[][] cards = {D, H, S, C};
        String[] masti = {"D", "H", "S", "C"};

        int n = 11;

        while (n > 10) {
            System.out.println("Enter number of players");
            n = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            String resultCards = "";
            for (int j = 0; j < 5; j++) {
                boolean metCard = false;
                String cardText = "";
                while (!metCard) {
                    int mast = (int) (Math.random() * 4);
                    int card = (int) (Math.random() * 14);
                    if (cards[mast][card] != "0") {
                        metCard = true;
                        cardText = masti[mast] + " " + cards[mast][card] + " | " ;
                        cards[mast][card] = "0";
                    }
                }
                resultCards += cardText;
            }
            System.out.println(resultCards);
            System.out.println();
        }
    }
}