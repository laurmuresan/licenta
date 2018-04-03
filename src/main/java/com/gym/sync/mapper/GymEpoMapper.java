package com.gym.sync.mapper;

import com.gym.sync.entity.Gym;
import com.gym.sync.entity.GymType;
import com.gym.sync.epo.GymEpo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class GymEpoMapper extends GenericMapper<Gym, GymEpo> {

    @Autowired
    private LocationEpoMapper locationEpoMapper;
    @Autowired
    private CompanyEpoMapper companyEpoMapper;

    public Gym toInternal(GymEpo epo) {
        return new Gym(epo.getId(), epo.getName(), locationEpoMapper.toInternal(epo.getLocation()), epo.getWebsite(),
                epo.getDetails(), epo.getPhone(), GymType.getTypeByName(epo.getGymType()), epo.getMondayFridayOpen(),
                epo.getMondayFridayClose(), epo.getSaturdayOpen(), epo.getSaturdayClose(), epo.getSundayOpen(),
                epo.getSundayClose(), companyEpoMapper.toInternal(epo.getCompany()));
    }

    public GymEpo toExternal(Gym model) {
        return new GymEpo(model.getId(), model.getName(), locationEpoMapper.toExternal(model.getLocation()),
                model.getWebsite(), model.getDetails(), model.getPhone(), GymType.getNameByType(model.getGymType()),
                model.getMondayFridayOpen(), model.getMondayFridayClose(), model.getSaturdayOpen(),
                model.getSaturdayClose(), model.getSundayOpen(), model.getSundayClose(),
                companyEpoMapper.toExternal(model.getCompany()));
    }
}
