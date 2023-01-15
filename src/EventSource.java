import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class EventSource {
    private final List<Observer> observers = new ArrayList<>();

    protected void notify(String event) {
        for (Observer o : observers) o.update(event);
    }

    public void addObserver(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observer != null)
            observers.remove(observer);
    }
}