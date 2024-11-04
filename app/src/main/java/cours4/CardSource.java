package cours4;

import cours3.Card;

public interface CardSource {
    Card draw(); // pre: !isEmpty(), return: next card
    boolean isEmpty(); // return: true if no card in the source
}
