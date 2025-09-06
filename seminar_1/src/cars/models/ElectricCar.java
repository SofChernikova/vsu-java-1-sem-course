package cars.models;

import cars.Car;

public class ElectricCar extends Car {

    public ElectricCar(double speed, int year, String model) {
        super(speed, year, model);
    }

    @Override
    public void destination(String d) {
        System.out.println("Electric car's destination is " + d);
    }
}
