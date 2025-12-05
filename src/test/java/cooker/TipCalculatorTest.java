package cooker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    private TipCalculator tipCalculator;

    @BeforeEach
    void setup() {
        tipCalculator = new TipCalculator(0.1);
    }

    @Test
    void testPerfectMatch_MaxTipAtLowDifficulty() {
        double tip = tipCalculator.calculateCurvedTip("rice bowl with beef", "rice bowl with beef");

        // grade = 1
        // curveStrength = 1 + 0.1 * 3 = 1.3
        // curvedGrade = 1^1.3 = 1
        // tip = BASE_TIP * 1 * (1 - 0.1) = 2 * 0.9 = 1.8

        assertEquals(1.8, tip, 1e-6);
    }

    @Test
    void testTipForNoMatch() {
        double tip = tipCalculator.calculateCurvedTip("beans and chipotle mayo", "rice bowl with beef");

        assertEquals(0.0, tip, 1e-6);
    }

    @Test
    void testTipAlwaysNonNegative() {
        double tip = tipCalculator.calculateCurvedTip("ummm idk", "rice bowl");

        assertTrue(tip >= 0);
    }
}
