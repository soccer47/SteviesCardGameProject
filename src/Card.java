import javax.swing.*;
import java.awt.*;

// Stevie K H
// 2/9/2024
public class Card {
    // Instance variables for Card class
    // Declares the suit, rank, and value
    private String suit;
    private int rank;
    private int value;

    private Image cardImage;

    // Sets the cards width and height
    private static final int CARD_WIDTH = 155;
    private static final int CARD_HEIGHT = 230;

    private static final int y = 250;

    private BlackjackViewer game;

    // Constructor
    public Card(String suit, int rank, int value, Image card)
    {
        this.suit = suit;
        this.rank = rank;
        this.value = value;

        // Initializes the image that will be drawn in the window to represent the card
        cardImage = card;
    }

    // Getter methods
    // Returns the suit of the card
    public String getSuit(){
        return this.suit;
    }

    // Returns the rank of the card
    public int getRank(){
        return this.rank;
    }

    // Returns the value of the card
    public int getValue(){
        return this.value;
    }

    // Setter methods
    // Sets the suit of the card to newSuit
    public void setSuit(String newSuit){
        this.suit = newSuit;
    }

    // Sets the rank of the card to newRank
    public void setRank(String newRank){
        this.suit = newRank;
    }

    // Sets the value of the card to newValue
    public void setValue(int newValue){
        this.value = newValue;
    }

    // Returns the rank and suit of the card
    // E.g. "Ace of Diamonds"
    public String toString(){
        return this.rank + " of " + this.suit;
    }

    // Draw function that draws the card's image in the window at given x coordinate
    public void draw(Graphics g, int x){
        g.drawImage(cardImage, x + 30, y + 50, CARD_WIDTH, CARD_HEIGHT, game);
    }

}
