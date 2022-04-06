package org.knightmoves.learn;

import org.junit.Test;
import org.knightmoves.learn.TextBox;

import java.util.Locale;

import static org.junit.Assert.*;

public class TextBoxTest {

    @Test
    public void shouldCreateInstance(){
        TextBox textBox = new TextBox();
        textBox.setText("Box 1");

        assertEquals("Box 1", textBox.text);
    }

    @Test
    public void shouldReturnNull_WhenTextNotSet(){
        TextBox textBox = new TextBox();
        assertNull(textBox.text);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowException_WhenCallingMethodOnNull(){
        TextBox textBox = new TextBox();
        assertNull(textBox.text.toUpperCase());
    }

    @Test
    public void shouldCreateDifferentInstance(){
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");

        assertEquals("Box 1", textBox1.text);
        assertEquals("Box 2", textBox2.text);
    }

    @Test
    public void shouldReferenceSameInstance(){
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = textBox1;

        textBox2.setText("Hello World");

        assertEquals("Hello World", textBox1.text);
        assertSame(textBox1, textBox2);
    }
}