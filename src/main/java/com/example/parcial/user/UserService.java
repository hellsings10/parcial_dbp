package com.example.parcial.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserOutputDTO createUser(UserInputDTO userInputDTO)
    {
        List<User> userList = userRepository.findAll();

        for(User currUser :userList)
        {
            if(Objects.equals(currUser.getUsername(), userInputDTO.getUsername()))
            {
                throw new RuntimeException();
            }

            if(Objects.equals(currUser.getEmail(), userInputDTO.getEmail()))
            {
                throw new RuntimeException();
            }
        }

        if(userInputDTO.getPassword().length() < 8)
        {
            throw new RuntimeException();
        }
        User user = new User();
        user.setUsername(userInputDTO.getUsername());
        user.setEmail(userInputDTO.getEmail());
        user.setPassword(userInputDTO.getPassword());
        user.setRole("ROLE_USER");

        userRepository.save(user);

        UserOutputDTO userOutputDTO = new UserOutputDTO();
        userOutputDTO.setEmail(user.getEmail());
        userOutputDTO.setId(user.getId());
        userOutputDTO.setEmail(user.getEmail());

        return userOutputDTO;
    }
}
