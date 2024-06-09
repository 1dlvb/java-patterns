package ru.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryTest {
        @Test
        public void planeFactoryTest() {
            LogisticsFactory<FlyingTransport> planeFactory = new PlaneFactory();
            FlyingTransport plane = planeFactory.createTransport();
            plane.deliver();
            plane.takeOff();
            plane.fly();
            plane.land();
            Assertions.assertTrue(plane instanceof Plane);
        }
        @Test
        public void truckFactoryTest() {
            LogisticsFactory<RollingTransport> truckFactory = new TruckFactory();
            RollingTransport truck = truckFactory.createTransport();
            truck.deliver();
            truck.accelerate();
            truck.roll();
            truck.brake();
            Assertions.assertTrue(truck instanceof Truck);
        }

}