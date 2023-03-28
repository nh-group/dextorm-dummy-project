package fr.pantheonsorbonne.ufr27.cri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class TreeTest {


    @Test
    void addApple() {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Tree tree = new Tree();
        tree.addApple(a1);
        tree.addApple(a2);
        Assertions.assertTrue(tree.hasApples());

    }

    @Test
    void treeShake() {
        Tree t = new Tree();
        for (int i = 0; i < 100; i++) {
            t.addApple(new Apple());
        }
        Set<Apple> collector = new HashSet<>();
        while (t.hasApples()) {
            collector.addAll(t.shakeTree());
        }

        Assertions.assertEquals(100, collector.size());
    }

    @Test
    void pickApple() {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Tree tree = new Tree();
        tree.addApple(a1);
        tree.addApple(a2);
        {
            Apple a = tree.pickApple();
            Assertions.assertTrue(a1 == a || a2 == a);
        }
        {
            Apple a = tree.pickApple();
            Assertions.assertTrue(a1 == a || a2 == a);
        }
        {
            Apple a = tree.pickApple();
            Assertions.assertNull(a);
        }
    }

    @Test
    void eatAllApplesOnTheTree() throws TrognonException {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Tree tree = new Tree();
        tree.addApple(a1);
        tree.addApple(a2);
        tree.eatAllApplesOnTheTree();

        Assertions.assertThrows(TrognonException.class, () -> {
            tree.pickApple().takeABite();
        });

    }
}