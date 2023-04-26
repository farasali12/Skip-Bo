import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testStockpile() {
      SkipBoGame game = new SkipBoGame();
      Player player1 = new Player();
      game.addPlayer(player1);
      
      // Test drawing cards from the stockpile
      assertEquals(30, player1.getStockpile().size());
      player1.draw();
      assertEquals(29, player1.getStockpile().size());
      
      // Test playing cards from the stockpile
      player1.playFromStockpile(new Card(1));
      assertEquals(29, player1.getStockpile().size());
      assertEquals(1, player1.getBuildingPile(1).getTopCard().getValue());
   }
}
