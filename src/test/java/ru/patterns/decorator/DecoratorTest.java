package ru.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void isGetSpeedMethodReturnsMaxSpeedOfASimpleBike() {

        Motorbike bike = new SimpleBike();
        assertEquals(120, bike.getSpeed());

    }
    @Test
    void isGetSpeedMethodOfASportBikeReturnsDoubledMaxSpeedOfASimpleBike() {

        Motorbike bike = new SimpleBike();
        Motorbike bikeTunedToSportBike = new SportBike(bike);
        assertEquals(240, bikeTunedToSportBike.getSpeed());

    }
    @Test
    void isGetSpeedMethodOfADirtBikeReturnsReducedByHalfMaxSpeedOfASimpleBike() {

        Motorbike bike = new SimpleBike();
        Motorbike bikeTunedToDirtBike = new DirtBike(bike);
        assertEquals(60, bikeTunedToDirtBike.getSpeed());

    }
}