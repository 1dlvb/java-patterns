package ru.patterns.decorator;

/**
 * Decorator for motorbikes tuned to sport bikes.
 * @author Matushkin Anton
 */
public class SportBike implements Motorbike {

    /**
     * Represents how much speed will be boosted.
     */
    private static final int SPEED_BOOST = 2;
    private final Motorbike bike;
    public SportBike(Motorbike bike) {
        this.bike = bike;
    }

    /**
     * @return speed of a motorbike multiplied by {@link #SPEED_BOOST}.
     */
    @Override
    public Integer getSpeed() {
        return bike.getSpeed() * SPEED_BOOST;
    }

}
