package by.pvt.dz3.service.imp;

import by.pvt.dz3.domain.Role;
import by.pvt.dz3.domain.User;
import by.pvt.dz3.mapping.UserMapping;
import by.pvt.dz3.repository.UserRepository;
import by.pvt.dz3.service.UserService;

import java.util.List;

public class UserServerImp implements UserService {
    private UserRepository userRepository;
    private UserMapping userMapping;

    public UserServerImp(UserRepository userRepository, UserMapping userMapping) {
        this.userRepository = userRepository;
        this.userMapping = userMapping;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserMapping getUserMapping() {
        return userMapping;
    }

    public void setUserMapping(UserMapping userMapping) {
        this.userMapping = userMapping;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> showAllUsers() {
        return null;
    }

    @Override
    public User findUserforID(int id) {
        return null;
    }

    @Override
    public User createUser(int id, String login, String password, String name, String surname) {
        User user = new User(id,name,surname,password,login, Role.CLIENT);
        return user;
    }
}
