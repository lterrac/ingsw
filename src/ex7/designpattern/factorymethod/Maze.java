package ex7.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Maze {

    private List<Room> rooms;
    private final int N = 50;

    public Maze(){
        rooms = new ArrayList<>(N);

        for(int i = 0; i < N; i++){
            rooms.add(createRoom());
        }
    }

    abstract protected Room createRoom();


    public static void main(String[] args){
        MagicMaze maze = new MagicMaze();
    }
}
