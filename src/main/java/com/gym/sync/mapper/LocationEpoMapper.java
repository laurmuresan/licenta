package com.gym.sync.mapper;

import com.gym.sync.entity.Location;
import com.gym.sync.epo.LocationEpo;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class LocationEpoMapper extends GenericMapper<Location, LocationEpo> {

    @Override
    public Location toInternal(LocationEpo epo) {
        return new Location(epo.getId(), epo.getAddress(), epo.getLongitude(), epo.getLatitude());
    }

    @Override
    public LocationEpo toExternal(Location model) {
        return new LocationEpo(model.getId(), model.getAddress(), model.getLongitude(), model.getLatitude());
    }
}
