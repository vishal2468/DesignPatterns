package strategy;

public class Duck {
    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;
    IDisplayBehaviour iDisplayBehaviour;

    public Duck(IFlyBehaviour iFlyBehaviour, IQuackBehaviour iQuackBehaviour, IDisplayBehaviour iDisplayBehaviour) {
        this.iFlyBehaviour = iFlyBehaviour;
        this.iQuackBehaviour = iQuackBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public void executeFly() {
        this.iFlyBehaviour.fly();
    }

    public void executeQuack() {
        this.iQuackBehaviour.quack();
    }

    public void executeDisplay() {
        this.iDisplayBehaviour.display();
    }
}