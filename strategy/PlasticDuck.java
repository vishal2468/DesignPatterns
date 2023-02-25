package strategy;

public class PlasticDuck extends Duck{

    public PlasticDuck() {
        super(new NoFly(), new NoQuack(), new GraphicDisplay());
    }
    
}
