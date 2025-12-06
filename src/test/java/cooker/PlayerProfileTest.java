package cooker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerProfileTest {
    @BeforeEach
    void resetSingleton() {
        //Got the instance reset code from online and ChatGPT
        try {
            var instanceField = PlayerProfile.class.getDeclaredField("instance");
            instanceField.setAccessible(true);
            instanceField.set(null, null);
        } catch (Exception ignored) {}
    }

    @Test
    void testSingletonInstance() {
        PlayerProfile p1 = PlayerProfile.getInstance();
        PlayerProfile p2 = PlayerProfile.getInstance();

        assertSame(p1, p2);  // should reference same object
    }

    @Test
    void testAddMoney() {
        PlayerProfile player = PlayerProfile.getInstance();
        player.addMoney(20);
        assertEquals(20, player.getMoney());
    }

    @Test
    void testAddScore() {
        PlayerProfile player = PlayerProfile.getInstance();
        player.addScore(50);
        assertEquals(50, player.getScore());
    }

}
