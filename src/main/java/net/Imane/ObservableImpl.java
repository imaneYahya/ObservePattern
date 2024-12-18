package net.Imane;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private int state=0;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.updateObservable(state);
        }

    }



    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
