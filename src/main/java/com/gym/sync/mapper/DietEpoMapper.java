package com.gym.sync.mapper;

import com.gym.sync.entity.Diet;
import com.gym.sync.entity.DietType;
import com.gym.sync.epo.DietEpo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class DietEpoMapper extends GenericMapper<Diet, DietEpo> {

    @Autowired
    private MealEpoMapper mealEpoMapper;

    public Diet toInternal(DietEpo epo) {
        return new Diet(epo.getId(), epo.getName(), epo.getCalories(), epo.getDetails(),
                DietType.getTypeByName(epo.getDietType()), mealEpoMapper.toInternals(epo.getMealList()));
    }

    public DietEpo toExternal(Diet model) {
        return new DietEpo(model.getId(), model.getName(), model.getCalories(), model.getDetails(),
                DietType.getNameByType(model.getDietType()),
                mealEpoMapper.toExternals(model.getMealList()));
    }
}
