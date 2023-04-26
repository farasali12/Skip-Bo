import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testDiscarding() {
      SkipBoGame game = new SkipBoGame();
      Player player1 = new Player();
      game.addPlayer(player1);
      
      // Test discarding cards to the discard pile
      DiscardPile discardPile = game.getDiscardPile();
      assertEquals(0, discardPile.size());
      player1.discard(new Card(1));
      assertEquals(1, discardPile.size());
      assertEquals(1, discardPile.getTopCard().getValue());
   }
}
