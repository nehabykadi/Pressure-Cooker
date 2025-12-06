package cooker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;


public class PressureCookerTest {
    private static PressureCooker pressureCooker;
    private static OrderFactory orderFactory;
    @Test
    void testConstructorWithOnlyPlayer() {
        PlayerProfile profile = PlayerProfile.getInstance();
        PressureCooker cooker = new PressureCooker(profile);

    }

    @Test
    void testConstructorWithPlayerAndFactory() {
        PlayerProfile profile = PlayerProfile.getInstance();
        OrderFactory factory = new OrderFactory();
        PressureCooker cooker = new PressureCooker(profile, factory);

    }

    @Test
    void testConstructorWithPlayerFactoryAndTipCalculator() {
        PlayerProfile profile = PlayerProfile.getInstance();
        OrderFactory factory = new OrderFactory();
        TipCalculator tipper = new TipCalculator(0.3);
        PressureCooker cooker = new PressureCooker(profile, factory, tipper);

    }

    @Test
    void testFullConstructorWithScanner() {
        PlayerProfile profile = PlayerProfile.getInstance();
        OrderFactory factory = new OrderFactory();
        TipCalculator tipper = new TipCalculator(0.5);
        Scanner scanner = new Scanner(System.in);

        PressureCooker cooker = new PressureCooker(profile, factory, tipper, scanner);

    }

    @Test
    public void testStartupDisplayFunctions() throws InterruptedException {
        pressureCooker = new PressureCooker(null);
        pressureCooker.displayWelcomeMessage();
        pressureCooker.displayGameRules();
    }

    @Test
    public void testdisplayOrder() {
        pressureCooker = new PressureCooker(null);
        pressureCooker.displayOrder(orderFactory.generateOrder(), 2500);
    }
}