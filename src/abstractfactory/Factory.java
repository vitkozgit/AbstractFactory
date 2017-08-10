package abstractfactory;

import abstractfactory.cars.BrandCars;
import abstractfactory.cars.Car;
import abstractfactory.motorcycles.BrandMotorcycle;
import abstractfactory.motorcycles.Motorcycle;

public abstract class Factory {
    public abstract Car createCar(BrandCars brandCars);
    public abstract Motorcycle createMotorcycle(BrandMotorcycle brandMotorcycle);
}
