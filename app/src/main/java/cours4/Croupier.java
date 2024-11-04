package cours4;

public interface Croupier extends CardSourceCreator{
    @Override
    default CardSource createCardSource() {
        return new Deck();
    }
}
