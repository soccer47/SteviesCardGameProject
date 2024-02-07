import javax.swing.*;
import java.awt.*;

public class BlackjackViewer extends JFrame {
    private final int WINDOW_WIDTH = 1050;
    private final int WINDOW_HEIGHT = 800;
    private Blackjack s;
    private Player guy;

    private Image background;

    public BlackjackViewer(Blackjack bjack){
        s = bjack;
        guy = bjack.getPlayer();
        background = new ImageIcon("Resources/background.jpg").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Blackjack: The Game");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        int x = 100;
        g.drawImage(background, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Serif", Font.PLAIN, 60));
        g.drawString("Total: " + guy.getPoints(), 450, 200);
        if (guy.getPoints() == 0) {
            s.drawInstructions(g);
        }
        for (Card c : guy.getHand()){
            c.draw(g, x);
            x += 225;
        }
        if (guy.getGameOver()){
            if (guy.getWin()){
                g.setColor(Color.GREEN);
                g.setFont(new Font("Serif", Font.PLAIN, 60));
                g.drawString(guy.getName() + " wins", 400, 725);
            }
            else {
                g.setColor(Color.RED);
                g.setFont(new Font("Serif", Font.PLAIN, 60));
                g.drawString(guy.getName() + " loses", 400, 725);
            }
        }
    }
}
