package ex7.designpattern.singleton;

public class PrintManager {

    private static PrintManager instance = new PrintManager();

    private PrintManager(){ }

    public static PrintManager getInstance(){
        return instance;
    }

}
