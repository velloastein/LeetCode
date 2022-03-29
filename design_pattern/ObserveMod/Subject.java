package design_pattern.ObserveMod;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:31
 */
//主体类
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
