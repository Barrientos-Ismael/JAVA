package org.barrientos.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void eliminar (Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }

    public void notifyObservers(Object obj){
        for (Observer obs: this.observers){
            obs.update(this, obj);
        }
    }

}
