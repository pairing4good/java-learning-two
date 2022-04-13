package org.knightmoves.learn;

public abstract class UserInterfaceControl {

    private boolean isEnabled = true;

    public abstract String render();

    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
