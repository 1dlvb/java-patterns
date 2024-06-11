package ru.patterns.abstractFactory;

/**
 * Factory for creating set of furniture.
 * To use this interface create new factory class for set of furniture.
 * This factory must implement methods of the interface =>
 * You should create classes, which will be implementing {@link Chair}, {@link Sofa} and {@link Table} interfaces.
 * This instances of these classes will be created via your factory class.
 * @author Matushkin Anton
 */

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();

}
