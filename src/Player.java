import java.util.ArrayList;
public class Player {

    // instance variables for Player class
    // declare player name, their hand, and their points
    private String name;
    private ArrayList<Card> hand;
    private int points;

    // creates player with the player name, an empty hand and 0 points
    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.points = 0;
    }

    // creates player with the player name, a non-empty hand and 0 points
    public Player(String name, ArrayList<Card> hand){
        this.name = name;
        this.hand = hand;
        this.points = 0;
    }


    // returns player name
    public String getName(){
        return this.name;
    }

    // alters player name to newName
    public void setName(String newName){
        this.name = newName;
    }

    // returns player hand
    public ArrayList<Card> getHand(){
        return this.hand;
    }

    // returns the player's points
    public int getPoints(){
        return this.points;
    }

    // adds (newPoints) points to the player's total points
    public void addPoints(int newPoints){
        this.points += newPoints;
    }

    // adds a new card to the player's hand
    public void addCard(Card newCard){
        this.hand.add(newCard);
    }

    // returns the player's points, as well as their hand
    // e.g. "Jimmy has 2 points"
    //      "Jimmy's cards: [2 of Hearts]
    public String toString(){
        return this.name + " has " + this.points + " points \n" + this.name
                + "'s cards: " + this.hand;
    }
}

