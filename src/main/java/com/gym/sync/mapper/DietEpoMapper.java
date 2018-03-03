package com.gym.sync.mapper;

import com.gym.sync.entity.diet.Diet;
import com.gym.sync.epo.DietEpo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author laurmuresan
 */
public class DietEpoMapper  {

    public Diet toInternal (DietEpo epo){
        return new Diet(epo.getId(),epo.getName(),epo.getCalories(),epo.getDetails(),epo.getDietType());
    }

    public DietEpo toExternal (Diet model) {
        return new DietEpo(model.getId(),model.getName(),model.getCalories(),model.getDetails(),model.getDietType());
    }

    public List<Diet> toInternals(Collection<DietEpo> epoList){return null;}

    public List<DietEpo> toExternal (Collection<Diet> modelList){
        List<DietEpo> dietEpoList =  new ArrayList<>();
        for (Diet diet : modelList){
            dietEpoList.add(toExternal(diet));
        }
        return dietEpoList;
    }
}
