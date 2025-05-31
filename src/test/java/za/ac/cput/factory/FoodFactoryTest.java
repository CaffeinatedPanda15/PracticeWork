package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Food;

import static org.junit.jupiter.api.Assertions.*;

class FoodFactoryTest {

    private static Food f1 = FoodFactory.createFood("Carrot", "Vegetable", 300);

    @Test
    public void testCreateFood() {
        assertNotNull(f1);

        System.out.println(f1);
    }
}