package cooker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerProfile playerProfile = PlayerProfile.getInstance();
        OrderFactory orderFactory = new OrderFactory();
        TipCalculator tipCalculator = new TipCalculator();
        Scanner scanner = new Scanner(System.in);
        PressureCooker game = new PressureCooker(playerProfile, orderFactory, tipCalculator, scanner);
        game.playGame();
    }
}

