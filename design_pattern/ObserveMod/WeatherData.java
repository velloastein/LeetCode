package design_pattern.ObserveMod;

import java.util.ArrayList;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:37
 */
public class WeatherData implements Subject{
    private float temperature;
    //湿度
    private float humidity;
    private float pressure;
    ArrayList<Observer> arrayList;


    public WeatherData() {
        this.arrayList = new ArrayList<>();
    }

    public WeatherData(float temperature, float humidity, float pressure) {
        arrayList = new ArrayList<>();
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer p : arrayList) {
            p.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
