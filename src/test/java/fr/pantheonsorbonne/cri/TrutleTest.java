package fr.pantheonsorbonne.cri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrutleTest {

    @Test
    void eatApple() throws SadTurtleException {
        Tree t = new Tree();
        t.addApple(new Apple());
        Turtle turtle = new Turtle(t);
        turtle.eatApple();
    }

    @Test
    void eatAppleNoApple() throws SadTurtleException {
        Tree t = new Tree();

        Turtle turtle = new Turtle(t);
        Assertions.assertThrows(SadTurtleException.class, () -> {
            turtle.eatApple();
        });

    }

    @Test
    void eatAppleOnlyTrognon() throws SadTurtleException {
        Tree t = new Tree();
        t.addApple(new Apple());
        t.addApple(new Apple());
        t.eatAllApplesOnTheTree();
        Turtle turtle = new Turtle(t);
        Assertions.assertThrows(SadTurtleException.class, () -> {
            turtle.eatApple();
        });

    }
}