package ex6.multithreading;

public class PI implements Runnable {

    private Buffer[] buffers;
    private String[] commands;

    public PI(Buffer[] buffers, String[] commands){
        this.buffers = buffers;
        this.commands = commands;
    }


    // commands are provider as [" ,ch", ...]
    @Override
    public void run() {
        for(int i = 0; i < commands.length; i++){
            String command = commands[i];
            int bufferIndex = Integer.
                    parseInt(String.valueOf(command.charAt(0)));
            char ch = command.charAt(2);
            buffers[bufferIndex].put(ch);
            System.out.println("Inserted char "+ch+" in buffer "+bufferIndex);
        }
    }
}
