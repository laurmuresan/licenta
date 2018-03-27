package com.gym.sync.mapper;

import com.gym.sync.entity.diet.Diet;
import com.gym.sync.entity.diet.DietType;
import com.gym.sync.epo.DietEpo;
import com.gym.sync.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class DietEpoMapper extends GenericMapper<Diet, DietEpo> {

    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private MealEpoMapper mealEpoMapper;

    public Diet toInternal(DietEpo epo) {
        return new Diet(epo.getId(), epo.getName(), epo.getCalories(), epo.getDetails(),
                DietType.getTypeByName(epo.getDietType()));
    }

    public DietEpo toExternal(Diet model) {
        return new DietEpo(model.getId(), model.getName(), model.getCalories(), model.getDetails(),
                DietType.getNameByType(model.getDietType()),
                mealEpoMapper.toExternals(mealRepository.getAllByDietId(model.getId())));
    }
}
