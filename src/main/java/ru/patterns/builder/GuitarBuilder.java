package ru.patterns.builder;

import java.util.List;

/**
 * Interface for creating guitars (building guitars)
 * Why do you need this pattern? The pattern allows
 * you to create complex objects step by step,
 * avoid long lists of parameters and large amount of constructors
 * @author Matushkin Anton
 */
public interface GuitarBuilder {

    /**
     * @param name name of a guitar
     * @return GuitarBuilder
     */
    GuitarBuilder setName(String name);

    /**
     * @param numberOfStrings number of strings of a guitar.
     * @return GuitarBuilder
     */
    GuitarBuilder setNumberOfStrings(int numberOfStrings);

    /**
     * @param pickups list of PickupType. PickupType is enum for pickups.
     *                Keep uninitialized for guitars with no pickups
     * @return GuitarBuilder
     */
    GuitarBuilder setPickups(List<PickupType> pickups);

    /**
     * @param color enum of guitar colors
     * @return GuitarBuilder
     */
    GuitarBuilder setColor(GuitarColor color);

    /**
     * @param neckWood enum for material of guitar neck
     * @return GuitarBuilder
     */
    GuitarBuilder setGuitarNeckWood(GuitarNeckWood neckWood);

    /**
     * @param bodyWood enum for material of guitar body
     * @return GuitarBuilder
     */
    GuitarBuilder setGuitarBodyWood(GuitarBodyWood bodyWood);

    /**
     * @param hasWhammyBar param for adding/not adding whammy bar to guitar. Guitar has whammy bar if this param is true
     * @return GuitarBuilder
     */
    GuitarBuilder setHasWhammyBar(Boolean hasWhammyBar);

    /**
     * @return new Guitar instance
     */
    Guitar build();

}
