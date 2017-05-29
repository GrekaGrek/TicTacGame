package com.mycompany.xo.controllers;

import com.mycompany.xo.model.Field;
import com.mycompany.xo.model.Figure;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class CurrentMoveControllerTest {
    @Test
    public void CurrentMoveTestNextMoveO() throws Exception {
        final CurrentMoveController cmc = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.O, cmc.currentMove(field));
        }
    }

    @Test
    public void CurrentMoveTestNextMoveX() throws Exception {
        final CurrentMoveController cmc = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.X, cmc.currentMove(field));
        }
    }

    @Test
    public void CurrentMoveTestNoMove() throws Exception {
        final CurrentMoveController cmc = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(0, 1), Figure.O);
            field.setFigure(new Point(0, 2), Figure.X);
            field.setFigure(new Point(1, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.O);
            field.setFigure(new Point(1, 2), Figure.X);
            field.setFigure(new Point(2, 0), Figure.X);
            field.setFigure(new Point(2, 1), Figure.O);
            field.setFigure(new Point(2, 2), Figure.X);

            assertNull(cmc.currentMove(field));
        }
    }
}