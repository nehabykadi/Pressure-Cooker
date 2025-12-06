package cooker;

public class PlayerProfile {
    private static PlayerProfile instance;
    private double money;
    private int score;

    private PlayerProfile() {}

    public static PlayerProfile getInstance() {
        if (instance == null) {
            instance = new PlayerProfile();
        }
        return instance;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double amount){
        this.money += amount;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int amount){
        this.score += amount;
    }

}
