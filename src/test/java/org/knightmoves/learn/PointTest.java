package org.knightmoves.learn;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void differntInstancesShouldNotBeEqualBecauseTheyAreComparedByReference(){
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertFalse(point1 == point2);
    }

    @Test
    public void shouldUseOverriddenEqualsAndHashCode(){
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertTrue(point1.equals(point2));
    }

}