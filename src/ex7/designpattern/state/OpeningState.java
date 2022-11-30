package ex7.designpattern.state;

public class OpeningState extends DoorState {

    public OpeningState(Door d) {
        super(d);
    }

    @Override
    public void complete() {
        door.setState(new OpenState(door));
    }

    @Override
    public void touch() {
        door.setState(new ClosingState(door));
    }

    @Override
    public void timeout() {

    }
}
