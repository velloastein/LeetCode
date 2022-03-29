package design_pattern.Decorator;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/24-18:07
 */

//抽象类：调料
public abstract class CondimentDecorator extends Berverage{

}

//实现类：调料一
class Mocha extends CondimentDecorator {
    public Berverage berverage;

    public Mocha(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + " Mocha ";
    }

    @Override
    public double cost() {
        return berverage.cost() + 0.1;
    }
}

//实现类：调料二
class Whip extends CondimentDecorator {
    public Berverage berverage;

    public Whip(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + " Whip ";
    }

    @Override
    public double cost() {
        return berverage.cost() + 0.1;
    }
}

//实现类：调料三
class Soy extends CondimentDecorator {
    public Berverage berverage;

    public Soy(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + " Soy ";
    }

    @Override
    public double cost() {
        return berverage.cost() + 0.1;
    }
}

//实现类：调料四
class Milk extends CondimentDecorator {
    public Berverage berverage;

    public Milk(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + " Milk";
    }

    @Override
    public double cost() {
        return berverage.cost() + 0.1;
    }
}

//实现类：加杯子
class Cup extends CondimentDecorator {
    public Berverage berverage;

    //三种：<=0 1 >1
    private int cup;

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public Cup(Berverage berverage, int cup) {
        this.berverage = berverage;
        this.cup = cup;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() ;
    }

    @Override
    public double cost() {
        if (cup <= 0) {
            return berverage.cost()+ 1;
        } else if (cup == 1) {
            return berverage.cost() + 2;
        } else {
            return berverage.cost() + 3;
        }
    }
}


