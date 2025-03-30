package rtg.weather.app.rest.api.service;

import rtg.weather.app.rest.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
