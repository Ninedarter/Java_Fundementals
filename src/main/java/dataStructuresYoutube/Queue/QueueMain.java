package dataStructuresYoutube.Queue;

import day13_1112.homeworkTogether.User;
import day14_1113.Car;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<User>washer = new LinkedList<>();
        washer.add(new User("LINAS",15,185));
        washer.add(new User("ANDRIUS",18,160));
        washer.add(new User("TOMA",25,185));
        washer.add(new User("AGNE",18,165));

        System.out.println(washer.peek() + " sarase pirmas ");
        System.out.println(washer.size());
        System.out.println("ismetam is saraso:" + washer.poll());
        System.out.println(washer.peek() + " sarase pirmas ");
        }

              
    }


