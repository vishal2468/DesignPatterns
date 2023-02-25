package strategy;

public class CityDuck extends Duck{

    public CityDuck() {
        super(new SimpleFly(), new SimpleQuack(), new GraphicDisplay());
    }
    
}
