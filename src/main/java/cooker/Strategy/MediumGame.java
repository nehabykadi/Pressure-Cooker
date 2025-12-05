package cooker.Strategy;

import cooker.TipCalculator;

public class MediumGame implements DifficultyStrategy {
    TipCalculator tipCalculator = new TipCalculator(MEDIUM_DIFFICULTY);

    @Override
    public void calculateUserTip(String userOrderInput, String correctOrder) {
        tipCalculator.calculateCurvedTip(userOrderInput, correctOrder);
    }

}
