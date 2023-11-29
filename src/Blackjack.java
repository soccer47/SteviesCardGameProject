import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args){
        playGame();
    }

    public static void playGame(){
        newGame();
        printInstructions();
        while (P1.getPoints() <= 21)
        {
            Scanner k = new Scanner(System.in);
            String input = k.nextLine();
            if (input.equals("quit")){
                System.out.println("You forfeited. Game Over.");
                return;
            }
            takeTurn();
        }
        if (P1.getPoints() == 21){
            System.out.print("You win, " + P1.getName + "!");
        }
        else{
            System.out.print("You have exceeded 21 points, " + P1.getName() + ". You lose!");
        }
    }

    public static void takeTurn(){
        Card newCard = deck.deal();
        P1.addCard(newCard);
        P1.addPoints(newCard.getValue());
        System.out.println("You drew a " + newCard + "\n" + P1);
    }

    public static void newGame(){
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        CardDeck deck = new CardDeck(ranks, suits, values);

        System.out.print("Welcome to Blackjack!\n"
                + "Please enter your name: ");
        Scanner h = new Scanner(System.in);
        String playerName = h.nextLine();
        Player P1 = new Player(playerName);
    }

    public static void printInstructions(){
        System.out.println();
        System.out.println("Hello, " + P1.getName() + "!\n"
                + "In Blackjack, you will play by yourself" +
                "against the dealer.\n"
                + "Each turn, you will draw a card, and the value of\n" +
                "your card will be added to your total.\n"
                + "You will draw cards until your total either" +
                "equals or exceeds 21.\n"
                + "If you total exceeds 21, the dealer wins.\n"
                + "If you total equals 21, you win."
                + "After each turn, you can either press space to draw again,\n"
                + "or type in 'quit' to forfeit");
        System.out.println("Ready?\nPlay!");
    }

}
