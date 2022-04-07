package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextBoxTest {

    @Test
    public void shouldCreateInstance(){
        TextBox textBox = new TextBox();
        textBox.setText("Box 1");

        assertEquals("Box 1", textBox.getText());
    }

    @Test
    public void shouldReturnNull_WhenTextNotSet(){
        TextBox textBox = new TextBox();
        assertNull(textBox.getText());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowException_WhenCallingMethodOnNull(){
        TextBox textBox = new TextBox();
        assertNull(textBox.getText().toUpperCase());
    }

    @Test
    public void shouldCreateDifferentInstance(){
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");

        assertEquals("Box 1", textBox1.getText());
        assertEquals("Box 2", textBox2.getText());
    }

    @Test
    public void shouldReferenceSameInstance(){
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = textBox1;

        textBox2.setText("Hello World");

        assertEquals("Hello World", textBox1.getText());
        assertSame(textBox1, textBox2);
    }
}
