package cooker;

import cooker.observer.EventObservable;
import cooker.observer.OrderGrader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverTest {
    @Test
    void testObserverReceivesInput() {
        EventObservable subject = new EventObservable();
        FoodOrder expected = new FoodOrder.OrderBuilder()
                .setBase("Rice")
                .setProtein("Chicken")
                .setSauce("BBQ")
                .build();

        OrderGrader grader = new OrderGrader(expected);
        subject.addObserver(grader);

        String input = expected.toString();
        subject.notifyObservers(input);

        PlayerProfile player = PlayerProfile.getInstance();

        assertTrue(player.getScore() > 0, "Score should increase");
        assertTrue(player.getMoney() > 0, "Money (tips) should increase");
    }
}
