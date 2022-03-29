package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-20:56
 */
public class RedDuck extends Duck{
    public RedDuck() {
        this.flyable = new FlyWith();
        this.quark= new QuarkNoWay();
    }
}
