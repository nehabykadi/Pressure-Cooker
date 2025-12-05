package cooker.observer;

import java.util.Scanner;

public interface InputObserver {
    static final Scanner scanner = new Scanner(System.in);

    void update(String input);

    public static String getUserInput() {
        return scanner.nextLine();
    }
}
