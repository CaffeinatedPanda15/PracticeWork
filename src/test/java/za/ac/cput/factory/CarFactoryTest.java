package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    private static Car c1 = CarFactory.createCar("Porsche", "Toyota",
                                                    "Japan", "Red", 1999);

    @Test
    public void testCreateCar() {
        assertNotNull(c1);

        System.out.println(c1.toString());
    }

}