package design_pattern.Decorator;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:15
 */
public class Test {
    public static void main(String[] args) {
        //点一杯浓咖啡
        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
        //加调料
        Mocha mocha = new Mocha(espresso);
        Milk milk = new Milk(mocha);
        Whip whip = new Whip(milk);
        Soy soy = new Soy(whip);
        System.out.println(soy.getDescription());
        System.out.println(soy.cost());
        //加杯子钱
        Cup cup = new Cup(soy,4);
        System.out.println(cup.getDescription());
        System.out.println(cup.cost());

    }

}
