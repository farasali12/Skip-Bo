import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testVariations() {
      // Test playing Skip-Bo with only three building piles
      SkipBoGame game = new SkipBoGame(3);
      Player player1 = new Player();
      game.addPlayer(player1);
      
      assertEquals(3, player1.getBuildingPiles().size());
      assertTrue(player1.getBuildingPiles().stream().allMatch(pile -> pile.isEmpty()));
   }
}
