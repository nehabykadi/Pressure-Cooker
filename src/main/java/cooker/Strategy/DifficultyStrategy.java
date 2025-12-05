package cooker.Strategy;

import cooker.Grader;
import cooker.TipCalculator;

public interface DifficultyStrategy {
    static double EASY_DIFFICULTY = 0.1;
    static double MEDIUM_DIFFICULTY = 0.3;
    static double HARD_DIFFICULTY = 0.6;

    TipCalculator tipCalculator;

    void calculateUserTip(String userOrderInput, String correctOrder);
}
