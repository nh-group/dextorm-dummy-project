package fr.pantheonsorbonne.cri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppleTest {

    @Test
    void getColour() {
        {
            Apple apple = new Apple();
            assertEquals(apple.getColour(), Apple.DEFAULT_COLOUR);
        }
        {
            Apple apple = new Apple("GREEN", 5);
            assertEquals(apple.getColour(), "GREEN");
        }
    }

    @Test
    void getRadius() {
        {
            Apple apple = new Apple();
            assertEquals(apple.getRadius(), Apple.DEFAULT_RADIUS);
        }
        {
            Apple apple = new Apple(Apple.DEFAULT_COLOUR, 5);
            assertEquals(apple.getRadius(), 5);
        }
    }

    @Test
    void takeABite() throws TrognonException {
        {
            Apple apple = new Apple();
            apple.takeABite();
            apple.takeABite();
            apple.takeABite();
            apple.takeABite();


            assertThrows(TrognonException.class, () -> {
                apple.takeABite();
            });
        }

        {
            Apple apple = new Apple(Apple.DEFAULT_COLOUR, 1);
            

            assertThrows(TrognonException.class, () -> {
                apple.takeABite();
            });
        }
    }
}