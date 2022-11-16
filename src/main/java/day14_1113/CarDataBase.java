package day14_1113;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarDataBase {


    public static final String PATH_TO_CAR_DATABASE = "src/main/resources/carsDataBase";
    public static ArrayList<Car> duomenys = new ArrayList<>();

    public static ArrayList<Car> populateCarsFromFile() throws IOException {

        FileReader fileReader = new FileReader(PATH_TO_CAR_DATABASE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readedline = bufferedReader.readLine();
        readedline = bufferedReader.readLine();
        while (readedline != null) {

            String[] splitedLine = readedline.split(",");
            Integer id = Integer.valueOf(splitedLine[0]);

            String brand = splitedLine[1];
            String model = splitedLine[2];
            String color = splitedLine[3];
            Integer weight = Integer.valueOf(splitedLine[4]);
            String origin = splitedLine[5];
            LocalDate date = LocalDate.parse(splitedLine[6]);
            Car carToAdd = new Car(id, brand, model, color, weight, origin, date);
           duomenys.add(carToAdd);

            readedline= bufferedReader.readLine();
        }
        return duomenys;

    }


}
