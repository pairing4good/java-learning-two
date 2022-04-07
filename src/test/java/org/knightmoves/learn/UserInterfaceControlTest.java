package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserInterfaceControlTest {

    @Test
    public void shouldDisableTheControl(){
        UserInterfaceControl userInterfaceControl = new UserInterfaceControl();
        userInterfaceControl.disable();

        assertFalse(userInterfaceControl.isEnabled());
    }


    @Test
    public void shouldDisableUserInterfaceControlChild(){
        UserInterfaceControl userInterfaceControl = new TextBox();
        userInterfaceControl.disable();

        assertFalse(userInterfaceControl.isEnabled());
    }

}