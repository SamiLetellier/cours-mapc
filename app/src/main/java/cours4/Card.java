package cours4;

public class Card implements Comparable<Card> {
    public enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }
    public enum Suit { CLUBS, DIAMONDS, SPADES, HEARTS }

    private Suit aSuit;
    private Rank aRank;
    private CompareMode compareMode = CompareMode.RANK;

    public enum CompareMode { RANK, SUIT }

    public Card(Suit suit, Rank rank) {
        this.aSuit = suit;
        this.aRank = rank;
    }

    public Suit getSuit() {
        return aSuit;
    }

    public Rank getRank() {
        return aRank;
    }

    public void setCompareMode(CompareMode compareMode) {
        this.compareMode = compareMode;
    }

    @Override
    public int compareTo(Card o) {
        return switch (this.compareMode) {
            case RANK -> this.aRank.ordinal() - o.aRank.ordinal();
            case SUIT -> this.aSuit.ordinal() - o.aSuit.ordinal();
        };
    }
}
