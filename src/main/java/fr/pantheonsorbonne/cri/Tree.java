package fr.pantheonsorbonne.cri;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tree {

    Set<Apple> apples = new LinkedHashSet<>();


    public void addApple(Apple apple) {
        apples.add(apple);
    }

    public Apple pickApple() {
        if (!this.apples.isEmpty()) {
            Apple res = this.apples.iterator().next();
            this.apples.remove(res);
            return res;
        }
        return null;

    }

    public void eatAllApplesOnTheTree() {
        for (Apple apple : this.apples) {
            try {
                while (true) {
                    apple.takeABite();
                }
            } catch (TrognonException t) {
                //we reached the trognon, stop eating!
            }
        }
    }

    public boolean hasApples() {
        return this.apples.size() > 0;
    }
}
