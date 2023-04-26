import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testDiscardPile() {
      SkipBoGame game = new SkipBoGame();
      DiscardPile discardPile = game.getDiscardPile();
      
      // Test adding cards to the discard pile
      assertEquals(0, discardPile.size());
      discardPile.addCard(new Card(1));
      assertEquals(1, discardPile.size());
      assertEquals(1, discardPile.getTopCard().getValue());
      
      // Test discarding cards to the discard pile
      discardPile.discard(new Card(2));
      assertEquals(2, discardPile.size());
      assertEquals(2, discardPile.getTopCard().getValue());
   }
}
