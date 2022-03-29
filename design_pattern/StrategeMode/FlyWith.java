package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-20:53
 */
public class FlyWith implements Flyable{
    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
