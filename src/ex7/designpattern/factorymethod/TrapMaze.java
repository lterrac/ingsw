package ex7.designpattern.factorymethod;

public class TrapMaze extends Maze {
    @Override
    protected Room createRoom() {
        return new TrapRoom();
    }
}
