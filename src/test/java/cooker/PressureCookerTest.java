package cooker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class PressureCookerTest {
    private static PressureCooker pressureCooker;

    @BeforeAll
    static void setUpGame(){
        pressureCooker = new PressureCooker(null);
    }

    @Test
    public void testDisplayFunctions() {
        pressureCooker.displayWelcomeMessage();
        pressureCooker.displayGameRules();
    }
}