package rtg.weather.app.rest.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rtg.weather.app.rest.api.domain.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
