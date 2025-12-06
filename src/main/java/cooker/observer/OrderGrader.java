package cooker.observer;

import cooker.FoodOrder;
import cooker.PlayerProfile;

public class OrderGrader implements InputObserver {
    private FoodOrder expected;

    public OrderGrader(FoodOrder expected) {
        this.expected = expected;
    }

    @Override
    public void update(String input) {
        int accuracy = calculateAccuracy(input, expected.toString());
        int tip = accuracy / 10;
        PlayerProfile.getInstance().addMoney(tip);
        PlayerProfile.getInstance().addScore(accuracy);

        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println("Tip earned: $" + tip);
    }

    private int calculateAccuracy(String input, String expected) {
        int matches = 0;
        for (int i = 0; i < Math.min(input.length(), expected.length()); i++)
            if (input.charAt(i) == expected.charAt(i)) matches++;
        return (int) ((matches / (double) expected.length()) * 100);
    }
}

