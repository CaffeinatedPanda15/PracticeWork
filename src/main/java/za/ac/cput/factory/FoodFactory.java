package za.ac.cput.factory;

import za.ac.cput.domain.Food;
import za.ac.cput.util.Helper;

public class FoodFactory {
    public static Food createFood(String foodName, String foodGroup, int foodCalories) {
        if (Helper.isNullorEmpty(foodName) || Helper.isNullorEmpty(foodGroup))
        return null;
        return new Food.Builder()
                .setFoodName(foodName)
                .setFoodGroup(foodGroup)
                .setFoodCalories(foodCalories)
                .build();
    }
}
