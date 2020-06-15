import java.util.Random;

public class DeckOfCards {

    private Card deck[];
    private int currentCard;
    private final int numberOfCards = 52;
    private Random randomNumbers;

    public DeckOfCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[numberOfCards];
        currentCard = 0;
        randomNumbers = new Random();

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    public Object dealCard() {

        if (currentCard<deck.length)
            return deck[currentCard++];
        else
            return null;
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(numberOfCards);

            Card temp = deck[first];
            deck[first] = deck[second];
        }
    }
}
