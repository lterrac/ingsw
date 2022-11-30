package ex7.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public final static int PORT = 3000;
    public static int clientNum = 1;
    public Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server waiting on port "+PORT+"...");
            while(true){

                Socket socket = serverSocket.accept();
                System.out.println("Client "+(clientNum++)+" is connecting");
                new Thread(new ServeOneClient(socket)).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        new Server();
    }

}
