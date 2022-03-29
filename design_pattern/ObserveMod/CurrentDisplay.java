package design_pattern.ObserveMod;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:50
 */
public class CurrentDisplay  implements Observer{
    float temperature;
    float humidity;
    private WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void removeRigister() {
        weatherData.removeObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity =humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentDisplay: "+ " temperature- " + temperature + " humidity- " +humidity);
    }
}
