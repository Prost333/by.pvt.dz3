package by.pvt.dz3;

import by.pvt.dz3.domain.Role;
import by.pvt.dz3.domain.User;
import by.pvt.dz3.repository.UserRepository;
import by.pvt.dz3.config.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=ApplicationContext.getInstance();
        UserRepository userRepository =applicationContext.getUserRepository();
        User user=new User(2,"dima","Dima","12","15", Role.ADMIN);
        userRepository.addUser(user);
        userRepository.saveUser();
        userRepository.showAllUsers();

    }
}