package org.knightmoves.learn;

public class UserInterfaceControl {

    private boolean isEnabled = true;

    public UserInterfaceControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UserInterfaceControl");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
