package ex7.socket;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader inSocket;
    private PrintWriter outSocket;
    private BufferedReader inKeyboard;

    public Client() throws IOException {
        socket = new Socket("localhost", Server.PORT);
        inSocket = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));
        outSocket = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream())), true);
        inKeyboard = new BufferedReader(new InputStreamReader(System.in));

        try {
            play();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        socket.close();
    }

    private void play() throws IOException, InterruptedException {
        System.out.println("Partita iniziata");
        System.out.println("Leggi i numeri, memorizzali, e riscrivili");

        boolean ok = true;

        while(ok){
            String serverSeq = inSocket.readLine();
            System.out.println(serverSeq);
            Thread.sleep(500);
            generateSpace();
            String seq = inKeyboard.readLine();
            outSocket.println(seq);
            ok = Boolean.valueOf(inSocket.readLine()).booleanValue();
        }

        System.out.println("Hai perso!");
    }

    private void generateSpace() {
        for(int i = 0; i < 500; i++)
            System.out.println("");
    }


    public static void main(String[] args){
        try {
            new Client();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
