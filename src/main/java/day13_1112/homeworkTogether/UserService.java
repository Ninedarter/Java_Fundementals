package day13_1112.homeworkTogether;

import java.util.ArrayList;

public class UserService {

    //aprasysime meotda ,kuris grazin userius aukstesnius negu duotasis skaicius

    public ArrayList<User> getUsersTallaerThanGivenHeight(ArrayList<User> users, int heightMargin){
ArrayList<User> tallUsers = new ArrayList<>();
        for (User user : users) {
            if(user.height>= heightMargin){
                tallUsers.add(user);
            }
              }
   return tallUsers;
    }


}
