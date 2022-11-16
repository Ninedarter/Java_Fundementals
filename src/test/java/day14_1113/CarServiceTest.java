package day14_1113;

import day12_1105.homework.Patient;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

  @BeforeClass
    public static ArrayList<Car> createSampleData(){
      ArrayList<Car> sampleCars = new ArrayList<>();
      Car car1 = new Car(1, "Mitsubishi", "Mirage", "Red", 5209, "Latvia", LocalDate.parse("2019-03-18"));
      Car car2 = new Car(2, "Volvo", "Tanke", "Black", 3629, "Lithuania", LocalDate.parse("2020-06-28"));
      Car car3 = new Car(3, "Mazda", "CRX", "Red", 1234, "Latvia", LocalDate.parse("2000-05-18"));
      Car car4 = new Car(4, "Seat", "Ibiza", "Blue", 5209, "Estonia", LocalDate.parse("2010-11-10"));
      Car car5 = new Car(5, "Mitsubishi", "Mirage", "Red", 2509, "Belarus", LocalDate.parse("2020-06-28"));
      Car car6 = new Car(6, "Lada", "Niva", "Orange", 1509, "Russia", LocalDate.parse("1999-01-01"));

      sampleCars.add(car1);
      sampleCars.add(car2);
      sampleCars.add(car3);

return sampleCars;
  }
    ArrayList<Car> sampleCarsList = createSampleData();
    CarService carService = new CarService();
    @Test
    void findCarsByColor() {
      ArrayList<Car> actualCarsByColor = carService.findCarsByColor(sampleCarsList,"Red");
      assertEquals("Red",actualCarsByColor.get(0).getColor());
      assertEquals(1,actualCarsByColor.get(0).getId());
     // assertEquals(3, actualCarsByColor.size());

    }

    @Test
    void findCarsByModel() {
        ArrayList<Car> actualCarsByModel =carService.findCarsByModel(sampleCarsList,"Tanke");
        assertEquals("Tanke", actualCarsByModel.get(0).getModel());
        assertEquals(2,actualCarsByModel.get(0).getId());

    }

    @Test
    void findCarsByMake() {
    }

    @Test
    void findCarsHeavierThanGivenWeight() {
    }

    @Test
    void findCarsNewerThanGivenDate() {
    }

    @Test
    void findCarsFromGivenCountry() {
    }

    @Test
    void findOldestCar() {
    }

    @Test
    void findHeaviestCar() {
    }

    @Test
    void changeCarColor() {
    }

    @Test
    void addCarAndUpdateFile() {
    }
}