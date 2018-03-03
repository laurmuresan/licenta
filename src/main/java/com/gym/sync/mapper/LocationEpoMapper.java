package com.gym.sync.mapper;

import com.gym.sync.entity.utility.Location;
import com.gym.sync.epo.LocationEpo;

/**
 * @author laurmuresan
 */
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
