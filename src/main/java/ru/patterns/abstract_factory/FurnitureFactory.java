package ru.patterns.abstract_factory;

/**
 * Factory for creating set of furniture.
 * To use this interface create new factory class for set of furniture.
 * This factory must implement methods of the interface =>
 * You should create classes, which will be implementing {@link Chair}, {@link Sofa} and {@link Table} interfaces.
 * This instances of these classes will be created via your factory class.
 * @author Matushkin Anton
 */

public interface FurnitureFactory {

    /**
     * @return a new object, that implements Chair interface
     */
    Chair createChair();

    /**
     * @return a new object, that implements Sofa interface
     */
    Sofa createSofa();

    /**
     * @return a new object, that implements Table interface
     */
    Table createTable();

}
