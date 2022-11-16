package day13_1112.homeworkTogether;

import java.io.IOException;
import java.util.ArrayList;

import static day13_1112.homeworkTogether.UserDataBase.users;

public class Main {
    public static void main(String[] args) throws IOException {
        UserDataBase.populateUsersFromFile();
        System.out.println(users);


        UserService userService  = new UserService();
//svarbu kaip parametras UserDataBase.users
ArrayList<User> rastiAukstiUseriai = userService.getUsersTallaerThanGivenHeight(users,195);

        System.out.println(rastiAukstiUseriai);

    }
}
