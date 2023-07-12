package state;

public class Gate {

    GateState gateState;

    public Gate() {
        this.gateState = new OpenGateState(this);
    }

    void enter() {
        this.gateState.enter();
    }

    void pay() {
        this.gateState.pay();
    }

    void payOk() {
        this.gateState.payOk();
    }

    void payFailed() {
        this.gateState.payFailed();
    }

    public void changeGateState(GateState gateState) {
        this.gateState = gateState;
    }
}
