package ru.patterns.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

/**
 * The Guitar class represents a guitar model with customizable features.
 * This class is used to create guitar objects with various parameters,
 * such as the number of strings, types of pickups, color, and materials for the body and neck.
 * <p>
 * Example usage:
 * <pre>
 * Guitar myGuitar = new Guitar.Builder()
 *                          .setModelName("Fender Stratocaster")
 *                          .setNumberOfStrings(6)
 *                          .setPickups(List.of(PickupType.SINGLE))
 *                          .setColor(GuitarColor.BLACK)
 *                          .setNeckWood(GuitarNeckWood.MAPLE)
 *                          .setBodyWood(GuitarBodyWood.ALDER)
 *                          .setWhammyBar(true)
 *                          .build();
 * </pre>
* </p>
* @author Matushkin Anton
*/
public class Guitar {

    private static final Logger LOGGER = LogManager.getLogger(Guitar.class);

    private String modelName;

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
     * @param modelName The modelName of the guitar brand.
     * @param numberOfStrings The number of strings on the guitar.
     * @param pickups The list of guitar pickups.
     * @param color The color of the guitar.
     * @param neckWood The material of the guitar neck.
     * @param bodyWood The material of the guitar body.
     * @param hasWhammyBar Whether the guitar has a whammy bar.
     */
    public Guitar(String modelName, int numberOfStrings, List<PickupType> pickups,
                  GuitarColor color, GuitarNeckWood neckWood, GuitarBodyWood bodyWood,
                  Boolean hasWhammyBar) {
        this.modelName = modelName;
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
        return numberOfStrings == guitar.numberOfStrings && Objects.equals(modelName, guitar.modelName)
                && Objects.equals(pickups, guitar.pickups) && color == guitar.color
                && guitarNeckWood == guitar.guitarNeckWood && guitarBodyWood == guitar.guitarBodyWood
                && Objects.equals(hasWhammyBar, guitar.hasWhammyBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, numberOfStrings, pickups, color, guitarNeckWood, guitarBodyWood, hasWhammyBar);
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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Boolean getHasWhammyBar() {
        return hasWhammyBar;
    }

    public void setHasWhammyBar(Boolean hasWhammyBar) {
        this.hasWhammyBar = hasWhammyBar;
    }

    /**
     * Internal builder for guitars
     */
    public static class Builder {

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

        public Builder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder setNumberOfStrings(int numberOfStrings) {
            this.numberOfStrings = numberOfStrings;
            return this;
        }

        public Builder setPickups(List<PickupType> pickups) {
            this.pickups = pickups;
            return this;
        }

        public Builder setColor(GuitarColor color) {
            this.color = color;
            return this;
        }

        public Builder setGuitarNeckWood(GuitarNeckWood neckWood) {
            this.guitarNeckWood = neckWood;
            return this;
        }

        public Builder setGuitarBodyWood(GuitarBodyWood bodyWood) {
            this.guitarBodyWood = bodyWood;
            return this;
        }

        public Builder setHasWhammyBar(Boolean hasWhammyBar) {
            this.hasWhammyBar = hasWhammyBar;
            return this;
        }

        public Guitar build() {
            return new Guitar(modelName, numberOfStrings, pickups, color, guitarNeckWood,
                    guitarBodyWood, hasWhammyBar);
        }
    }

}
