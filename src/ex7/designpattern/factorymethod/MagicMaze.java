package ex7.designpattern.factorymethod;

public class MagicMaze extends Maze {
    @Override
    protected Room createRoom() {
        return new MagicRoom();
    }
}
