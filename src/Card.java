public class Card {

    // instance variables for Card class
    // declares the suit, rank, and value
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value)
    {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    // returns the suit of the card
    public String getSuit(){
        return this.suit;
    }

    // returns the rank of the card
    public String getRank(){
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

}
