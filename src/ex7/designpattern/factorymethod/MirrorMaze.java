package ex7.designpattern.factorymethod;

public class MirrorMaze extends Maze {

    @Override
    protected Room createRoom() {
        return new MirrorRoom();
    }
}
