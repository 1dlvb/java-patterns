package ru.patterns.builder;

import java.util.List;

/**
 * Implementation of a Guitar builder interface for electric guitars
 * @author Matushkin Anton
 */
public class ElectricGuitarBuilder implements GuitarBuilder {

    private String modelName;

    /**
     * NULL by default.
     */
    private List<PickupType> pickups;

    /**
     * Default value for strings for electric guitar is 6
     */
    private int numberOfStrings = 6;

    /**
     * Default color for electric guitar is sunburst
     */
    private GuitarColor color = GuitarColor.SUNBURST;

    /**
     * Default color for neck wood of an electric guitar is maple
     */
    private GuitarNeckWood guitarNeckWood = GuitarNeckWood.MAPLE;

    /**
     * Default color for body wood of an electric guitar is maple
     */
    private GuitarBodyWood guitarBodyWood = GuitarBodyWood.ASH;

    /**
     * Guitar has no whammy bar by default
     */
    private Boolean hasWhammyBar = false;

    @Override
    public GuitarBuilder setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Override
    public GuitarBuilder setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        return this;
    }

    @Override
    public GuitarBuilder setPickups(List<PickupType> pickups) {
        this.pickups = pickups;
        return this;
    }

    @Override
    public GuitarBuilder setColor(GuitarColor color) {
        this.color = color;
        return this;
    }

    @Override
    public GuitarBuilder setGuitarNeckWood(GuitarNeckWood neckWood) {
        this.guitarNeckWood = neckWood;
        return this;
    }

    @Override
    public GuitarBuilder setGuitarBodyWood(GuitarBodyWood bodyWood) {
        this.guitarBodyWood = bodyWood;
        return this;
    }

    @Override
    public GuitarBuilder setHasWhammyBar(Boolean hasWhammyBar) {
        this.hasWhammyBar = hasWhammyBar;
        return this;
    }

    @Override
    public Guitar build() {
        return new Guitar(modelName, numberOfStrings, pickups, color, guitarNeckWood,
                guitarBodyWood, hasWhammyBar);
    }

}
