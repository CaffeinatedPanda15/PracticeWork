package za.ac.cput.domain;

public class Food {

    private String foodName;
    private String foodGroup;
    private int foodCalories;

    private Food () {
    }

    private Food(Builder build) {
        this.foodName = build.foodName;
        this.foodGroup = build.foodGroup;
        this.foodCalories = build.foodCalories;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    public int getFoodCalories() {
        return foodCalories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodGroup='" + foodGroup + '\'' +
                ", foodCalories=" + foodCalories +
                '}';
    }

    public static class Builder {
        private String foodName;
        private String foodGroup;
        private int foodCalories;

        public Builder setFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public Builder setFoodGroup(String foodGroup) {
            this.foodGroup = foodGroup;
            return this;
        }

        public Builder setFoodCalories(int foodCalories) {
            this.foodCalories = foodCalories;
            return this;
        }

        public Builder copy(Food food) {
            this.foodName = food.foodName;
            this.foodGroup = food.foodGroup;
            this.foodCalories = food.foodCalories;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }//end of builder class
}//end of class
