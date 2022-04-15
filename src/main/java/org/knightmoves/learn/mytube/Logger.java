package org.knightmoves.learn.mytube;

public class Logger implements Loggable{

    private final StringBuffer output;

    public Logger(){
        output = new StringBuffer();
    }

    @Override
    public void log(String message) {
        output.append(message + "\n");
    }

    @Override
    public String read() {
        return output.toString();
    }
}
