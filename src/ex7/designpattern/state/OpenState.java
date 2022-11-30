package ex7.designpattern.state;

public class OpenState extends DoorState {

    public OpenState(Door d) {
        super(d);
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
