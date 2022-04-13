package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserInterfaceControlTest {

    @Test
    public void shouldDisableTheControl(){
        UserInterfaceControl userInterfaceControl = new TextBox();
        userInterfaceControl.disable();

        assertFalse(userInterfaceControl.isEnabled());
    }


    @Test
    public void shouldDisableUserInterfaceControlChild(){
        UserInterfaceControl userInterfaceControl = new TextBox();
        userInterfaceControl.disable();

        assertFalse(userInterfaceControl.isEnabled());
    }

    @Test
    public void shouldPolymorphiclyUseUserInterfaceControls(){
        UserInterfaceControl[] controls = {new TextBox(), new CheckBox()};

        String output = "";

        for(UserInterfaceControl control : controls){
            output += control.render() + "\n";
        }

        assertEquals("Render TextBox\nRender Checkbox\n", output);
    }
}