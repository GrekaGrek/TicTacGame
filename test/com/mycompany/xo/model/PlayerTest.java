package com.mycompany.xo.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlayerTest {
    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Anatolik";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void tesGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}