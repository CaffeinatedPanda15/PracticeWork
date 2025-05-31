package za.ac.cput.factory;

import za.ac.cput.domain.Car;
import za.ac.cput.util.Helper;

public class CarFactory {
    public static Car createCar(String carName, String carModel, String carBrand, String carColour, int carYear) {
        if (Helper.isNullorEmpty(carName) || Helper.isNullorEmpty(carBrand) || Helper.isNullorEmpty(carModel)
        || Helper.isNullorEmpty(carColour))
            return null;
        return new Car.Builder()
                .setCarName(carName)
                .setCarModel(carModel)
                .setCarBrand(carBrand)
                .setCarColour(carColour)
                .setCarYear(carYear)
                .build();
    }
}//end of class
