package design_pattern.ObserveMod;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-19:03
 */
public class StaticDisplay implements Observer{
    int count = 0;
    float temperature;
    float humidity;
    WeatherData weatherData;

    public StaticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void remove(){
        weatherData.removeObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        count++;
        this.temperature += temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("StaticDisplay: " + "avgTemp-" + (temperature / count) + " avgHumidity " + (humidity/count));
    }
}
