package cooker.Strategy;

import cooker.TipCalculator;

public class HardGame implements DifficultyStrategy{
    TipCalculator tipCalculator = new TipCalculator(HARD_DIFFICULTY);

    @Override
    public void calculateUserTip(String userOrderInput, String correctOrder) {
        tipCalculator.calculateCurvedTip(userOrderInput, correctOrder);
    }
}

