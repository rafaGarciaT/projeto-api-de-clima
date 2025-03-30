package rtg.weather.app.rest.api.domain.repository;

import rtg.weather.app.rest.api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String Email);
}
