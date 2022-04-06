package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class BrowserTest {

    @Test
    public void should(){
        Browser browser = new Browser();
        String response = browser.navigate("www.google.com");
        assertEquals("<html></html>", response);
    }

}