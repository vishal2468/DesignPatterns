package state;

public class Gate {

    GateState gateState;

    void Gate(){
        this.gateState=new OpenGateState();
    }

    void enter(){
        this.gateState.enter();
    }
    void pay(){
        this.gateState.pay();
    }
    void payOk(){
        this.gateState.payOk();
    }
    void payFailed(){
        this.gateState.payFailed();
    }

    public void changeGateState(GateState gateState) {
        this.gateState=gateState;
    }
}
