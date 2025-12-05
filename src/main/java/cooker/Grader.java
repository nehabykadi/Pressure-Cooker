package cooker;

public class Grader {
    private double difficulty;

    public Grader(double difficulty) {
        this.difficulty = difficulty;
    }

    public double gradeInput(String input, String correct) {
        String[] inputWordsAsArray = input.trim().split("\\s+");
        String[] correctWordsAsArray = correct.trim().split("\\s+");

        int longestCommonStrings = longestCommonSubsequence(inputWordsAsArray, correctWordsAsArray);
        int totalCorrectLength = correctWordsAsArray.length;

        double similarityScore = (double) longestCommonStrings / totalCorrectLength;

        int wordsWrong = totalCorrectLength - longestCommonStrings;
        double penalty = wordsWrong * difficulty;

        double score = findFinalScore(similarityScore, penalty);
        return score;
    }

    private double findFinalScore(double similarityScore, double penalty) {
        return Math.max(0, similarityScore - penalty);
    }


    private int longestCommonSubsequence(String[] input, String[] correct) {
        int inputLength = input.length;
        int correctLength = correct.length;

        int[][] lookUpTable = new int[inputLength + 1][correctLength + 1];

        for (int inputIndex = 1; inputIndex <= inputLength; inputIndex++) {
            for (int correctStringIndex = 1; correctStringIndex <= correctLength; correctStringIndex++) {
                if (input[inputIndex - 1].equalsIgnoreCase(correct[correctStringIndex - 1])) {
                    lookUpTable[inputIndex][correctStringIndex] = lookUpTable[inputIndex - 1][correctStringIndex - 1] + 1;
                } else {
                    lookUpTable[inputIndex][correctStringIndex] = Math.max(lookUpTable[inputIndex - 1][correctStringIndex], lookUpTable[inputIndex][correctStringIndex - 1]);
                }
            }
        }

        return lookUpTable[inputLength][correctLength];
    }

}
