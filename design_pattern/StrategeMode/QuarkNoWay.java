package design_pattern.StrategeMode;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-20:55
 */
public class QuarkNoWay implements Quarkable{
    @Override
    public void quark() {
        System.out.println("No Quarkking!");
    }
}
