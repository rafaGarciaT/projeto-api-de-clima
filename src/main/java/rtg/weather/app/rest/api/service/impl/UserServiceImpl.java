package rtg.weather.app.rest.api.service.impl;

import rtg.weather.app.rest.api.service.UserService;
import rtg.weather.app.rest.api.domain.repository.UserRepository;
import rtg.weather.app.rest.api.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByEmail(userToCreate.getEmail())) {
            throw new IllegalArgumentException("There's already an existing account with this email.");
        }
        return userRepository.save(userToCreate);
    }
}
