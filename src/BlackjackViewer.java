import javax.swing.*;
import java.awt.*;

// Stevie K H
// 2/9/2024
public class BlackjackViewer extends JFrame {
    // Instance variables
    private final int WINDOW_WIDTH = 1050;
    private final int WINDOW_HEIGHT = 800;
    private Blackjack s;
    private Player guy;

    private Image background;

    // Constructor
    public BlackjackViewer(Blackjack bjack){
        s = bjack;
        guy = bjack.getPlayer();
        background = new ImageIcon("Resources/background.jpg").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Blackjack: Win or Go Home");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    // Paint method, draws & redraws the window
    public void paint(Graphics g) {
        // Sets the starting x coordinate to 70 px right of the left window edge
        int x = 70;
        // Clears the screen by redrawing the background
        g.drawImage(background, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        // Prints the game's text on the window
        g.setColor(Color.WHITE);
        g.setFont(new Font("Serif", Font.PLAIN, 60));
        // If this is the first screen, the game instructions are printed
        // Otherwise the hand of the player is drawn in the window
        g.drawString("Total: " + guy.getPoints(), 450, 200);
        if (guy.getPoints() == 0) {
            Image startingBackground = new ImageIcon("Resources/startBackground.png").getImage();
            g.drawImage(startingBackground, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        }

        // Draws each card in the player's hand
        for (Card c : guy.getHand()){
            c.draw(g, x);
            // displaces the next card 190px to the left of the left side of the last card
            x += 190;
        }

        // Checks if the game is over
        if (guy.getGameOver()){
            // If the player won, print win message
            if (guy.getWin()){
                g.setColor(Color.GREEN);
                g.setFont(new Font("Serif", Font.PLAIN, 60));
                g.drawString(guy.getName() + " wins", 400, 650);
            }
            else {
                // Otherwise (if player lost) print loss message
                g.setColor(Color.RED);
                g.setFont(new Font("Serif", Font.PLAIN, 60));
                g.drawString(guy.getName() + " loses", 400, 650);
            }
        }
    }
}
