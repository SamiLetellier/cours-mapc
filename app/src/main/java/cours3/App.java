package cours3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        Deck deck = new Deck(cards);
        cards.add(new Card(Card.Rank.ACE, Card.Suit.HEARTS));
    }
}
