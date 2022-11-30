package ex7.socket;

import java.io.*;
import java.net.Socket;

public class ServeOneClient implements Runnable {

    private Socket socket;
    private BufferedReader inSocket;
    private PrintWriter outSocket;
    public ServeOneClient(Socket socket){
        this.socket = socket;
        try {
            inSocket = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));
            outSocket = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(!login()) {
            System.out.println("Login unsuccessful");
        }

        try {
            play();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean login(){
        // TODO: implement
        return true;
    }

    private void play() throws IOException {
        boolean ok = true;
        int l = 1;

        while(ok){
            String seq = generateSequence(l);
            outSocket.println(seq);
            String clientSeq = inSocket.readLine();
            if (seq.equals(clientSeq))
                outSocket.println("true");
            else {
                outSocket.println("false");
                ok = false;
            }
            l++;
        }
    }

    public String generateSequence(int l){
        String res = "";
        for(int i = 0; i < l; i++){
            int num = (int) (Math.random()*10);
            res += num;
        }
        return res;
    }
}
