package rtg.weather.app.rest.api.service;

import org.springframework.stereotype.Service;
import rtg.weather.app.rest.api.domain.model.Location;

@Service
public interface LocationService {

    Location findById(Long id);

    Location create(Location locationToCreate);
}
