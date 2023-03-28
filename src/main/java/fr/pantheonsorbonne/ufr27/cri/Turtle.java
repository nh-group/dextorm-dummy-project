package fr.pantheonsorbonne.ufr27.cri;

public class Turtle {
    private final Tree tree;

    public Turtle(Tree t) {
        this.tree = t;
    }

    public void eatApple() throws SadTurtleException {
        if (!this.tree.hasApples()) {
            throw new SadTurtleException();
        }
        Apple apple = this.tree.shakeTree().iterator().next();
        try {
            apple.takeABite();
        } catch (TrognonException e) {
            throw new SadTurtleException();
        }
    }
}
