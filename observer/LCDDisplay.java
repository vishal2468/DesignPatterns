package observer;

public class LCDDisplay implements IObserver{

    WeatherStation weatherStation;

    @Override
    public void update() {
        display(weatherStation.getTemprature());
    }

    public void display(int temprature){
        System.out.println(temprature);
    }
    
}
