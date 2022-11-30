package ex7.designpattern.state;

public class Door implements IDoor {

    private DoorState state;

    public Door(){
        state = new ClosedState(this);
    }

    @Override
    public void complete() {
        state.complete();
    }

    @Override
    public void touch() {
        state.touch();
    }

    @Override
    public void timeout() {
        state.timeout();
    }

    public void setState(DoorState state) {
        this.state = state;
    }


    public static void main(String[] args){

        Door d = new Door();
        d.timeout();
        d.complete();
        d.touch();
        d.touch();

        System.out.println(d.state);

    }
}
