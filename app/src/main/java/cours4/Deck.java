package cours4;

import cours3.Card;

import java.util.*;

public class Deck implements CardSource{

    private List<Card> aCards;
    public Deck() { }

    public void shuffle() {}
    public Iterator<Card> iterator() {  return aCards.iterator();  }
    @Override public Card draw() {  return aCards.remove(0); }
    @Override public boolean isEmpty() { return aCards.isEmpty(); }


    public static List<Card> drawCards(CardSource pSource, int pNumber) {
        List<Card> result = new ArrayList<
                >();
        for (int i = 0; i < pNumber && !pSource.isEmpty(); i++) {
            result.add(pSource.draw()); }
        return result;
    }

    public static final Comparator<Card> rankComparator() {
        return (card1, card2) -> card1.getRank().ordinal() - card2.getRank().ordinal();
    }

    public static final Comparator<Card> suitComparator() {
        return (card1, card2) -> card1.getSuit().ordinal() - card2.getSuit().ordinal();
    }

    public void sort(int choix) {
        switch (choix) {
            case 0 -> Collections.sort(aCards, rankComparator());
            case 1 -> Collections.sort(aCards, suitComparator());
//            default -> Collections.sort(aCards);
        }
    }
}
