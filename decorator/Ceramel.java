package decorator;

public class Ceramel extends AddOnDecorator {

    Beverage beverage;

    public Ceramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

}
