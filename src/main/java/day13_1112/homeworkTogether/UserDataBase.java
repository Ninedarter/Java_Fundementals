package day13_1112.homeworkTogether;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDataBase {

    public static ArrayList<User> users = new ArrayList<>();

    public static void populateUsersFromFile() throws IOException {
        FileReader fr = new FileReader("src/main/resources/users.txt");
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();
        while (currentLine != null) {
            String[] isskaidytaEilute = currentLine.split(";");
            String name = isskaidytaEilute[0];
            int age = Integer.parseInt(isskaidytaEilute[1]);
            int height = Integer.parseInt(isskaidytaEilute[2]);
            users.add(new User(name, age, height));
            currentLine = br.readLine();

        }


    }
}


