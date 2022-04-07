package org.knightmoves.learn;

public class TextBox extends UserInterfaceControl{

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void clear() {
        text = "";
    }
}
