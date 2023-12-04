import java.util.ArrayList;
public class CardDeck{

    // instance variables for CardDeck class
    // declare Deck object and the number of cards left in the deck
    private ArrayList<Card> Deck;
    private int cardsLeft;

    public CardDeck(String[] ranks, String[] suits, int[] values){
        // creates a new deck with the inputed cards
        Deck = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++){
            for (String suit : suits){
               Deck.add(new Card(suit, ranks[i], values[i]));
            }
        }
        // sets the number of cards left to the size of the Deck
        cardsLeft = Deck.size();
        // shuffles the deck
        shuffle();
    }

    // returns whether the deck is empty or not
    public boolean isEmpty(){
        return cardsLeft == 0;
    }

    // returns the number of cards left in the deck
    public int getCardsLeft(){
        return cardsLeft;
    }

    // deals a random card from the deck
    public Card deal(){
        // returns null if the deck is empty
        if (cardsLeft == 0) {
            return null;
        }
        // decreases the number of cards left in the deck by one
        cardsLeft--;
        // returns the card at index (cardsLeft) in deck
        return Deck.get(cardsLeft);
    }

    // shuffles the deck
    public void shuffle(){
        ArrayList<Card> newDeck = new ArrayList<Card>();
        // randomly adds cards from deck to a new deck until original deck empty
        while (!Deck.isEmpty()) {
            newDeck.add(Deck.remove((int) (Math.random() * Deck.size())));
        }
        // makes card order of original deck that of the new deck
        for (Card i : newDeck){
            Deck.add(i);
        }
        // sets the number of cards left to the size of the deck
        cardsLeft = Deck.size();
    }

    // also shuffles the deck
    public void shuffleMet2(){
        for (int i = Deck.size() - 1; i > 0; i--){
            int randIndex = (int)(Math.random() * (i + 1));
            Card holder = Deck.get(randIndex);
            Deck.set(randIndex, Deck.get(i));
            Deck.set(i, holder);
        }
    }

}
