package strategy;

public class NoQuack implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack Simply");

    }

}
