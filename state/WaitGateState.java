package state;

public class WaitGateState implements GateState {

    Gate gate;

    public WaitGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enter'");
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
