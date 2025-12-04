package cooker.observer;

import java.util.ArrayList;
import java.util.List;

public class EventObservable {
    private List<InputObserver> observers = new ArrayList<>();

    public void addObserver(InputObserver o) {
        observers.add(o);
    }

    public void notifyObservers(String input) {
        for (InputObserver o : observers) {
            o.update(input);
        }
    }
}
