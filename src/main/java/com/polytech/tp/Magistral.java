package com.polytech.tp;

import com.polytech.*;

public class Magistral extends CoursDecorator {
    public Magistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " [Magistral]";
    }

    @Override
    public double getDuree() {
        // Un cours magistral est souvent plus long - ajoutons 0.5 heure
        return coursDecorated.getDuree() + 0.5;
    }
}