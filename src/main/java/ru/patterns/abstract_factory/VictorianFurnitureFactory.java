package ru.patterns.abstract_factory;

/**
 * Furniture factory, that should be used to create Victorian furniture bundles
 * @author Matushkin Anton
 */
public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

}
