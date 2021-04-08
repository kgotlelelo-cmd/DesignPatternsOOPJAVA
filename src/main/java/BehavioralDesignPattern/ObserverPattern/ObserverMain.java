package BehavioralDesignPattern.ObserverPattern;

public class ObserverMain {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setPressure(100);
        station.setTemperature(200);
        station.setHumidity(300);
    }
}
