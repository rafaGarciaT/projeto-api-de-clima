package rtg.weather.app.rest.api.service.impl;

import rtg.weather.app.rest.api.domain.model.Location;
import rtg.weather.app.rest.api.domain.repository.LocationRepository;
import rtg.weather.app.rest.api.service.LocationService;

import java.util.NoSuchElementException;

public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location findById(Long id) {
        return locationRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Location create(Location locationToCreate) {
        //if (locationToCreate.getId() != null && locationRepository.existsById(locationToCreate.getId())) {
            //throw new IllegalArgumentException("This Location ID already exists");
        //}
        return null;
    }
}
