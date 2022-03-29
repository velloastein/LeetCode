package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-21:04
 */
public class BlackDuck extends Duck{
    public BlackDuck() {
        this.flyable = new FlyNoWay();
        this.quark = new QuarkWith();
    }
}
