package cooker;

public class PlayerProfile {
    private static PlayerProfile instance;
    private int money;
    private int score;

    private PlayerProfile() {}

    public static PlayerProfile getInstance() {
        if (instance == null) {
            instance = new PlayerProfile();
        }
        return instance;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount){
        this.money += amount;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int amount){
        this.score += amount;
    }

}
