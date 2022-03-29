package design_pattern.ObserveMod;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-19:34
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10, 11, 45);
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);
        weatherData.notifyObservers();
        weatherData.setMeasurements(12,88,1020);
        weatherData.setMeasurements(4327,7324,543);
        currentDisplay.removeRigister();
        weatherData.notifyObservers();
    }
}
