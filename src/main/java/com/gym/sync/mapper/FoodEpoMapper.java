package com.gym.sync.mapper;

import com.gym.sync.entity.food.Food;
import com.gym.sync.entity.food.FoodType;
import com.gym.sync.epo.FoodEpo;
import com.gym.sync.repository.VitaminRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author laurmuresan
 */
public class FoodEpoMapper extends GenericMapper<Food, FoodEpo> {

    @Autowired
    private VitaminEpoMapper vitaminEpoMapper;

    public Food toInternal(FoodEpo epo) {
        return new Food(epo.getId(), epo.getName(), FoodType.getTypeByName(epo.getFoodType()), epo.getCalories(),
                epo.getSaturatedFat(), epo.getTransFat(), epo.getCholesterol(), epo.getSodium(),
                epo.getDietaryFiber(), epo.getSugars(), epo.getProtein(),
                vitaminEpoMapper.toInternals(epo.getVitaminList()));
    }

    public FoodEpo toExternal(Food model) {
        return new FoodEpo(model.getId(), model.getName(), FoodType.getNameByType(model.getFoodType()),
                model.getCalories(), model.getSaturatedFat(), model.getTransFat(), model.getCholesterol(),
                model.getSodium(), model.getDietaryFiber(), model.getSugars(), model.getProtein(),
                vitaminEpoMapper.toExternals(model.getVitaminList()));
    }
}
