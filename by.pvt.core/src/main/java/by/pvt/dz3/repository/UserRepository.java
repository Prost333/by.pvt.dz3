package by.pvt.dz3.repository;


import by.pvt.dz3.domain.User;
import by.pvt.dz3.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository extends FileWorker implements UserService {
    public static List<User> userList = new ArrayList<>();
    public static String way = "C:\\Project Java\\by.pvt.dz3\\by.pvt.core\\src\\main\\java\\by\\pvt\\dz3\\data\\Users.txt";


    public UserRepository() {
    }

    public User addUser(User user) {
        userList = update();
        userList.add(user);
        serializeObject(userList, way);
        return user;
    }

    public void deleteUser(User user) {
        userList = update();
        userList.remove(user);
        saveUser();
    }

    public List<User> AllUsers() {
        deserializeObject(way);
        return userList;
    }


    public List<User> showAllUsers() {
        System.out.println(deserializeObject(way));
        return userList;
    }

    public User findUserforID(int id) {
        List<User> users = update();
        Optional<User> users2 = userList.stream().filter(user -> user.getId() == id).findFirst();
        try {
            if (users2.isEmpty()) {
                System.out.println("Такого id не существует");
            } else {
                System.out.println(users2.get());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users2.get();
    }

    @Override
    public User createUser(int id,String login, String password, String name, String surname) {
        return null;
    }

    public User findUserforLogin(String login) {
        List<User> users = update();
        Optional<User> users2 = userList.stream().filter(user -> user.getLogin() == login).findFirst();
        try {
            if (users2.isEmpty()) {
                System.out.println("Такого Логина не существует");
            } else {
                System.out.println(users2.get());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users2.get();
    }


    public void saveUser() {
        serializeObject(userList, way);
        update();

    }

    public List<User> update() {
        Object object = deserializeObject(way);
        List<User> user = new ArrayList<>();
        if (object instanceof List<?>) {
            user = (List<User>) object;
        }
        return user;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "userList=" + userList +
                '}';
    }
}
