package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    int temperature;

    List<IObserver> observers=new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer:observers){
            observer.update();
        }
    }

    public int getTemprature(){
        return this.temperature;
    }
    
}
