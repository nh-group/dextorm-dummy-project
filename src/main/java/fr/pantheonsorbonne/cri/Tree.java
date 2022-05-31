package fr.pantheonsorbonne.cri;

import java.util.*;

public class Tree {

    Set<Apple> apples = new LinkedHashSet<>();


    public void addApple(Apple apple) {
        apples.add(apple);
    }

    public Apple pickApple() {
        //check if the apples are empty or not
        if (!this.apples.isEmpty()) { //if there is some apple on the tree
            Apple res = this.apples.iterator().next(); //get the first one (not assumptoin on the order)
            this.apples.remove(res);
            return res;
        }
        return null;// if something goes bad

    }

    public void eatAllApplesOnTheTree() {
        for (Apple apple : this.apples) { //loop on all the apples
            try {
                while (true) {
                    apple.takeABite(); // this will reduce the radius of the apple
                }
            } catch (TrognonException t) { // this is where the exception is caught
                //we reached the trognon, stop eating!
            }
        }
    }

    public boolean hasApples() {
        return this.apples.size() > 0;
    }

    public Set<Apple> shakeTree() {
        LinkedList<Apple> apples = new LinkedList<>(this.apples);
        Set<Apple> res = new HashSet<>();
        Collections.shuffle(apples);
        Random random = new Random();
        int fallingApples = random.nextInt(apples.size());
        for (int i = 0; i <= fallingApples; i++) {
            res.add(apples.poll());
        }
        this.apples.removeAll(res);
        return res;


    }
}
