import java.util.ArrayList;
public class CardDeck{
    private ArrayList<Card> Deck;
    private int cardsLeft;

    public CardDeck(String[] ranks, String[] suits, int[] values){
        Deck = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++){
            for (String suit : suits){
               Deck.add(new Card(suit, ranks[i], values[i]));
            }
        }
        cardsLeft = Deck.size();
        shuffle();
    }

    public boolean isEmpty(){
        return cardsLeft == 0;
    }

    public int getCardsLeft(){
        return cardsLeft;
    }

    public Card deal(){
        if (cardsLeft == 0) {
            return null;
        }
        cardsLeft--;
        return Deck.get(cardsLeft);
    }

    public void shuffle(){
        ArrayList<Card> newDeck = new ArrayList<Card>();
        while (!Deck.isEmpty()){
            newDeck.add(Deck.remove((int)(Math.random() * Deck.size())));
        }
        for (Card i : newDeck){
            Deck.add(i);
        }
        cardsLeft = Deck.size();
    }

    public void shuffleMet2(){
        for (int i = Deck.size() - 1; i > 0; i--){
            int randIndex = (int)(Math.random() * (i + 1));
            Card holder = Deck.get(randIndex);
            Deck.set(randIndex, Deck.get(i));
            Deck.set(i, holder);
        }
    }

}
