package Store;

import abstracts.Observer;
import abstracts.SalesSubject;
import abstracts.TShirt;

import java.util.ArrayList;
import java.util.List;

public class Store implements SalesSubject {
    private static Store instance; // Singleton
    private List<Observer> observers = new ArrayList<>();
    private int smallCount = 0;
    private int mediumCount = 0;
    private int largeCount = 0;

    private Store() {}

    public static Store getInstance() {
        if (instance == null) {
            synchronized (Store.class) {
                if (instance == null) {
                    instance = new Store();
                }
            }
        }
        return instance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(smallCount, mediumCount, largeCount);
        }
    }

    public void sellTShirt(TShirt tShirt) {
        switch(tShirt.formSize().toLowerCase()) {
            case "small":
                smallCount++;
                break;
            case "medium":
                mediumCount++;
                break;
            case "large":
                largeCount++;
                break;
        }
        notifyObservers();
    }
}
