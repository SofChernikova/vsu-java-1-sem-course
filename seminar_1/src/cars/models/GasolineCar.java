package cars.models;

import cars.Car;

public class GasolineCar extends Car {

    public GasolineCar(double speed, int year, String model) {
        super(speed, year, model);
    }

    @Override
    public void destination(String d) {
        System.out.println("Gasoline car's destination is " + d);
    }
}
