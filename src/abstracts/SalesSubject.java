package abstracts;

public interface SalesSubject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
