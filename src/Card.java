import javax.swing.*;
import java.awt.*;

public class Card {

    // instance variables for Card class
    // declares the suit, rank, and value
    private String suit;
    private int rank;
    private int value;

    private Image cardImage;

    private static final int CARD_WIDTH = 200;
    private static final int CARD_HEIGHT = 315;

    private static final int y = 250;

    private BlackjackViewer game;

    public Card(String suit, int rank, int value, Image card)
    {
        this.suit = suit;
        this.rank = rank;
        this.value = value;

        // initialize an array of card images for each suit
        cardImage = card;
    }

    // returns the suit of the card
    public String getSuit(){
        return this.suit;
    }

    // returns the rank of the card
    public int getRank(){
        return this.rank;
    }

    // returns the value of the card
    public int getValue(){
        return this.value;
    }

    // sets the suit of the card to newSuit
    public void setSuit(String newSuit){
        this.suit = newSuit;
    }

    // sets the rank of the card to newRank
    public void setRank(String newRank){
        this.suit = newRank;
    }

    // sets the value of the card to newValue
    public void setValue(int newValue){
        this.value = newValue;
    }

    // returns the rank and suit of the card
    // e.g. "Ace of Diamonds"
    public String toString(){
        return this.rank + " of " + this.suit;
    }

    public void draw(Graphics g, int x){
        g.drawImage(cardImage, x + 30, y + 50, CARD_WIDTH, CARD_HEIGHT, game);
    }

}
