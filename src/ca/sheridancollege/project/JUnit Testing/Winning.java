import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testWinning() {
      SkipBoGame game = new SkipBoGame();
      Player player1 = new Player();
      Player player2 = new Player();
      game.addPlayer(player1);
      game.addPlayer(player2);
      
      // Test winning the game
      assertEquals(30, player1.getStockpile().size());
      assertEquals(30, player2.getStockpile().size());
      assertTrue(player1.getBuildingPiles().stream().allMatch(pile -> pile.isEmpty()));
      assertTrue(player2.getBuildingPiles().stream().allMatch(pile -> pile.isEmpty()));
      
      player1.drawFromDrawPile(30);
      assertTrue(player1.getStockpile().isEmpty());
      assertTrue(player1.getBuildingPiles().stream().allMatch(pile -> pile.isEmpty()));
      assertTrue(game.isGameOver());
   }
}
