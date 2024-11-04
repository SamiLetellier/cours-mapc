package cours3;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> aCards = new ArrayList<>();

    public Deck(List<Card> pCards)
    {
        aCards = pCards;
    }

    public Card draw() { return aCards.remove(0); }
    public int size() { return aCards.size(); }
    public Card getCard(int pIndex) { return aCards.get(pIndex); }

    public List<Card> getCards() {
        return new ArrayList<>(aCards);
    }
}
