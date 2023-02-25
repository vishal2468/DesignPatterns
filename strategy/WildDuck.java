package strategy;

public class WildDuck extends Duck{

    public WildDuck() {
        super(new SimpleFly(), new SimpleQuack(), new TextDisplay());
    }
    
}