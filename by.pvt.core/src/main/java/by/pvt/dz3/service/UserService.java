package by.pvt.dz3.service;




import by.pvt.dz3.domain.User;

import java.util.List;

public interface UserService {
 User addUser(User user);

 void deleteUser(User user);
 List<User> showAllUsers();
 User findUserforID(int id);
 User createUser(int id,String login, String password, String name, String surname);

}

