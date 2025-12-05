package cooker.Strategy;

import cooker.Grader;
import cooker.TipCalculator;

public class EasyGame implements DifficultyStrategy{
    TipCalculator tipCalculator = new TipCalculator(EASY_DIFFICULTY);

    @Override
    public void calculateUserTip(String userOrderInput, String correctOrder) {
        tipCalculator.calculateCurvedTip(userOrderInput, correctOrder);
    }
}
