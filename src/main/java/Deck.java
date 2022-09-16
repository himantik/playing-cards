import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Rank;
import com.tlglearning.cards.model.Suit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card> {

  private final List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank = Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }

  }


  @Override
  public Iterator<Card> iterator() {
    return null;
  }
}
