package cooker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraderTest {
    private static Grader grader;
    private static double difficulty;

    @BeforeEach
    void createGrader(){
        difficulty = 0.05;
        grader = new Grader(difficulty);
    }

    @Test
    public void testGradeInput_LCSSimilarityCalculation() {
        String input   = "Hi there, I am Victoria";
        String correct = "Hello there, I am victoria";

        double grade = grader.gradeInput(input, correct);

        int longetCommonSubsequence = 4;
        int totalWords = 5;

        double similarity = (double) longetCommonSubsequence / totalWords;
        int numWordsWrong = totalWords - longetCommonSubsequence;
        double penalty = numWordsWrong * difficulty;
        double expected = Math.max(0, similarity - penalty);

        assertEquals(expected, grade, 1e-6);
    }
}
