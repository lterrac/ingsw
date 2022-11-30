package ex7.designpattern.state;

public class ClosingState extends DoorState {

    public ClosingState(Door door) {
        super(door);
    }

    @Override
    public void complete() {

    }

    @Override
    public void touch() {

    }

    @Override
    public void timeout() {

    }
}
