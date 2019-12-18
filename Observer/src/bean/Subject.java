package bean;

public interface Subject {
    void addObserver(Observer observer);

    void notifyAllObservers();

    void removeObserver(Observer observer);
}
