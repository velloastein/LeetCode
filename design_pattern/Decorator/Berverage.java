package design_pattern.Decorator;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-17:33
 */
//抽象类：饮料
public abstract class Berverage {
    public abstract String getDescription();
    public abstract double cost();
}

//实现类：组件一（浓咖啡）
class Espresso extends Berverage{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}

//实现类：组件饮料二（混合）
class HouseBlend extends Berverage{

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

//实现类：组件饮料三（深焙）
class DarkRoast extends Berverage{

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}

//实现类：组件饮料三(无咖啡因）
class Decaf extends Berverage{

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
