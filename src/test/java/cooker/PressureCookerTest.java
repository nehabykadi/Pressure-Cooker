package cooker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class PressureCookerTest {
    private static PressureCooker pressureCooker;
    private static OrderFactory orderFactory;

    @BeforeAll
    static void setUpGame(){
        pressureCooker = new PressureCooker(null);
    }

    @Test
    public void testStartupDisplayFunctions() {
        pressureCooker.displayWelcomeMessage();
        pressureCooker.displayGameRules();
    }

    @Test
    public void testdisplayOrder() {
        pressureCooker.displayOrder(orderFactory.generateOrder(), 2500);
    }
}