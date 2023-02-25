package decorator;

public class Chocolate extends AddOnDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 5 + this.beverage.cost();
    }

}
