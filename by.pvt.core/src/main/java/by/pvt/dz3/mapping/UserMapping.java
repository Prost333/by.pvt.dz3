package by.pvt.dz3.mapping;

import by.pvt.dz3.domain.Role;
import by.pvt.dz3.domain.User;
import by.pvt.dz3.dto.UserRequest;
import by.pvt.dz3.dto.UserResponse;
import by.pvt.dz3.repository.UserRepository;

public class UserMapping {
    public UserResponse responseUser(User user) {
        UserResponse userResponse = new UserResponse(user.getId(), user.getName() + " " + user.getSurname()
                , user.getLogin());
        return userResponse;
    }

    public User requestUser(UserRequest userRequest) {
        UserRepository userRepository = new UserRepository();
        return userRepository.findUserforLogin(userRequest.getLogin());
    }
}

