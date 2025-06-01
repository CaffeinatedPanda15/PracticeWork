package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements IRepository<Car, String>{

    public static IRepository repository = null;

    private List<Car> CarList;

    private CarRepository() {
        this.CarList = new ArrayList<Car>();
    }

    public static IRepository getRepository() {
        if ( repository == null) {
            repository = new CarRepository();
        }
        return repository;
    }

    @Override
    public Car create(Car car) {
        boolean success = CarList.add(car);
        if (success) {
            return car;
        }
        return null;
    }

    @Override
    public Car read(String CarName) {
       for (Car c : CarList) {
           if (c.getCarName().equals(CarName));
           return c;
       }
       return null;
    }

    @Override
    public Car update(Car car) {
        String name = car.getCarName();
        Car carOld = read(name);
        if (carOld == null)
            return null;

        boolean success = delete(name);
        if (success) {
            if (CarList.add(car))
                return car;
        }
        return null;
    }

    @Override
    public Boolean delete(String carName) {
        Car carToDelete = read(carName);
        if (carToDelete == null)
            return false;
        return (CarList.remove(carName));
    }
}
