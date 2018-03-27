package com.gym.sync.mapper;

import com.gym.sync.entity.meal.Meal;
import com.gym.sync.entity.meal.MealType;
import com.gym.sync.epo.MealEpo;
import com.gym.sync.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class MealEpoMapper extends GenericMapper<Meal, MealEpo> {

    @Autowired
    private FoodEpoMapper foodEpoMapper;
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Meal toInternal(MealEpo epo) {
        return new Meal(epo.getId(), epo.getCalories(), MealType.getTypeByName(epo.getMealType()));
    }

    @Override
    public MealEpo toExternal(Meal model) {
        return new MealEpo(model.getId(), model.getCalories(), MealType.getNameByType(model.getMealType()),
                foodEpoMapper.toExternals(foodRepository.getAllByMealId(model.getId())));
    }
}
