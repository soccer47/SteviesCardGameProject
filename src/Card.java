public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value)
    {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getRank(){
        return this.rank;
    }

    public int getValue(){
        return this.value;
    }

    public void setSuit(String newSuit){
        this.suit = newSuit;
    }

    public void setRank(String newRank){
        this.suit = newRank;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public String toString(){
        return this.rank + " of " + this.suit;
    }

}
