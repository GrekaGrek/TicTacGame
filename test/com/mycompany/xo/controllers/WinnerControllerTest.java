package com.mycompany.xo.controllers;

import com.mycompany.xo.model.Field;
import com.mycompany.xo.model.Figure;
import org.junit.Test;
import java.awt.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;


public class WinnerControllerTest {

    @Test
    public void testGetWinnerInRow() throws Exception {

        final WinnerController wc = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.X, wc.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerNotInRow() throws Exception {

        final WinnerController wc = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.O);

            assertNull(wc.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerInColumn() throws Exception {

        final WinnerController wc = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);

            assertEquals(Figure.X, wc.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerNotInColumn() throws Exception {

        final WinnerController wc = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);

            assertNull(wc.getWinner(field));
        }
    }

    @Test
    public void testGetWinnerInDiagon1() throws Exception {

        final WinnerController wc = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.X);

            assertEquals(Figure.X, wc.getWinner(field));
    }

    @Test
    public void testGetWinnerNotInDiagon1() throws Exception {

        final WinnerController wc = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.O);

            assertNull(wc.getWinner(field));
    }

    @Test
    public void testGetWinnerInDiagon2() throws Exception {

        final WinnerController wc = new WinnerController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.X);

        assertEquals(Figure.X, wc.getWinner(field));
    }

    @Test
    public void testGetWinnerNotInDiagon2() throws Exception {

        final WinnerController wc = new WinnerController();

        final Field field = new Field(3);
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.O);

        assertNull(wc.getWinner(field));
    }
}