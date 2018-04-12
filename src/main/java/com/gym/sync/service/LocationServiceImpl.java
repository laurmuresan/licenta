package com.gym.sync.service;

import com.gym.sync.entity.Location;
import com.gym.sync.epo.LocationEpo;
import com.gym.sync.mapper.LocationEpoMapper;
import com.gym.sync.repository.LocationRepository;
import com.gym.sync.service.interfaces.ILocationService;
import jersey.repackaged.com.google.common.collect.Lists;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author laurmuresan
 */
@Service
@Transactional
public class LocationServiceImpl implements ILocationService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LocationServiceImpl.class);

    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private LocationEpoMapper locationEpoMapper;


    @Override
    public Location create(LocationEpo epo) {
        Location location = locationEpoMapper.toInternal(epo);
        LOGGER.info("Creating location: " + location + ".");
        return locationRepository.save(location);
    }

    @Override
    public List<LocationEpo> getAll() {
        LOGGER.info("Getting all locations.");
        return locationEpoMapper.toExternals(Lists.newArrayList(locationRepository.findAll()));
    }

    @Override
    public Location update(LocationEpo epo) {
        Location location = locationRepository.findOne(epo.getId());
        LOGGER.info("Updating location: " + location + ".");

        location.setAddress(epo.getAddress());
        location.setLatitude(epo.getLatitude());
        location.setLongitude(epo.getLongitude());

        return location;
    }

    @Override
    public Location delete(long id) {
        Location location = locationRepository.findOne(id);
        LOGGER.info("Deleting location: " + location + ".");
        locationRepository.delete(location);
        return location;
    }
}
