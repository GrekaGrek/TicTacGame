package com.mycompany.xo.controllers;

import com.mycompany.xo.model.Field;
import com.mycompany.xo.model.Figure;
import com.mycompany.xo.model.exceptions.InvalidPointException;
import com.mycompany.xo.model.exceptions.OccupiedException;

import java.awt.*;

public class MoveController {

    public void applyFigure(
            final Field field, final Figure figure,
            final Point point) throws InvalidPointException,
            OccupiedException {

        if(field.getFigure(point) != null) {
            throw new OccupiedException();
        }
        field.setFigure(point, figure);
    }
}
