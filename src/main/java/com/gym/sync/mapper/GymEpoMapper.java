package com.gym.sync.mapper;

import com.gym.sync.entity.gym.Gym;
import com.gym.sync.entity.gym.GymType;
import com.gym.sync.entity.utility.Location;
import com.gym.sync.epo.GymEpo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author laurmuresan
 */
public class GymEpoMapper {

    @Autowired
    private LocationEpoMapper locationEpoMapper;

    public Gym toInternal(GymEpo epo) {
        return new Gym(epo.getId(), epo.getName(), locationEpoMapper.toInternal(epo.getLocation()), epo.getWebsite(), epo.getDetails(), epo.getPhone(), GymType.getTypeByName(epo.getGymType()), epo.getMondayFridayOpen(), epo.getMondayFridayClose(), epo.getSaturdayOpen(), epo.getSaturdayClose(), epo.getSundayOpen(), epo.getSundayClose());
    }

    public GymEpo toExternal(Gym model) {
        return new GymEpo(model.getId(), model.getName(), locationEpoMapper.toExternal(model.getLocation()), model.getWebsite(), model.getDetails(), model.getPhone(), GymType.getNameByType(model.getGymType()), model.getMondayFridayOpen(), model.getMondayFridayClose(), model.getSaturdayOpen(), model.getSaturdayClose(), model.getSundayOpen(), model.getSundayClose());
    }

    public List<Gym> toInternals(Collection<GymEpo> epoList) {
        return null;
    }

    public List<GymEpo> toExternals(Collection<Gym> modelList){
        List<GymEpo> gymEpoList = new ArrayList<>();
        for (Gym gym : modelList) {
            gymEpoList.add(toExternal(gym));
        }
        return gymEpoList;
    }


}
