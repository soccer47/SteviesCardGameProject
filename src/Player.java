import java.util.ArrayList;
public class Player {

    private String name;
    private ArrayList<Card> hand;
    private int points;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.points = 0;
    }

    public Player(String name, ArrayList<Card> hand){
        this.name = name;
        this.hand = hand;
    }


    public String getName(){
        return this.name;
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public int getPoints(){
        return this.points;
    }

    public void addPoints(int newPoints){
        this.points += newPoints;
    }

    public void addCard(Card newCard){
        this.hand.add(newCard);
    }

    public String toString(){
        return this.name + " has " + this.points + " points \n" + this.name
                + "'s cards: " + this.hand;
    }
}

