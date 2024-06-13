package ru.patterns.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

/**
 * The Guitar class represents a guitar model with customizable features.
 * This class is used to create guitar objects with various parameters,
 * such as the number of strings, types of pickups, color, and materials for the body and neck.
 */
public class Guitar {

    private static final Logger LOGGER = LogManager.getLogger(Guitar.class);

    /**
     * Name of a guitar model
     */
    private String name;

    /**
     * Amount of strings of a guitar
     */
    private int numberOfStrings;

    /**
     * List of pickups of a guitar. Keep uninitialized for guitars with no pickups
     * @see PickupType
     */
    private List<PickupType> pickups;

    /**
     * Enum for color of a guitar.
     * @see GuitarColor
     */
    private GuitarColor color;

    /**
     * Enum for neck material of a guitar
     * @see GuitarNeckWood
     */
    private GuitarNeckWood guitarNeckWood;

    /**
     * Enum for body material of a guitar
     * @see GuitarBodyWood
     */
    private GuitarBodyWood guitarBodyWood;

    /**
     * Use for adding/not adding whammy bar to guitar.
     * Guitar has whammy bar if this value is true
     */
    private Boolean hasWhammyBar;

    public Guitar() {}

    /**
     * Constructor for creating a Guitar object with specified parameters.
     * @param guitarName The name of the guitar brand.
     * @param numberOfStrings The number of strings on the guitar.
     * @param pickups The list of guitar pickups.
     * @param color The color of the guitar.
     * @param neckWood The material of the guitar neck.
     * @param bodyWood The material of the guitar body.
     * @param hasWhammyBar Whether the guitar has a whammy bar.
     */
    public Guitar(String guitarName, int numberOfStrings, List<PickupType> pickups,
                  GuitarColor color, GuitarNeckWood neckWood, GuitarBodyWood bodyWood,
                  Boolean hasWhammyBar) {
        this.name = guitarName;
        this.numberOfStrings = numberOfStrings;
        this.pickups = pickups;
        this.color = color;
        this.guitarNeckWood = neckWood;
        this.guitarBodyWood = bodyWood;
        this.hasWhammyBar = hasWhammyBar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Guitar guitar = (Guitar) o;
        return numberOfStrings == guitar.numberOfStrings && Objects.equals(name, guitar.name)
                && Objects.equals(pickups, guitar.pickups) && color == guitar.color
                && guitarNeckWood == guitar.guitarNeckWood && guitarBodyWood == guitar.guitarBodyWood
                && Objects.equals(hasWhammyBar, guitar.hasWhammyBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStrings, pickups, color, guitarNeckWood, guitarBodyWood, hasWhammyBar);
    }

    /**
     * Method for playing music
     */
    public void playMusic() {
        LOGGER.info("The guitar is playing the music..");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public List<PickupType> getPickups() {
        return pickups;
    }

    public void setPickups(List<PickupType> pickups) {
        this.pickups = pickups;
    }

    public GuitarColor getColor() {
        return color;
    }

    public GuitarBodyWood getGuitarBodyWood() {
        return guitarBodyWood;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void setColor(GuitarColor color) {
        this.color = color;
    }

    public GuitarNeckWood getGuitarNeckWood() {
        return guitarNeckWood;
    }

    public void setGuitarNeckWood(GuitarNeckWood guitarNeckWood) {
        this.guitarNeckWood = guitarNeckWood;
    }

    public void setGuitarBodyWood(GuitarBodyWood guitarBodyWood) {
        this.guitarBodyWood = guitarBodyWood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasWhammyBar() {
        return hasWhammyBar;
    }

    public void setHasWhammyBar(Boolean hasWhammyBar) {
        this.hasWhammyBar = hasWhammyBar;
    }

}
