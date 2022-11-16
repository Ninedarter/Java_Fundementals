package day14_1113;


import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        CarDataBase.populateCarsFromFile();

        CarService carService = new CarService();
        carService.getAllCars(CarDataBase.duomenys);
        System.out.println(carService.findCarsByColor(CarDataBase.duomenys, "Blue"));
        carService.findOldestCar(CarDataBase.duomenys);
        System.out.println(carService.findOldestCar(CarDataBase.duomenys));
        System.out.println(carService.findHeaviestCar(CarDataBase.duomenys));
       carService.changeCarColor(CarDataBase.duomenys,15,"Red");
       carService.addCarAndUpdateFile();
       Car car  = new Car();
       // Gson gson = new  Gson().toJson(car);



    }
}
