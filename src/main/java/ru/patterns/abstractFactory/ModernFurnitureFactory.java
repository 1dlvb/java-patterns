package ru.patterns.abstractFactory;

/**
 * Furniture factory, that should be used to create modern furniture bundles
 * @author Matushkin Anton
 */
public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

}
