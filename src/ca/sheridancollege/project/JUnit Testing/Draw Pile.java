import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testDrawPile() {
      SkipBoGame game = new SkipBoGame();
      DrawPile drawPile = game.getDrawPile();
      Player player1 = new Player();
      game.addPlayer(player1);
      
      // Test drawing cards from the draw pile
      assertEquals(162, drawPile.size());
      player1.drawFromDrawPile(5);
      assertEquals(157, drawPile.size());
      
      // Test shuffling the draw pile
      drawPile.shuffle();
      assertTrue(drawPile.size() > 0);
   }
}
