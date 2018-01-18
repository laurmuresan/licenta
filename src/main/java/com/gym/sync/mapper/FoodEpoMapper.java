package com.gym.sync.mapper;

import com.gym.sync.entity.food.Food;
import com.gym.sync.entity.food.FoodType;
import com.gym.sync.entity.food.Vitamin;
import com.gym.sync.epo.FoodEpo;
import com.gym.sync.epo.list.VitaminEpoList;
import com.gym.sync.repository.VitaminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FoodEpoMapper{
    @Autowired
    private VitaminEpoMapper vitaminEpoMapper;
    @Autowired
    private VitaminRepository vitaminRepository;

    public Food toInternal(FoodEpo epo) {
        return new Food(epo.getId(),epo.getName(),FoodType.getTypeByName(epo.getFoodType()),epo.getCalories(),
                epo.getSaturatedFat(),epo.getTransFat(),epo.getCholesterol(),epo.getSodium(),
                epo.getDietaryFiber(),epo.getSugars(),epo.getProtein());
    }

    public FoodEpo toExternal(Food model, List<Vitamin>vitaminList) {
        VitaminEpoList vitaminEpoList = new VitaminEpoList(vitaminEpoMapper.toExternals(vitaminList));
        return new FoodEpo(model.getId(),model.getName(),FoodType.getNameByType(model.getFoodType()),
                model.getCalories(),model.getSaturatedFat(),model.getTransFat(),
                model.getCholesterol(),model.getSodium(),model.getDietaryFiber(),
                model.getSugars(),model.getProtein(),vitaminEpoList);
    }

    public List<Food> toInternals(Collection<FoodEpo> epoList) {
        return null;
    }

    public List<FoodEpo> toExternals(Collection<Food> modelList) {
        List<FoodEpo> foodEpoList = new ArrayList<>();
        for (Food food : modelList){
            foodEpoList.add(toExternal(food,vitaminRepository.findVitaminByFood(food.getId()));
        }
        return foodEpoList;
    }
}
