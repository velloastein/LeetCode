package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-20:47
 */
public abstract class Duck {
    Flyable flyable;
    Quarkable quark;

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuark(Quarkable quark) {
        this.quark = quark;
    }

    public void swim() {
        System.out.println("can swimming!");
    }
    public void fly(){
        flyable.fly();
    }

    public void quark() {
        quark.quark();
    }
}
