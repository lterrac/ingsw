package ex7.designpattern.state;

public class ClosedState extends DoorState {

    public ClosedState(Door d) {
        super(d);
    }


    @Override
    public void touch() {
        door.setState(new OpeningState(door));
    }

}
