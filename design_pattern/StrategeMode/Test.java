package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-21:01
 */
public class Test {
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.quark();
        redDuck.fly();
        redDuck.swim();
        redDuck.setFlyable(new FlyNoWay());
        redDuck.fly();
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.fly();
        blackDuck.swim();
        blackDuck.quark();
    }
}
