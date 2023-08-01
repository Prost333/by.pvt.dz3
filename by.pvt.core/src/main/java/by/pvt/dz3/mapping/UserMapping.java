package by.pvt.dz3.mapping;

import by.pvt.hw3.domain.Role;
import by.pvt.hw3.domain.User;
import by.pvt.hw3.dto.UserRequest;
import by.pvt.hw3.dto.UserResponse;
import by.pvt.hw3.repository.UserRepository;

public class UserMapping {
    public UserResponse responseUser(User user) {
        UserResponse userResponse = new UserResponse(user.getId(), user.getName() + " " + user.getSurname()
                , user.getLogin(), Role.CLIENT);
        return userResponse;
    }

    public User requestUser(UserRequest userRequest) {
        UserRepository userRepository = new UserRepository();
        return userRepository.findUserforLogin(userRequest.getLogin());
    }
}

