package com.codegym.com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users= new ArrayList<>();
        User u1 = new User();
        u1.setAge(11);
        u1.setName("dung");
        u1.setAccount("dung");
        u1.setEmail("dung@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(11);
        u2.setName("dung");
        u2.setAccount("dung");
        u2.setEmail("dung@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

    }
    public static User checkLogin(Login login){
        for (User u :users){
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
