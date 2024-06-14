package ru.patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ElectricGuitarBuilderTest {

    @Test
    void isNameSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        String actualName = guitarBuilder.setModelName("Gibson")
                .build()
                .getModelName();
        Assertions.assertEquals("Gibson", actualName);
    }

    @Test
    void isNumberOfStringsSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        Integer actualNumberOfStrings = guitarBuilder.setNumberOfStrings(8)
                .build()
                .getNumberOfStrings();
        Assertions.assertEquals(8, actualNumberOfStrings);
    }

    @Test
    void isPickupsSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        List<PickupType> actualPickups = guitarBuilder
                .setPickups(List.of(PickupType.HUMBUCKER, PickupType.HUMBUCKER, PickupType.SINGLE))
                .build()
                .getPickups();
        Assertions.assertEquals(List.of(PickupType.HUMBUCKER, PickupType.HUMBUCKER, PickupType.SINGLE), actualPickups);
    }

    @Test
    void isColorSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        GuitarColor actualColor = guitarBuilder.setColor(GuitarColor.VINE)
                .build()
                .getColor();
        Assertions.assertEquals(GuitarColor.VINE, actualColor);
    }

    @Test
    void isGuitarNeckWoodSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        GuitarNeckWood actualNeckWood = guitarBuilder.setGuitarNeckWood(GuitarNeckWood.MAHOGANY)
                .build()
                .getGuitarNeckWood();
        Assertions.assertEquals(GuitarNeckWood.MAHOGANY, actualNeckWood);
    }

    @Test
    void isGuitarBodyWoodSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        GuitarBodyWood actualBodyWood = guitarBuilder.setGuitarBodyWood(GuitarBodyWood.BASSWOOD)
                .build()
                .getGuitarBodyWood();
        Assertions.assertEquals(GuitarBodyWood.BASSWOOD, actualBodyWood);
    }

    @Test
    void isHasWhammyBarSetViaGuitarBuilder() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        Boolean actualHasWhammyBar = guitarBuilder.setHasWhammyBar(true)
                .build()
                .getHasWhammyBar();
        Assertions.assertEquals(true, actualHasWhammyBar);
    }

    @Test
    void isElectricGuitarBuilderCreatedInstanceIsEqualToGuitarInstance() {
        ElectricGuitarBuilder guitarBuilder = new ElectricGuitarBuilder();
        Guitar actualGuitar = guitarBuilder.setModelName("Fender")
                .setPickups(List.of(PickupType.SINGLE, PickupType.SINGLE, PickupType.SINGLE))
                .setColor(GuitarColor.OLIVE)
                .setGuitarBodyWood(GuitarBodyWood.MAHOGANY)
                .setGuitarNeckWood(GuitarNeckWood.MAPLE)
                .setHasWhammyBar(false)
                .build();

        Guitar expectedGuitar = new Guitar();
        expectedGuitar.setModelName("Fender");
        expectedGuitar.setNumberOfStrings(6);
        expectedGuitar.setPickups(List.of(PickupType.SINGLE, PickupType.SINGLE, PickupType.SINGLE));
        expectedGuitar.setColor(GuitarColor.OLIVE);
        expectedGuitar.setGuitarBodyWood(GuitarBodyWood.MAHOGANY);
        expectedGuitar.setGuitarNeckWood(GuitarNeckWood.MAPLE);
        expectedGuitar.setHasWhammyBar(false);

        Assertions.assertEquals(expectedGuitar, actualGuitar);
    }
    @Test
    void isInstanceCreatedByBuilderFromGuitarClassIsEqualToGuitarInstance() {
        Guitar actualGuitar = new Guitar.Builder()
                .setModelName("Fender")
                .setPickups(List.of(PickupType.SINGLE, PickupType.SINGLE, PickupType.SINGLE))
                .setColor(GuitarColor.OLIVE)
                .setGuitarBodyWood(GuitarBodyWood.MAHOGANY)
                .setGuitarNeckWood(GuitarNeckWood.MAPLE)
                .setHasWhammyBar(false)
                .build();

        Guitar expectedGuitar = new Guitar();
        expectedGuitar.setModelName("Fender");
        expectedGuitar.setNumberOfStrings(6);
        expectedGuitar.setPickups(List.of(PickupType.SINGLE, PickupType.SINGLE, PickupType.SINGLE));
        expectedGuitar.setColor(GuitarColor.OLIVE);
        expectedGuitar.setGuitarBodyWood(GuitarBodyWood.MAHOGANY);
        expectedGuitar.setGuitarNeckWood(GuitarNeckWood.MAPLE);
        expectedGuitar.setHasWhammyBar(false);

        Assertions.assertEquals(expectedGuitar, actualGuitar);
    }

}