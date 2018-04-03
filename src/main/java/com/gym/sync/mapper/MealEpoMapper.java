package com.gym.sync.mapper;

import com.gym.sync.entity.Meal;
import com.gym.sync.entity.MealType;
import com.gym.sync.epo.MealEpo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class MealEpoMapper extends GenericMapper<Meal, MealEpo> {

    @Autowired
    private FoodEpoMapper foodEpoMapper;

    @Override
    public Meal toInternal(MealEpo epo) {
        return new Meal(epo.getId(), epo.getCalories(), MealType.getTypeByName(epo.getMealType()),
                foodEpoMapper.toInternals(epo.getFoodList()));
    }

    @Override
    public MealEpo toExternal(Meal model) {
        return new MealEpo(model.getId(), model.getCalories(), MealType.getNameByType(model.getMealType()),
                foodEpoMapper.toExternals(model.getFoodList()));
    }
}
