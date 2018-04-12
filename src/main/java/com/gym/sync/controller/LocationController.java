package com.gym.sync.controller;

import com.gym.sync.entity.Location;
import com.gym.sync.epo.LocationEpo;
import com.gym.sync.service.interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/location")
@RequestMapping(value = "/location")
public class LocationController implements ICrudController<Location, LocationEpo> {

    @Autowired
    private ILocationService locationService;

    @Override
    public Location create(LocationEpo epo) {
        return locationService.create(epo);
    }

    @Override
    public List<LocationEpo> getAll() {
        return locationService.getAll();
    }

    @Override
    public Location update(LocationEpo epo) {
        return locationService.update(epo);
    }

    @Override
    public Location delete(long id) {
        return locationService.delete(id);
    }
}
