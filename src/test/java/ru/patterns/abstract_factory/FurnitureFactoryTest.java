package ru.patterns.abstract_factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FurnitureFactoryTest {
    FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
    FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();

    @Test
    void isNumberOfLegsOfVictorianChairIs4() {
        Chair chair = victorianFurnitureFactory.createChair();
        chair.sitOn();
        Assertions.assertEquals(4, chair.legsCount());
    }

    @Test
    void isNumberOfLegsOfVictorianSofaIs4() {
        Sofa sofa = victorianFurnitureFactory.createSofa();
        sofa.sitOn();
        sofa.lieOn();
        Assertions.assertEquals(4, sofa.legsCount());
    }

    @Test
    void isNumberOfLegsOfVictorianTableIs1() {
        Table table = victorianFurnitureFactory.createTable();
        table.sitAt();
        Assertions.assertEquals(1, table.legsCount());
    }
    @Test
    void isNumberOfLegsOfModernChairIs3() {
        Chair chair = modernFurnitureFactory.createChair();
        chair.sitOn();
        Assertions.assertEquals(3, chair.legsCount());
    }

    @Test
    void isNumberOfLegsOfModernSofaIs8() {
        Sofa sofa = modernFurnitureFactory.createSofa();
        sofa.sitOn();
        sofa.lieOn();
        Assertions.assertEquals(8, sofa.legsCount());
    }

    @Test
    void isNumberOfLegsOfVictorianTableIs4() {
        Table table = modernFurnitureFactory.createTable();
        table.sitAt();
        Assertions.assertEquals(4, table.legsCount());
    }

}