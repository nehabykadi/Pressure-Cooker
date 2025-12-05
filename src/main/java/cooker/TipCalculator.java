package cooker;

public class TipCalculator {
    private double difficulty;
    private Grader grader;
    private static final double BASE_TIP = 2.0;

    public TipCalculator() {
        this(0.1);
    }

    public TipCalculator(double difficulty) {
        this.difficulty = difficulty;
        this.grader = new Grader(difficulty);
    }

    public double calculateCurvedTip(String input, String correct){
        double grade = grader.gradeInput(input, correct);

        double curveStrength = 1 + difficulty * 3;
        double curvedGrade = Math.pow(grade, curveStrength);

        double difficultyMultiplier = 1.0 - difficulty;

        double tip = BASE_TIP * curvedGrade * difficultyMultiplier;

        return tip;
    }

}
