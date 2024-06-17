package ru.patterns.bridge;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private LogCaptor logCaptor;
    @AfterEach
    public void clearLogs() {
        logCaptor.clearLogs();
    }

    @Test
    void checkIfCatProtectItselfMethodLogsHitAndRunStrategy() {
        logCaptor = LogCaptor.forClass(Cat.class);
        Animal cat = new Cat(new HitAndRun(Cat.class));
        cat.protectItself();
        assertEquals("The cat is meowing...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Running...", logCaptor.getInfoLogs().get(2));
    }
    @Test
    void checkIfCatProtectItselfMethodLogsFeignedRetreatStrategy() {
        logCaptor = LogCaptor.forClass(Cat.class);
        Animal cat = new Cat(new FeignedRetreat(Cat.class));
        cat.protectItself();
        assertEquals("The cat is meowing...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Pretending to flee...", logCaptor.getInfoLogs().get(2));
    }
    @Test
    void checkIfDogProtectItselfMethodLogsHitAndRunStrategy() {
        logCaptor = LogCaptor.forClass(Dog.class);
        Animal dog = new Dog(new HitAndRun(Dog.class));
        dog.protectItself();
        assertEquals("The dog is barking...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Running...", logCaptor.getInfoLogs().get(2));
    }
    @Test
    void checkIfDogProtectItselfMethodLogsFeignedRetreatStrategy() {
        logCaptor = LogCaptor.forClass(Dog.class);
        Animal dog = new Dog(new FeignedRetreat(Dog.class));
        dog.protectItself();
        assertEquals("The dog is barking...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Pretending to flee...", logCaptor.getInfoLogs().get(2));
    }
    @Test
    void checkIfMooseProtectItselfMethodLogsHitAndRunStrategy() {
        logCaptor = LogCaptor.forClass(Moose.class);
        Animal moose = new Moose(new HitAndRun(Moose.class));
        moose.protectItself();
        assertEquals("The moose is yelling...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Running...", logCaptor.getInfoLogs().get(2));
    }
    @Test
    void checkIfMooseProtectItselfMethodLogsFeignedRetreatStrategy() {
        logCaptor = LogCaptor.forClass(Moose.class);
        Animal moose = new Moose(new FeignedRetreat(Moose.class));
        moose.protectItself();
        assertEquals("The moose is yelling...", logCaptor.getInfoLogs().get(0));
        assertEquals("Attacking...", logCaptor.getInfoLogs().get(1));
        assertEquals("Pretending to flee...", logCaptor.getInfoLogs().get(2));
    }

}