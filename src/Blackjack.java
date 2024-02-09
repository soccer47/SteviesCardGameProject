import java.awt.*;
import java.util.Scanner;

// Stevie K H
// 2/9/2024
public class Blackjack {

    // Instance variables for Blackjack class
    // Declare player object and new deck object
    private Player P1;
    private final CardDeck theDeck;
    private BlackjackViewer window;

    // Constructor
    public Blackjack(){
        // sets player name as an empty string
        P1 = new Player("");
        // creates the deck
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        theDeck = new CardDeck(ranks, suits, values);

        // Creates a new BlackjackViewer object
        window = new BlackjackViewer(this);
    }

    public static void main(String[] args){
        // creates new game object
        Blackjack game = new Blackjack();
        game.playGame();
    }

    public void playGame(){
        // Calls newGame method
        newGame();

        // Forever loop that runs until player forfeits, wins, or loses
        while (true) {
            Scanner k = new Scanner(System.in);
            // Gets player input
            String input = k.nextLine();

            // If a player types quit, stop loop and end game
            if (input.equals("quit")) {
                System.out.println("You forfeited. Game Over.");
                return;
            }
            // If player types space then draw another card
            else if (input.equals(" ")) {
                // Calls takeTurn method, which draws a card
                takeTurn();
                // Checks to see if player has won or lost
                // If a player has won or lost, print message and then end game
                // If player points equals 21, they win
                if (P1.getPoints() == 21){
                    System.out.println("You win, " + P1.getName() + "!");
                    return;
                }
                // If player points exceed 21, player loses
                else if (P1.getPoints() > 21){
                    System.out.println("\nYou have exceeded 21 points, "
                                        + P1.getName() + ". You lose!");
                    return;
                }
            }
        }
    }

    public void drawGame(){
        // Calls newGame method
        newGame();

        // Forever loop that runs until player forfeits, wins, or loses
        while (true) {
            Scanner k = new Scanner(System.in);
            // Gets player input
            String input = k.nextLine();

            // If a player types quit, stop loop and end game
            if (input.equals("quit")) {
                P1.setGameOver();
                System.out.println("You forfeited. Game Over.");
                return;
            }
            // If player types space then draw another card
            else if (input.equals(" ")) {
                // Calls takeTurn method, which draws a card
                takeTurn();
                // Checks to see if player has won or lost
                // If a player has won or lost, print message in window and then end game
                // If player points equals 21, they win
                if (P1.getPoints() == 21){
                    System.out.println("You win, " + P1.getName() + "!");
                    return;
                }
                // If player points exceed 21, player loses
                else if (P1.getPoints() > 21){
                    System.out.println("\nYou have exceeded 21 points, "
                            + P1.getName() + ". You lose!");
                    return;
                }
            }
        }
    }

    // Getter methods for deck and player objects created in Blackjack constructor
    public CardDeck getDeck(){
        return theDeck;
    }
    public Player getPlayer(){
        return P1;
    }


    // Method for a single player turn
    public void takeTurn(){
        // Gets random card from deck
        Card newCard = theDeck.deal();
        // Adds the new card to the player's hand, adds card value to player total
        P1.addCard(newCard);
        P1.addPoints(newCard.getValue());
        // Prints what card the user drew, redraws the window to show
        window.repaint();
    }

    public void newGame(){
        // Prints welcome message, gets player name
        System.out.print("Welcome to Blackjack!\n"
                + "Please enter your name: ");
        Scanner h = new Scanner(System.in);
        String playerName = h.nextLine();
        P1.setName(playerName);
    }

    // Draws the game instructions in the window
    public void drawInstructions(Graphics g){
        // Sets the font to new font "Serif"
        g.setFont(new Font("Serif", Font.PLAIN, 30));
        // Prints game instructions
        g.drawString("Hello! "
                + "In Blackjack, you will play by yourself " +
                "against the dealer.", 100, 300);
        g.drawString("Each turn, you will draw a card, and " +
                "the value of your card will be added", 100, 330);
        g.drawString("to your total. You will draw cards until your total " +
                "either equals or exceeds ", 100, 360);
        g.drawString("21. If you total exceeds 21, the dealer wins. " +
                "If you total equals 21, you", 100, 390);
        g.drawString("win. After each turn, you can either press space to draw again, "
                + "or type ", 100, 420);
        g.drawString("in 'quit' to forfeit", 100, 450);
        g.drawString("Enter your name, then press space to draw a card", 100, 510);
    }

}
