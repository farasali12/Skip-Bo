import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SkipBoTest {

   @Test
   public void testBlockingOpponents() {
      SkipBoGame game = new SkipBoGame();
      Player player1 = new Player();
      Player player2 = new Player();
      game.addPlayer(player1);
      game.addPlayer(player2);
      
      // Test using Skip-Bo cards to block opponents
      player2.addToBuildingPile(1, new Card(1));
      player1.useSkipBoCard(1, new Card(2));
      assertNull(player2.getBuildingPile(1).getTopCard());
   }
}
