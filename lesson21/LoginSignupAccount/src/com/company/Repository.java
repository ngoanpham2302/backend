package com.company;

import java.util.ArrayList;

public class Repository {
    public ArrayList<User> getData() {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("annaswift", "anna123@gmail.com", "Anna@123"));
        userList.add(new User("davidcook", "cook337@yahoo.com", "Cook789#"));
        userList.add(new User("janicedoll", "jan2020@gmail.com", "Jan@1309"));
        userList.add(new User("hanahmar", "hanah78@gmail.com", "mar$7899D"));
        userList.add(new User("chrisoliver", "oliver23@yahoo.com", "Oliver@789"));

        return userList;
    }
}
