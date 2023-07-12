package state;

public class OpenGateState implements GateState {

    Gate gate;

    public OpenGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        this.gate.changeGateState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    @Override
    public void payOk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payOk'");
    }

    @Override
    public void payFailed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payFailed'");
    }

}
