package design_pattern.ObserveMod;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:32
 */
//观察者类
public interface Observer {
    void update(float temp, float humidity, float pressure);
    void display();
}
