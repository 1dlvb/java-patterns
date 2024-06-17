package ru.patterns.decorator;

/**
 * Decorator for motorbikes tuned to dirt bikes
 * @author Matushkin Anton
 */
public class DirtBike implements Motorbike {

    /**
     * Represents how much speed will be decreased
     */
    private static final int SPEED_DECREASE = 2;
    private final Motorbike bike;

    public DirtBike(Motorbike bike) {
        this.bike = bike;
    }

    /**
     * @return speed of a motorbike divided by {@link #SPEED_DECREASE}
     */
    @Override
    public Integer getSpeed() {
        return bike.getSpeed() / SPEED_DECREASE;
    }

}
