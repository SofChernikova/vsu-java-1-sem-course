import cars.models.ElectricCar;
import cars.models.GasolineCar;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var carList = List.of(
                new GasolineCar(12, 2025, "Lada"),
                new ElectricCar(55, 2025, "Tesla"));
        carList.forEach(car -> {
            car.destination("New York");
            car.playMusic("Imagine Dragons - Believer");
            car.signal();
        });
    }
}