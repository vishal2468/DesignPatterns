package strategy;

public class NoFly implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("no fly");
    }
    
}
